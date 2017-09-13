package com.jy.javacore.enumdemo;

import lombok.Getter;

public enum SeasonEnum {
	// 创建实例
	SPRING("春天", "春风又绿江南岸"), SUMMER("夏天", "映日荷花别样红"), AUTUMN("秋天", "秋水共长天一色"), WINTER("冬天", "窗含西岭千秋雪");
	@Getter
	private final String seasonName;
	@Getter
	private final String seasonDesc;

	// 构造函数私有化
	private SeasonEnum(String seasonName, String seasonDesc) {

		this.seasonName = seasonName;

		this.seasonDesc = seasonDesc;
	}
	// 其他的方法

	public void printself() {
		// this.seasonName="nantian";
		System.out.println(
				this.name() + "----" + this.ordinal() + "----" + this.getSeasonName() + "----" + this.getSeasonDesc());

	}

	

}