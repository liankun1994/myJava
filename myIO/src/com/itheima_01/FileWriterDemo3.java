package com.itheima_01;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo3 {
		public static void main(String[] args) throws IOException {
			FileWriter fw = new FileWriter("Java.txt");
			
			fw.write("abcde");
			//дһ���ַ�������
			
			fw.write("abcde",0,3);
			//д�벿���ַ������ݣ�0Ϊ������3Ϊ����
			
			fw.write('a');
			fw.write(97);
			//д��һ���ַ�
			
			char[] chs = {'a','b','c','d','e'};
			fw.write(chs);
			fw.write(chs,0,5);
			//д���ַ�����

			fw.close();
		}
}
