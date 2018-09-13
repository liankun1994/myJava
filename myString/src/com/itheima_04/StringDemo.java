package com.itheima_04;
/*
 * String的获取方法
 */
public class StringDemo {
	public static void main(String[] args) {
		String s = "helloworld";
		
		System.out.println(s.length());
		//获取字符串的长度

		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		//获取指定索引处的字符

		System.out.println(s.indexOf("l"));
		System.out.println(s.indexOf("owo"));
		System.out.println(s.indexOf("ak"));
		//获取子串第一次出现的位置索引
		
		System.out.println(s.substring(0));
		System.out.println(s.substring(5));
		//从参数的位置索引截取到末尾
		
		System.out.println(s.substring(3, 8));
		//截取从索引3到索引7截取的字符串
	}
}
