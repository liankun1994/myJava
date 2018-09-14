package com.itheima_01;

import java.util.ArrayList;

/*
 * 集合类
 * 
 * 为什么会出现集合类:
 * 		我们学习的是面向对象编程语言，面向对象编程语言对事物的描述都是通过对象来体现的。
 * 		为了方便对多个对象进行操作，就有了集合类！
 * 
 * 特点:
 * 		长度可变。		
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("hello");
		array.add("world");
		array.add("java");
		//添加元素
		
		array.add(1,"android");
		//在指定的索引出添加一个元素
		
		System.out.println(array);
		//输出的不是地制值
		
		
		
	}
}
