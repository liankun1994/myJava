package com.itheima_02;

import java.io.FileReader;
import java.io.IOException; 
/*
 * 输入流
 * 		通过字符数组输入
 */
public class FileReaderDemo2{
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("Java.txt");
		
		char[] chs = new char[1024];
		//这里可以是1024及其整数倍
		int len;
		//用于获取读取到数据的长度
		
		while((len = fr.read(chs)) != -1) {
			System.out.print(new String(chs,0,len));
		}
		
		fr.close();
	}
}
