package com.itheima_01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * �����
 */
public class FileWriterDemo {
		public static void main(String[] args) throws IOException {
			//����Ҫ�׳��쳣����ʹ��IO����
			FileWriter fw = new FileWriter("d:\\myJavaIO.txt");
			//�������������
			//������һ���ļ�
			//�����������ָ���ļ�
			
			fw.write("��Ҳ��һ��java�ļ�");
			//������д���ڴ滺����
			fw.flush();
			//ˢ�»�������д���ļ�
			
			fw.close();
			//�ͷ���Դ������ռ���ļ�
			//close���ͷ�֮ǰҲ��ˢ�»�������д���ļ�
		}
}
