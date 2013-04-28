package middleware.igor_marques_basic_remote_patterns.soap;

import middleware.igor_marques_basic_remote_patterns.client.AbstractClientRequestHandler;
import middleware.igor_marques_basic_remote_patterns.common.Message;

public class SOAPClientRequestHandler extends AbstractClientRequestHandler{
	
	@Override
	public void sendMessage(Message message) {
		// TODO tranformar message em um soap
		
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
