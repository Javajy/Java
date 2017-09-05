package com.jy.javacore.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// 使用Map接口
		Map countries = new HashMap();
		// 向Map里添加元素
		countries.put("CN", "中国");
		countries.put("FR", "法国");
		countries.put("RU", "俄国");
		countries.put("US", "美国");
		System.out.println("Map元素如下：");
		System.out.println(countries);

		// 从Map中获取指定的元素，通过Key来获取
		String country = (String) countries.get("CN");
		System.out.println("Map中共有" + countries.size());
	}

}
