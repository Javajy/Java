package com.jy.javacore.enumdemo;

public enum Color implements Behaviour {
	RED("紅色", 1), GREEN("綠色", 2), BLANK("黑色", 3), YELLO("黃色", 4);
	// 成員變量
	private String name;
	private int index;

	// 構造方法
	private Color(String name, int index) {
		this.name = name;
		this.index = index;

	}

	@Override
	public void print() {
		System.out.println(this.index + ":" + this.name);

	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return this.name();
	}
}