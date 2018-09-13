package com.itheima_03;
/*
 * String类的判断方法
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "Hello";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		//比较字符串
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		//比较字符串，忽略大小写
		
		System.out.println(s1.startsWith("he"));
		//检查字符串是否以参数开头
		
		System.out.println(s1.endsWith("lo"));
		//检查字符串是否以参数结尾
	}
}
