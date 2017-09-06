package com.jy.javacore.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class InputStreamReaderDemo {

	public static void main(String[] args) {

		File file = new File("D:\\github   me\\Java\\JavaBase\\src\\com\\jy\\javacore\\io\\FileIoDemo.java");

		try {
			FileReader fr = new FileReader(file);
			// InputStreamReader isr = new InputStreamReader(System.in);
			// BufferedReader br = new BufferedReader(isr);
			BufferedReader br = new BufferedReader(fr);
			String s;
			// System.out.println("请输入内容：");
			s = br.readLine();
			// while (！"".equals(s)) {
			while (null != s) {
				System.out.println("Read:" + s);
				s = br.readLine();
			}
			br.close();
			// isr.clone();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
