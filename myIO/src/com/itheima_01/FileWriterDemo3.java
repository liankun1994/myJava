package com.itheima_01;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo3 {
		public static void main(String[] args) throws IOException {
			FileWriter fw = new FileWriter("Java.txt");
			
			fw.write("abcde");
			//写一个字符串数据
			
			fw.write("abcde",0,3);
			//写入部分字符串数据，0为索引，3为长度
			
			fw.write('a');
			fw.write(97);
			//写入一个字符
			
			char[] chs = {'a','b','c','d','e'};
			fw.write(chs);
			fw.write(chs,0,5);
			//写入字符数组

			fw.close();
		}
}
