package com.jy.javacore.monoclass;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder cs = new StringBuilder("枪击");
		System.out.println(cs);
		cs.append("一名").append("美国").append("海军").append("陆战队员");
		System.out.println(cs);
		String sus = cs.toString();
		System.out.println(sus);

		// 字符串分隔
		String n = "yy:dd:bb:kk";
		String[] results = n.split(":");
		for (String each : results) {
			System.out.println(each);

		}
	}

}
