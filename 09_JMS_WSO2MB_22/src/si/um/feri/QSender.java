package si.um.feri;

import javax.jms.DeliveryMode;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class QSender {
	
	private String queueName;
	
	public QSender(String qName) {
		queueName=qName;
	}
	
	public void sendMessages() throws NamingException, JMSException {
		InitialContext ctx=WSO2Util.getInitialContext(queueName);

		Queue queue = (Queue) ctx.lookup(queueName);
		QueueConnectionFactory connFactory = (QueueConnectionFactory) ctx.lookup(WSO2Util.CF_NAME);
		QueueConnection queueConnection = connFactory.createQueueConnection();
		QueueSession queueSession = queueConnection.createQueueSession(false, QueueSession.AUTO_ACKNOWLEDGE);
		QueueSender queueSender = queueSession.createSender(queue);
		queueConnection.start();
		
		queueSender.send(queueSession.createTextMessage("Test Message Content"));

		Message m=queueSession.createTextMessage("Nonpersistent msg");
		queueSender.send(m,DeliveryMode.NON_PERSISTENT,3,2000);

		m=queueSession.createTextMessage("Persistent msg");
		queueSender.send(m,DeliveryMode.PERSISTENT,3,10000);

		queueConnection.close();
		queueSender.close();
		queueSession.close();
	}

	public static void main(String[] args) throws Exception {
		new QSender("KalkulatorQ").sendMessages();
	}
	
}
