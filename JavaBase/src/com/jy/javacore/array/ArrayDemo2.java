package com.jy.javacore.array;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// 从终端读取数据作为数组的元素
		// 先声明一个数组，并分配空间为5
		int[] scores = new int[5];
		// sum用来保存成绩总和
		int sum = 0;
		// avg用来保存平均分
		double avg = 0;
		Scanner input = new Scanner(System.in);
		// 这样避免每次循环被调用，可以提高性能
		int length = scores.length;
		for (int i = 0;i < length;i++) {
			System.out.println("请输入成绩：");
			scores[i]=input.nextInt();
			sum += scores[i];
		}
			
		System.out.println("课程成绩总和为：" + sum);
		System.out.println("课程的平均分是：" + avg);
	}
	

}
