package com.itheima_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 缓冲流的特殊功能
 */
public class BufferedStreamDemo {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("Java.txt"));
		for(int x=0;x<10;x++) {
			bw.write("hello" + x);
			bw.newLine();
			//将换行符添加到缓冲区（适应不同的系统）
			bw.flush();
		}
		bw.close();
		
		
		BufferedReader br = new BufferedReader(new FileReader("Java.txt"));
		String line = br.readLine();
		//读取一行数据到line，如果没有数据则返回null。
		System.out.println(line);
		
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
	}
}
