package com.itheima_02;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		StringBuilder sb2 = sb.append("hello");
		System.out.println(sb == sb2);
		//true，地址相同
		
		sb.append(true);
		sb.append(100);
		System.out.println(sb);
		//appen连接
		
		System.out.println(sb.reverse());
		//反转
		
		sb.append(100).append("ok").append('2');
		//还可以这么写
	}
}
