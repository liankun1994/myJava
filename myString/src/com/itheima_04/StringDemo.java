package com.itheima_04;
/*
 * String�Ļ�ȡ����
 */
public class StringDemo {
	public static void main(String[] args) {
		String s = "helloworld";
		
		System.out.println(s.length());
		//��ȡ�ַ����ĳ���

		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		//��ȡָ�����������ַ�

		System.out.println(s.indexOf("l"));
		System.out.println(s.indexOf("owo"));
		System.out.println(s.indexOf("ak"));
		//��ȡ�Ӵ���һ�γ��ֵ�λ������
		
		System.out.println(s.substring(0));
		System.out.println(s.substring(5));
		//�Ӳ�����λ��������ȡ��ĩβ
		
		System.out.println(s.substring(3, 8));
		//��ȡ������3������7��ȡ���ַ���
	}
}
