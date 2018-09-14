package com.itheima_01;

import java.util.ArrayList;

/*
 * ArrayList集合的遍历
 */
public class ArrayListDemo3 {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		System.out.println(array);
		
		for(int x=0; x<array.size(); x++) {
			String s = array.get(x);
			System.out.println(s);
		}
	}
}
