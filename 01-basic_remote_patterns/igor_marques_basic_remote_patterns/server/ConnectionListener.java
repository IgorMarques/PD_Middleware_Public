package middleware.igor_marques_basic_remote_patterns.server;

public interface ConnectionListener {
	public void newConnection(Connection connection);
	public void connectionClosed(Connection connection);

}
