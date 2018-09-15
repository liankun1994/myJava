package com.itheima_01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 输出流
 */
public class FileWriterDemo {
		public static void main(String[] args) throws IOException {
			//必须要抛出异常才能使用IO对象
			FileWriter fw = new FileWriter("d:\\myJavaIO.txt");
			//创建输出流对象
			//创建了一个文件
			//把输出流对象指向文件
			
			fw.write("我也是一个java文件");
			//将数据写到内存缓冲区
			fw.flush();
			//刷新缓冲区并写入文件
			
			fw.close();
			//释放资源，不在占用文件
			//close在释放之前也会刷新缓冲区并写入文件
		}
}
