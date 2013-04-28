package middleware.josiel_extension_patterns;

import middleware.igor_marques_basic_remote_patterns.common.InvocationContext;

public interface InvocationInterceptor {
	public void intercept(InvocationContext invocation);
}
