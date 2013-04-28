package middleware.igor_marques_basic_remote_patterns.common;

import java.util.ArrayList;
import java.util.HashMap;

public class InvocationContext implements ISerializable{
	//AbsoluteObjectReference AOR;
	String objectClass;
	String objectID;
	//outras coisas de AOR

	String method;
	ArrayList<String> params;
	
	private HashMap<String, Object> additionalParams = new HashMap<String, Object>();
	
	public Object getParam(String name){
		return additionalParams.get(name);
	}
	
	public void setParams(String key, Object value){
		additionalParams.put(key, value);
	}
	
	public InvocationContext(String object, String objectID, String method,
			String[] params) {
		
	}

	@Override	
	public Message serialize() {
		// TODO fazer a parada de transformar os dados numa msg bonitinha
		return null;
	}

}
