package com.itheima_01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * ���·��
 */
public class FileWriterDemo2 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("myJavaIO.txt");
		//���·��:����ڵ�ǰ��Ŀ���ԣ�����Ŀ(myIO)�ĸ�Ŀ¼��
		//����·��:���̷���ʼ��·��"d:\\myJavaIO.txt"
		
		fw.write("helloworld");
		fw.flush();
		
		fw.close();
	}
}
