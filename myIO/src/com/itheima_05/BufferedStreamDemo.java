package com.itheima_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �����������⹦��
 */
public class BufferedStreamDemo {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("Java.txt"));
		for(int x=0;x<10;x++) {
			bw.write("hello" + x);
			bw.newLine();
			//�����з���ӵ�����������Ӧ��ͬ��ϵͳ��
			bw.flush();
		}
		bw.close();
		
		
		BufferedReader br = new BufferedReader(new FileReader("Java.txt"));
		String line = br.readLine();
		//��ȡһ�����ݵ�line�����û�������򷵻�null��
		System.out.println(line);
		
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
	}
}
