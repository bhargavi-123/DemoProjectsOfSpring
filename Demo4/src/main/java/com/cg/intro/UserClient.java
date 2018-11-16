package com.cg.intro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new ClassPathXmlApplicationContext("userlist.xml");
		User user = (User) factory.getBean("userlist");
		System.out.println(user.getUserName());
		System.out.println(user.getPassword());
	}

}
