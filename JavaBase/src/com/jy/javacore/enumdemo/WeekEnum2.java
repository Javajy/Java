package com.jy.javacore.enumdemo;

public enum WeekEnum2 { // 使用enum 定义的枚举类默认继承了java.lang.Enum类
	// 定义实例
	MON, TUE, WES, THU, FRI, SAT {
		// 提供判斷是否休息的方法
		public boolean isRest() {
			return true; // 默認休息
		}
	},
	SUN {
		// 提供判斷是否休息的方法
		public boolean isRest() {
			return true; // 默認休息
		}
	};// 如果没有其他属性或者方法等，可以不写；，如果有一定要写；

	// 提供判斷是否休息的方法
	public boolean isRest() {
		return false;
	}

}
