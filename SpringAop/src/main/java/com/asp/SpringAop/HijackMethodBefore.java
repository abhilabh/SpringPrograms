package com.asp.SpringAop;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;
import org.springframework.aop.framework.ProxyFactoryBean;

public class HijackMethodBefore implements MethodBeforeAdvice{

	public void before(Method method, Object[] args, Object target) 
		// TODO Auto-generated method stub
		
		throws Throwable {
			System.out.println("hijack befor method");
			//System.out.println("");
		}
		
	
}
