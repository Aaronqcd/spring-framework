package com.demo.bean;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeanFactoryTest {
	@Test
	public void testSimpleLoad() {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanTest.xml"));
		MyBean bean = (MyBean) beanFactory.getBean("myBean");
		assertEquals("hello world", bean.getText());
	}

//	public static void main(String[] args) {
//		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanTest.xml"));
//		MyBean bean = (MyBean) beanFactory.getBean("myBean");
//		System.out.println("111");
//	}
}
