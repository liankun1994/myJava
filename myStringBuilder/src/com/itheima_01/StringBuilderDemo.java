package com.itheima_01;
/*
 * StringBuilder:��һ���ɱ���ַ������ַ����������ࡣ
 * 
 * String��StringBuilder������:
 * 		String�������ǹ̶��ġ�
 * 		StringBuilder�������ǿɱ�ġ�
 * 
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		//��������ʼΪ16
		System.out.println(sb.length());
		//����
	}
}
