package com.asp.SpringAop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class HijackMethodAfter implements AfterReturningAdvice{

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("after method");
		
	}

}
