package com.test.system.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUitl {
	private static ApplicationContext appcontext=null;
	public static ApplicationContext getContext(String path){
		if(appcontext==null){
			appcontext=new ClassPathXmlApplicationContext(path);
		}
		return appcontext;
	}

}
