package com.jy.javacore.enumdemo;

import lombok.Getter;

@Getter
public enum WeekEnum2 { // 使用enum 定义的枚举类默认继承了java.lang.Enum类
	// 定义实例
	MON(1, "星期一"), TUE(2, "星期二"), WED(3, "星期三"), THU(4, "星期四"), FRI(5, "星期五"), SAT(6, "星期六") {
		// 提供判斷是否休息的方法
		public boolean isRest() {
			return true; // 默認休息
		}
	},
	SUN(7, "星期天") {
		// 提供判斷是否休息的方法
		public boolean isRest() {
			return true; // 默認休息
		}
	};// 如果没有其他属性或者方法等，可以不写；，如果有一定要写；
	private int index;
	private String desc;

	private WeekEnum2(int index, String desc) {
		this.index = index;
		this.desc = desc;
	}

	// 提供判斷是否休息的方法
	public boolean isRest() {
		return false;
	}

}
