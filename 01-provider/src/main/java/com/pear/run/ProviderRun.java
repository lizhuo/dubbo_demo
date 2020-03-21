package com.pear.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author lizhuo
 * @Description:
 * @date 2020-03-21 20:
 */
public class ProviderRun {

	public static void main(String[] args) throws IOException {
		// 创建Spring容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-provider.xml");

		// 启动Spring容器
		((ClassPathXmlApplicationContext) applicationContext).start();

		// 使主线程阻塞
		System.in.read();
	}

}
