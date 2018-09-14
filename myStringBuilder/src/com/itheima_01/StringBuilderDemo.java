package com.itheima_01;
/*
 * StringBuilder:是一个可变的字符串。字符串缓冲区类。
 * 
 * String和StringBuilder的区别:
 * 		String的内容是固定的。
 * 		StringBuilder的内容是可变的。
 * 
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		//容量，初始为16
		System.out.println(sb.length());
		//长度
	}
}
