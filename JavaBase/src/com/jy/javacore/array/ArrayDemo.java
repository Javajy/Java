package com.jy.javacore.array;

public class ArrayDemo {

	public static void main(String[] args) {
		// 声明方式一：
		// int[] scores;
		// 声明方式二：
		int scores[];

		// 分配空间：
		scores = new int[5];

		// 赋值
		scores[0] = 15;
		
		
		//处理数据
		System.out.println("数组的第一个数值："+scores[0]);
		scores[0]=scores[0]*10;
		System.out.println("改变后的数值："+scores[0]);
		

	}

}
