package si.um.feri;

import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class WSO2Util {

	public static final String QPID_ICF = "org.wso2.andes.jndi.PropertiesFileInitialContextFactory";
	public static final String CF_NAME_PREFIX = "connectionfactory.";
	public static final String QUEUE_NAME_PREFIX = "queue.";
	public static final String CF_NAME = "qpidConnectionfactory";

	private static final String userName = "student";
	private static final String password = "student";
	private static final String CARBON_CLIENT_ID = "carbon";
	private static final String CARBON_VIRTUAL_HOST_NAME = "carbon";
	private static final String CARBON_DEFAULT_HOSTNAME = "svizec.informatika.uni-mb.si";
	private static final String CARBON_DEFAULT_PORT = "5682";

	
	public static InitialContext getInitialContext(String queueName) throws NamingException {
		Properties properties = new Properties();
		properties.put(Context.INITIAL_CONTEXT_FACTORY, QPID_ICF);
		properties.put(CF_NAME_PREFIX + CF_NAME, getTCPConnectionURL());
		properties.put(QUEUE_NAME_PREFIX + queueName, queueName);
		return new InitialContext(properties);
	}
	
	private static String getTCPConnectionURL() {
		// amqp://{username}:{password}@carbon/carbon?brokerlist='tcp://{hostname}:{port}'
		return new StringBuffer().append("amqp://").append(userName).append(":").append(password).append("@")
				.append(CARBON_CLIENT_ID).append("/").append(CARBON_VIRTUAL_HOST_NAME).append("?brokerlist='tcp://")
				.append(CARBON_DEFAULT_HOSTNAME).append(":").append(CARBON_DEFAULT_PORT).append("'").toString();
	}
	
}
