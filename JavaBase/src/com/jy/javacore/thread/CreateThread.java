package com.jy.javacore.thread;

public class CreateThread {

	public static void main(String[] args) {
		MyThread4 thread = new MyThread4();
		thread.setName("thread");
		thread.start();
		MyThread4 thread2 = new MyThread4();
		thread2.setName("thread2");
		thread2.start();
		for (int i = 0; i < 300; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + ":" + i);

		}

	}

}

class MyThread4 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + ":" + i);
		}
	}
}