package com.itheima_02;
/*
 * 	String
 * 
 * 	ͨ�����췽���������ַ��������ֱ�Ӹ��Ʒ�ʽ�������ַ���������ʲô�����أ�
 * 		ͨ�����췽�������ַ����������ڶ��ڴ档
 * 		ֱ�Ӹ�ֵ��ʽ�����������ڷ������ĳ����ء�
 * 
 * 	==:
 * 		�Ƚϻ����������͵�ֵ
 * 		�Ƚ������������͵ĵ�ֵַ
 */
public class StringDemo2 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";
		
		System.out.println(s1 == s2);//false
		//�Ƚϵ��������ַ����ĵ�ַ
		
		String s3 = "hello";
		System.out.println(s1 == s3);//false
		System.out.println(s2 == s3);//true
	}
}
