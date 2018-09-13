package com.itheima_06;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "  hello  world  ";
		System.out.println(s1.trim());
		
		String s2 = "aa,bb,cc";
		String[] strArray = s2.split(",");
		for(int x=0;x<strArray.length;x++) {
			System.out.println(strArray[x]);
		}
	}
}
