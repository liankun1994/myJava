package com.itheima_02;

import java.io.FileReader;
import java.io.IOException; 
/*
 * ������
 * 		ͨ���ַ���������
 */
public class FileReaderDemo2{
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("Java.txt");
		
		char[] chs = new char[1024];
		//���������1024����������
		int len;
		//���ڻ�ȡ��ȡ�����ݵĳ���
		
		while((len = fr.read(chs)) != -1) {
			System.out.print(new String(chs,0,len));
		}
		
		fr.close();
	}
}
