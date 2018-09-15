package com.itheima_01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 换行与追加写入
 * 
 * 		注意:
 * 			Windows记事本要使用\r\n换行。
 * 			Linux要使用\n。
 * 			Mac要使用\r。
 */
public class FileWriterDemo4 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("Java.txt",true);
		//第二个参数true表示追加写入，该参数默认是false
		
		for(int x=0;x<10;x++) {
			fw.write("hello" + x);
			fw.write("\r\n");
		}
		
		fw.close();
	}
}
