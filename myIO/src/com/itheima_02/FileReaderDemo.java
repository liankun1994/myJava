package com.itheima_02;

import java.io.FileReader;
import java.io.IOException;

/*
 * ������
 * 		ͨ���ַ�����
 */
public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("Java.txt");
		
		int ch = fr.read();
		System.out.println((char)ch);
		//��ȡһ���ַ������ch = -1 ��˵��û�����ݿ��Զ���
		
		while((ch = fr.read()) != -1) {
			System.out.print((char)ch);
		}
		//һֱ��ȡ����β
		
		fr.close();
		//�رն���
		
	}
}
