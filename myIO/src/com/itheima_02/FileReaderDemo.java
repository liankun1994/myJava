package com.itheima_02;

import java.io.FileReader;
import java.io.IOException;

/*
 * 输入流
 * 		通过字符输入
 */
public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("Java.txt");
		
		int ch = fr.read();
		System.out.println((char)ch);
		//读取一个字符，如果ch = -1 则说明没有数据可以读了
		
		while((ch = fr.read()) != -1) {
			System.out.print((char)ch);
		}
		//一直读取到结尾
		
		fr.close();
		//关闭对象
		
	}
}
