package middleware.igor_marques_basic_remote_patterns.server;

import java.util.ArrayList;

import middleware.igor_marques_basic_remote_patterns.common.InvocationContext;
import middleware.josiel_extension_patterns.InvocationInterceptor;

public class Invoker {
	
	private ArrayList<InvocationInterceptor> interceptors = new ArrayList<InvocationInterceptor>();
	
	public void invoke(InvocationContext invocation){
		for (InvocationInterceptor ii : interceptors)
			ii.intercept(invocation);
		
		//TODO invocacao marota
	}
}
