package middleware.igor_marques_basic_remote_patterns.client;

import middleware.igor_marques_basic_remote_patterns.common.Message;

public interface ClientRequestListener {
	public void messageReceived(Message message);
}
