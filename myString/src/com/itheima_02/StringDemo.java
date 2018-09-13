package com.itheima_02;
/*
 * String字符串类
 * 		字符串本质是一个字符数组 
 * 
 * 注意:字符串是一种比较特殊的引用数据类型，直接输出字符串对象输出的是该对象中的数据。
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
