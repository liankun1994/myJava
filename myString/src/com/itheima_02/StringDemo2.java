package com.itheima_02;
/*
 * 	String
 * 
 * 	通过构造方法创建的字符串对象和直接复制方式创建的字符串对象有什么区别呢？
 * 		通过构造方法创建字符串对象是在堆内存。
 * 		直接赋值方式创建对象是在方法区的常量池。
 * 
 * 	==:
 * 		比较基本数据类型的值
 * 		比较引用数据类型的地址值
 */
public class StringDemo2 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";
		
		System.out.println(s1 == s2);//false
		//比较的是两个字符串的地址
		
		String s3 = "hello";
		System.out.println(s1 == s3);//false
		System.out.println(s2 == s3);//true
	}
}
