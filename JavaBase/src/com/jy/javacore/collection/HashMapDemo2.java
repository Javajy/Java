package com.jy.javacore.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {

	@SuppressWarnings("all")

	public static void main(String[] args) {
		// 使用Map接口
		Map countries = new HashMap();
		// 向Map中添加元素
		countries.put("CN", "中华人民共和国");
		countries.put("RU", "俄罗斯联邦");
		countries.put("FR", "法兰西共和国");
		countries.put("US", "美利坚合众国");
		System.out.println("Map 元素如下：");
		System.out.println(countries);

		// 这是对map的Key进行迭代
		System.out.println("这是对map的Key的迭代");
		Set<String> keys = countries.keySet();
		for (String string : keys) {
			System.out.println(string);
		}

		// 这是对map的Value进行迭代
		System.out.println("这是对map的Value的迭代");
		Collection<String> value = countries.values();
		for (String string : value) {
			System.out.println(string);
		}
		Iterator<String> iterator2 = value.iterator();
		while (iterator2.hasNext()) {
			String object = iterator2.next();
		}

		Set entrys = countries.entrySet();

		// Map容器的遍历方式----循环的方式
		System.out.println("使用Foreach遍历：");
		for (Object object : entrys) {
			System.out.println(object);
		}
		Set keys1 = countries.keySet();
		Iterator iterator = keys1.iterator();
		System.out.println("使用迭代器遍历：");
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			System.out.print(key);
			// 通过key去获取对应的value
			String value1 = (String) countries.get(key);
			System.out.print("----" + value1);
			System.out.println();
		}

	}
}