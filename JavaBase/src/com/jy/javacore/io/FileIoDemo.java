package com.jy.javacore.io;

import java.io.File;

public class FileIoDemo {

	public static void main(String[] args) {
		File file = new File("D:\\github   me\\Java\\JavaBase\\src\\com\\jy\\javacore\\io");
		File file2 = new File("D:\\JT.Exists");
		System.out.println("file.exists():" + file.exists());
		System.out.println("file2.exists():" + file2.exists());

		System.out.println("file.isDirectory():" + file.isDirectory());
	}

}
