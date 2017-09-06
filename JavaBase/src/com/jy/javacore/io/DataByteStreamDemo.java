package com.jy.javacore.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataByteStreamDemo {

	public static void main(String[] args) throws Exception {
		// 创建DataOutputStream需要的FileOutputStream
		System.out.println("开始向文件中写数据...");
		String fileUrl = "D:\\github   me\\Java\\JavaBase\\src\\com\\jy\\javacore\\io\\DataByteStreamDemo.data";
		FileOutputStream fos = new FileOutputStream(fileUrl);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("罗斯福");
		dos.writeInt(40);
		dos.writeLong(13955664269L);
		dos.close();
		System.out.println("向文件中写数据结束");

		System.out.println("开始从文件中读数据....");
		FileInputStream fis = new FileInputStream(fileUrl);
		DataInputStream dis = new DataInputStream(fis);
		System.out.println("name:" + dis.readUTF());
		System.out.println("age:" + dis.readInt());
		System.out.println("cell:" + dis.readLong());
		System.out.println("文件读取结束！");

	}

}
