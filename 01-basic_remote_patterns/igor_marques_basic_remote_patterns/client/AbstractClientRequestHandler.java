package middleware.igor_marques_basic_remote_patterns.client;

public abstract class AbstractClientRequestHandler implements IClientRequestHandler {
	private ClientRequestListener listener;

	public ClientRequestListener getListener() {
		return listener;
	}

	public void setListener(ClientRequestListener listener) {
		this.listener = listener;
	}
}

//import java.net.MalformedURLException;
//import java.net.URL;
//
//import javax.xml.soap.SOAPConnection;
//import javax.xml.soap.SOAPConnectionFactory;
//import javax.xml.soap.SOAPException;
//import javax.xml.soap.SOAPMessage;



//private SOAPConnectionFactory myFct = null;
//private SOAPConnection connection = null;
//private URL endPoint = null;
//	try {
//		myFct = SOAPConnectionFactory.newInstance();
//	} catch (UnsupportedOperationException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (SOAPException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
//	try {
//		 connection = myFct.createConnection();
//	} catch (SOAPException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
//	try {
//		endPoint = new URL("127.1.1.1");
//	} catch (MalformedURLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//}
//
///* (non-Javadoc)
// * @see middleware.igor_marques_basic_remote_patterns.IClientRequestHandler#sendMessage(javax.xml.soap.SOAPMessage)
// */
//@Override
//public void sendMessage(SOAPMessage message) {
//	try {
//		SOAPMessage reply = this.connection.call(message, this.endPoint);
//	} catch (SOAPException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//}
//
///* (non-Javadoc)
// * @see middleware.igor_marques_basic_remote_patterns.IClientRequestHandler#closeConnection()
// */
//@Override
//public void closeConnection(){
//	try {
//		this.connection.close();
//	} catch (SOAPException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//}