package com.jy.javacore.thread;

public class CreateThread2Demo {

	public static void main(String[] args) {
		MyRunnable run = new MyRunnable();
		Thread thread = new Thread(run);
		thread.setName("thread");
		thread.start();
		Thread thread2 = new Thread(run);
		thread2.setName("thread2");
		thread2.start();
		for (int i = 0; i < 300; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + ":" + i);

		}

	}

}

class MyRunnable implements Runnable {
	public void run() {
		for (int i = 0; i < 300; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + ":" + i);
		}
	}

}
