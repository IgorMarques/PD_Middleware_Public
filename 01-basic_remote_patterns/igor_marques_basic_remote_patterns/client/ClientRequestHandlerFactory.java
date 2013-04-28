package middleware.igor_marques_basic_remote_patterns.client;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class ClientRequestHandlerFactory {
	
	private HashMap<String, Class> registeredClasses = new HashMap<String, Class>();
	
	public void registerClass(String protocol, Class klass){
		registeredClasses.put(protocol, klass);
	}
	
	public IClientRequestHandler getImplementation(String protocol) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Class klass = registeredClasses.get(protocol);
		
		Constructor constructor = klass.getDeclaredConstructor(new Class[]{} );
		
		return (IClientRequestHandler) constructor.newInstance(new Object[]{});
	}

}
