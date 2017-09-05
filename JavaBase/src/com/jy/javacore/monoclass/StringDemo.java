package com.jy.javacore.monoclass;

public class StringDemo {

	public static void main(String[] args) {
		// String demo = "jyloVEjy";
		String demo = new String("jyloVEjy");
		System.out.println("demo:" + demo);
		System.out.println("demo.length():" + demo.length());
		System.out.println("demo.toUppercase():" + demo.toUpperCase());
		System.out.println("demo.lastIndexOf(\"l\"):" + demo.lastIndexOf("l"));

	}

}
