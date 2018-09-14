package com.itheima_01;

import java.util.ArrayList;

/*
 * ArrayList的基本操作
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		System.out.println(array);
		
		System.out.println(array.get(0));
		//获取元素
		
		System.out.println(array.size());
		//获集合长度
		
		System.out.println(array.remove("world"));
		System.out.println(array);
		//删除指定元素（返回删除是否成功）
		
		System.out.println(array.remove(0));
		System.out.println(array);
		//删除指定索引的元素
		
		System.out.println(array.set(0, "android"));
		System.out.println(array);
		//修改指定索引的元素（返回被修改的元素原来的值）
		
	}
}
