package com.itheima_02;
/*
 * String�ַ�����
 * 		�ַ���������һ���ַ����� 
 * 
 * ע��:�ַ�����һ�ֱȽ�����������������ͣ�ֱ������ַ�������������Ǹö����е����ݡ�
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = new String("hello");
		System.out.println(s1);
		
		char[] chs = {'h','e','l','l','o'};
		String s2 = new String(chs);
		System.out.println(s2);
		
		String s3 = new String(chs,1,3);
		System.out.println(s3);
		
		String s4 = "hello";
		System.out.println(s4);
	}
}
