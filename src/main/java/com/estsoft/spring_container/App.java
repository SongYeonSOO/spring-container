package com.estsoft.spring_container;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

//java application을 만들면서 spring container를 이용해보자!
public class App {
	public static void main(String[] args) {
		beanFactoryTest();
		applicationContext();

	}

	public static void beanFactoryTest() {
		/*
		 * //요즘엔 쓰지 않음 ;; BeanFactory beanFactory = new XmlBeanFactory(new
		 * ClassPathResource("config/applicationContext.xml"));
		 * 
		 */
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("config/applicationContext.xml"));
		User user1 = beanFactory.getBean(User.class);
		user1.setName("YS");
		System.out.println(user1);

		User user2 = (User)beanFactory.getBean(User.class);
		user1.setName("YS");
		System.out.println(user1);
	}

	public static void applicationContext() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/applicationContext.xml");

		User user1 = applicationContext.getBean(User.class);
//		user1.setName("YS");
		System.out.println(user1);

		User user2 = (User)applicationContext.getBean("user1");
		user2.setName("YS");
		System.out.println(user1);

	
	}
}
