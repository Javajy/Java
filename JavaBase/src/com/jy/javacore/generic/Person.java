package com.jy.javacore.generic;

//定义泛型类
public class Person<T> {
	private String name;

	private T pass;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T getPass() {
		return pass;
	}

	public void setPass(T pass) {
		this.pass = pass;
	}

}
