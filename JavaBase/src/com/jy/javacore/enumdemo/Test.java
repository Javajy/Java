package com.jy.javacore.enumdemo;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map.Entry;
@SuppressWarnings("all")
public class Test {

	public static void main(String[] args) {
		// 遍历枚举所有的实例
		// System.out.println("输出WeekEnum:");
		// for (WeekEnum we : WeekEnum.values()) {
		// System.out.println(we);
		// System.out.println(we.name() + "----" + we.ordinal());
		// }

		// 遍历SeasonEnum
		System.out.println("输出SeasonEnum:");
		for (SeasonEnum se : SeasonEnum.values()) {
			System.out.println(se);
			se.printself();
		}
		// 和switch case 搭配使用
		System.out.println("-----------");
		SeasonEnum seasonEnum = SeasonEnum.SUMMER;
		switch (seasonEnum) {
		case SPRING:
			System.out.println(seasonEnum);
			break;
		case SUMMER:
			System.out.println(seasonEnum);
			break;
		case AUTUMN:
			System.out.println(seasonEnum);
			break;
		case WINTER:
			System.out.println(seasonEnum);
			break;
		default:
			break;

		}
		// EnumSet demo
		System.out.println("EnumSet:");
		EnumSet<SeasonEnum> seasonSet = EnumSet.allOf(SeasonEnum.class);
		for (SeasonEnum seasonEnum2 : seasonSet) {
			System.out.println(seasonEnum2);
		}

		// EnumMap的使用
		System.out.println("EnumMap:");
		EnumMap<WeekEnum2, String> weekMap = new EnumMap(WeekEnum2.class);
		weekMap.put(WeekEnum2.MON, "一");
		weekMap.put(WeekEnum2.TUE, "二");
		weekMap.put(WeekEnum2.WED, "三");
		weekMap.put(WeekEnum2.THU, "四");
		weekMap.put(WeekEnum2.FRI, "五");
		weekMap.put(WeekEnum2.SAT, "六");
		weekMap.put(WeekEnum2.SUN, "日");
		for (Entry<WeekEnum2, String> entry : weekMap.entrySet()) {
			System.out.println(entry.getKey().getIndex() + "--" + entry.getKey().getDesc() + "--" + entry.getValue());
		}

		// 枚举比较
		WeekEnum2 weekEnum2 = WeekEnum2.MON;
		int result = weekEnum2.compareTo(weekEnum2.SUN);
		System.out.println("比较的结果：" + result);
		if (result > 0) {
			System.out.println("Mon在后面");
		} else if (result == 0) {
			System.out.println("Mon位置相同");
		} else {
			System.out.println("Mon位置前面");

		}

	}
}
