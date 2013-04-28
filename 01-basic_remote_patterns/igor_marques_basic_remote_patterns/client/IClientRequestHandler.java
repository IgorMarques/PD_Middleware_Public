package middleware.igor_marques_basic_remote_patterns.client;

import middleware.igor_marques_basic_remote_patterns.common.Message;

public interface IClientRequestHandler {
	
	public void sendMessage(Message message);
	
	public void listenMessage();
}