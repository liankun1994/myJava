package com.itheima_01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 相对路径
 */
public class FileWriterDemo2 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("myJavaIO.txt");
		//相对路径:相对于当前项目而言，在项目(myIO)的根目录下
		//绝对路径:以盘符开始的路径"d:\\myJavaIO.txt"
		
		fw.write("helloworld");
		fw.flush();
		
		fw.close();
	}
}
