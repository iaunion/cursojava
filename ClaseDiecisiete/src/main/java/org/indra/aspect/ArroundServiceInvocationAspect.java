package org.indra.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class ArroundServiceInvocationAspect implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {

		System.out.println("Antes de invocar al metodo " + invocation.getMethod().getName());
		Object result = invocation.proceed();
		System.out.println("Despues de invocar al metodo " + invocation.getMethod().getName());
		result = (String) result + "Alterado";
		return result;
	}

}
