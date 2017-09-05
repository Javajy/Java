package com.jy.javacore.exception;

import java.util.Scanner;

public class AgeDemo {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("请输入年龄");
		int age = in.nextInt();
		//System.out.println("您的年龄是：" + age);
		if (age > 100 || age < 0) {
			System.out.println("输入的年龄有误！");
		}
		try {
			System.out.println("您的年龄是：" + age);
		} catch (Exception e) {
			System.out.println("发生了输入不匹配异常");
			e.printStackTrace();
		}

	}

}
