package com.jy.javacore.javanew8;

import java.util.ArrayList;
import java.util.List;

//http://www.runoob.com/java/java8-method-references.html

public class MethodStaticRef {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List names = new ArrayList();

		names.add("Google");
		names.add("Runoob");
		names.add("Taobao");
		names.add("Baidu");
		names.add("Sina");

		names.forEach(System.out::println);// 将 System.out::println 方法作为静态方法来引用。

	}

}
