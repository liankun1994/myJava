package com.itheima_03;
/*
 * String Óë StringBuilder Ïà»¥×ª»»
 */
public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("hello").append("world");
		String s = sb.toString();
		System.out.println(s);
		
		String s2 = "helloworld";
		StringBuilder sb2 = new StringBuilder(s2);
		System.out.println(sb2);
	}
}
