package com.itheima_01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * ������׷��д��
 * 
 * 		ע��:
 * 			Windows���±�Ҫʹ��\r\n���С�
 * 			LinuxҪʹ��\n��
 * 			MacҪʹ��\r��
 */
public class FileWriterDemo4 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("Java.txt",true);
		//�ڶ�������true��ʾ׷��д�룬�ò���Ĭ����false
		
		for(int x=0;x<10;x++) {
			fw.write("hello" + x);
			fw.write("\r\n");
		}
		
		fw.close();
	}
}
