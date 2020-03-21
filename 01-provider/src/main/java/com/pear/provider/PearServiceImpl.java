package com.pear.provider;

import com.pear.service.PearService;

/**
 * @author lizhuo
 * @Description:
 * @date 2020-03-21 20:37
 */
public class PearServiceImpl implements PearService {

	public String hello(String name) {
		System.out.println(name + ", I'm provider");
		return "Hello dubbo World, " + name;
	}

}
