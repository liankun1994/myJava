package com.itheima_03;
/*
 * String����жϷ���
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "Hello";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		//�Ƚ��ַ���
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		//�Ƚ��ַ��������Դ�Сд
		
		System.out.println(s1.startsWith("he"));
		//����ַ����Ƿ��Բ�����ͷ
		
		System.out.println(s1.endsWith("lo"));
		//����ַ����Ƿ��Բ�����β
	}
}
