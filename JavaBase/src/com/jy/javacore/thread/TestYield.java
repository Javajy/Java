package com.jy.javacore.thread;

import java.util.Date;

public class TestYield {

	public static void main(String[] args) {
		Thread t1=new YieldThread(false);
		Thread t2=new YieldThread(true);
		Thread t3=new YieldThread(false);
		t1.start();
		t2.start();
		t3.start();
	}
}
class YieldThread extends Thread{
	private boolean flag;
	public YieldThread(boolean flag) {
		this.flag=flag;
	}
	public void run() {
		long start=new Date().getTime();
		for(int i=0;i<500;i++) {
			if(flag)
				Thread.yield();
			System.out.println(this.getName()+":"+i+"\t");
		}
		long time=new Date().getTime()-start ;
		System.out.println("\n"+this.getName()+"执行时间:"+time+"毫秒");
	}
}