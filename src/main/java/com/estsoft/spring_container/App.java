package com.estsoft.spring_container;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

//java application을 만들면서 spring container를 이용해보자!
public class App {
	public static void main(String[] args) {
		// beanFactoryTest();
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

		User user2 = (User) beanFactory.getBean(User.class);
		user1.setName("YS");
		System.out.println(user1);
	}

	public static void applicationContext() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/applicationContext.xml");

		// User user1 = applicationContext.getBean(User.class);
		// user1.setName("YS");
		// System.out.println(user1);

		User user1 = (User) applicationContext.getBean("user1");
		System.out.println(user1);
		User user2 = (User) applicationContext.getBean("user2");
		System.out.println(user2);
		// 현재 error : bean설정에서 parameter에 대한 setter가 없으면 에러가 난다.(현재 friend에
		// setter가 없던 상태)
		// autowired에서는 자동으로 setter생성해서 만들어서 에러가 안났던 것
		User user3 = (User) applicationContext.getBean("user3");
		System.out.println(user3);

		User user4 = (User) applicationContext.getBean("user4");
		System.out.println(user4);

		// autowired를 쓰지 않았지만 friend가 자동으로 autowired된 경우 (코드확인**)
		Guest guest1 = (Guest) applicationContext.getBean("guest1");
		System.out.println(guest1);
		
		Guest guest2 = (Guest) applicationContext.getBean("guest2");
		System.out.println(guest2);

		// applicationContext를 downcast해야함
		((ConfigurableApplicationContext) applicationContext).close();

	}
}
