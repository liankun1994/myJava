package com.itheima_05;
/*
 * String���ת������
 */

public class StringDemo {
	public static void main(String[] args) {
		String s = "abcde";
		
		char[] chs = s.toCharArray();
		for(int x=0;x<chs.length;x++) {
			System.out.println(chs[x]);
		}
		
		System.out.println(s.toLowerCase());
		//ȫ��ת��ΪСд
		
		System.out.println(s.toUpperCase());
		//ȫ��ת��Ϊ��д
		
	}
}
