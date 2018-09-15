package com.itheima_04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * 缓冲流
 * 		比输入流输出流更高效。
 */
public class BufferedStreamDemo {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("Java.txt"));
		bw.write("hello");
		bw.flush();
		bw.close();
		//写入
		
		BufferedReader br = new BufferedReader(new FileReader("Java.txt"));

		int ch;
		while((ch=br.read())!=-1) {
			System.out.print((char)ch);
		}
		
		br.close();
		//按字符读取
		
		
		br = new BufferedReader(new FileReader("Java.txt"));
		
		char[] chs = new char[1024];
		int len;
		while((len=br.read(chs))!=-1) {
			System.out.print(new String(chs,0,len));
		}
		
		br.close();
		//按字符数组读取
	}
}
