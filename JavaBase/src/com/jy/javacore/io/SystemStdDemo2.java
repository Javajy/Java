package com.jy.javacore.io;

import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class SystemStdDemo2 {

	public static void main(String[] args) throws Exception {
		System.out.println("演示开始..."); // 这个时候它没有改输出目的地，所以它在输出台输出

		FileInputStream in = new FileInputStream(
				"D:\\github   me\\Java\\JavaBase\\src\\com\\jy\\javacore\\io\\FileIoDemo.java");
		System.setIn(in);

		PrintStream out = new PrintStream("D:\\github   me\\Java\\JavaBase\\src\\com\\jy\\javacore\\io\\jkl.txt");
		System.setOut(out);
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(in);
		do {
			String info = scanner.nextLine();
			System.out.println(info);

		} while (scanner.hasNextLine());
		//// 这个时候，输出目的地已经被修改，所以不会在控制台在打印出来，而是打到文件中了！
		System.out.println("演示结束！");

	}

}
