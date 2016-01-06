package si.um.feri;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueReceiver;
import javax.jms.QueueSession;
import javax.jms.TextMessage;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class QReceiver {

	private String queueName;
	private QueueConnection queueConnection;
	private QueueSession queueSession;
	
	public QReceiver(String qName) {
		queueName=qName;
	}
	
    public void startConsuming() throws NamingException, JMSException {
    	if (queueConnection!=null) return;
    	InitialContext ctx=WSO2Util.getInitialContext(queueName);

		Queue queue = (Queue) ctx.lookup(queueName);
		QueueConnectionFactory connFactory = (QueueConnectionFactory) ctx.lookup(WSO2Util.CF_NAME);
		queueConnection = connFactory.createQueueConnection();
		queueSession = queueConnection.createQueueSession(false, QueueSession.AUTO_ACKNOWLEDGE);
		queueConnection.start();

        QueueReceiver qr=queueSession.createReceiver(queue);
		qr.setMessageListener(new MessageListener() {
			@Override
			public void onMessage(Message message) {
				try {
					QReceiver.this.onMessage(message);
				} catch (JMSException e) {
					e.printStackTrace();
				}
			}
		});
    }
    
    private void onMessage(Message m) throws JMSException {
    	if (m instanceof TextMessage) {
			TextMessage tm = (TextMessage) m;
			System.out.println("Got message from queue receiver==>" + tm.getText());
		} else {
	        System.out.println("Got message from queue receiver==>" + m);
		}
    }

    public void stopConsuming() throws JMSException {
    	if (queueConnection==null) return;
        queueSession.close();
        queueConnection.stop();
        queueConnection.close();
        queueConnection=null;
    }
    
    public static void main(String[] args) throws Exception {
    	QReceiver queueReceiver = new QReceiver("KalkulatorQ");
    	queueReceiver.startConsuming();
    	//queueReceiver.stopConsuming();
    }
	
}
