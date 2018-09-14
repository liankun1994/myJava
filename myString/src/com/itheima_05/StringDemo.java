package com.itheima_05;
/*
 * String类的转换功能
 */

public class StringDemo {
	public static void main(String[] args) {
		String s = "abcde";
		
		char[] chs = s.toCharArray();
		for(int x=0;x<chs.length;x++) {
			System.out.println(chs[x]);
		}
		
		System.out.println(s.toLowerCase());
		//全部转换为小写
		
		System.out.println(s.toUpperCase());
		//全部转换为大写
		
	}
}
