package com.jy.javacore.generic;

import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(200);
		v1.add(800);
		v1.add(1200);
		show(v1);

		Vector<Double> v2 = new Vector<Double>();
		v2.add(2.35);
		v2.add(12.54);
		v2.add(6.47);
		show(v2);

	}

	public static void show(Vector<? extends Number> v) {
		System.out.println(v);
	}
}
