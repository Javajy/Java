package com.jy.javacore.enumdemo;

public class Test {

	public static void main(String[] args) {
		// 遍历枚举所有的实例
		System.out.println("输出WeekEnum:");
		for(WeekEnum we :WeekEnum.values()) {
			System.out.println(we);
			System.out.println(we.name()+"----"+we.ordinal());
			
			
			//遍历SeasonEnum
			System.out.println("输出SeasonEnum:");
			for(SeasonEnum se :SeasonEnum.values()) {
				System.out.println(se);
				se.printself();
			}
		}

	}

}
