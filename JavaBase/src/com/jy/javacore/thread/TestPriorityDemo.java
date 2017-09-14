package com.jy.javacore.thread;

public class TestPriorityDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority());
		MyThread1 thread1 = new MyThread1();
		thread1.setName("thread1");
		MyThread1 thread2 = new MyThread1();
		thread2.setName("thread2");
		thread2.setPriority(Thread.MAX_PRIORITY);
		MyThread1 thread3 = new MyThread1();
		thread3.setName("thread3");
		thread3.setPriority(Thread.MIN_PRIORITY);
		thread1.start();
		thread2.start();
		thread3.start();
	}

}

class MyThread1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(this.getName() + ":" + this.getPriority());
		}
	}
}