package middleware.igor_marques_basic_remote_patterns.soap;

import java.net.URL;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.soap.Name;

import middleware.igor_marques_basic_remote_patterns.client.AbstractClientRequestHandler;
import middleware.igor_marques_basic_remote_patterns.common.Message;

public class SOAPClientRequestHandler extends AbstractClientRequestHandler{
	
	@Override
	public void sendMessage(Message message, URL endpoint) throws SOAPException {
		
		//criando conexao 
	     SOAPConnectionFactory sfc = SOAPConnectionFactory.newInstance();
	     SOAPConnection connection = sfc.createConnection();
	      
		//criando mensagem		
		SOAPMessage soapMessage = null;
		
		soapMessage = MessageFactory.newInstance().createMessage();
		
		SOAPPart soapPart = soapMessage.getSOAPPart();
		SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
		SOAPBody soapBody = soapEnvelope.getBody();
		
		//Adicionando objeto
		
		Name bodyName = soapEnvelope.createName("Object");
		
		SOAPBodyElement requestedObject = soapBody.addBodyElement(bodyName);
		
		requestedObject.addTextNode(message.object);
		
		//Adicionando ID do objeto
		
		bodyName = soapEnvelope.createName("ObjectID");
		
		SOAPBodyElement requestedObjectID = soapBody.addBodyElement(bodyName);
		
		requestedObjectID.addTextNode(message.objectID);
		
		//Adicionando metodo
		
		bodyName = soapEnvelope.createName("Method");
		
		SOAPBodyElement requestedMethod = soapBody.addBodyElement(bodyName);
		
		requestedMethod.addTextNode(message.method);
		
		//Adicionando parametros
		
		bodyName= soapEnvelope.createName("Params");
		
		SOAPBodyElement requestedParams = soapBody.addBodyElement(bodyName);
		
		for(String p:message.params){
			requestedParams.addTextNode(p);
		}
		
		//Enviando mensagem
	     SOAPMessage response = connection.call(soapMessage, endpoint);		
		
	}

	@Override
	public void listenMessage() {
		// TODO ouvir messages soap
		//abrir threaad
		//ficar ouvindo
			//message chegou
			//transforma em message
			//passa pro ClientRequestListener	
	}
	
}

//SOAPMessage message = null;
//
//try {
//message = MessageFactory.newInstance().createMessage();
//} catch (SOAPException e) {
//// TODO Auto-generated catch block
//e.printStackTrace();
//}
//
//try {
//message = Marshaller.marshall(object,objectID, method, params);
//} catch (SOAPException e) {
//// TODO Auto-generated catch block
//e.printStackTrace();
//}
//
//clientHandler.sendMessage(message);


//protected static SOAPMessage marshall(String object, String objectID, String method, ArrayList<String> params) throws SOAPException{
//return null;
//} 
//SOAPMessage soapMessage = MessageFactory.newInstance().createMessage();
//
//SOAPPart soapPart = soapMessage.getSOAPPart();
//SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
//SOAPBody soapBody = soapEnvelope.getBody();
//
////Adicionando objeto
//
//Name bodyName = soapEnvelope.createName("Object");
//
//SOAPBodyElement requestedObject = soapBody.addBodyElement(bodyName);
//
//requestedObject.addTextNode(object);
//
////Adicionando ID do objeto
//
//bodyName = soapEnvelope.createName("ObjectID");
//
//SOAPBodyElement requestedObjectID = soapBody.addBodyElement(bodyName);
//
//requestedObjectID.addTextNode(objectID);
//
////Adicionando m?todo
//
//bodyName = soapEnvelope.createName("Method");
//
//SOAPBodyElement requestedMethod = soapBody.addBodyElement(bodyName);
//
//requestedMethod.addTextNode(method);
//
////Adicionando par?metros
//
//bodyName= soapEnvelope.createName("Params");
//
//SOAPBodyElement requestedParams = soapBody.addBodyElement(bodyName);
//
//for(String p:params){
//	requestedParams.addTextNode(p);
//}
//
//return soapMessage;