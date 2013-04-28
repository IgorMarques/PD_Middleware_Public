package middleware.igor_marques_basic_remote_patterns.server;

import java.util.ArrayList;

public class ConectionManager {
	
	private ConnectionListener connectionListener;
	private ArrayList<Connection> connections;
	
	public ConectionManager() {
		connections = new ArrayList<Connection>();
	}

	public void addConnection(Connection conn) {
		connections.add(conn);
	}

	public void removeConnection(Connection conn) {
		connections.remove(conn);
	}

	public ArrayList<Connection> getConnections() {
		return connections;
	}

	public ConnectionListener getConnectionListener() {
		return connectionListener;
	}

	public void setConnectionListener(ConnectionListener connectionListener) {
		this.connectionListener = connectionListener;
	}

}
