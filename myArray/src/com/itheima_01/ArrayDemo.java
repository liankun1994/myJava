package com.itheima_01;
/*
 * 数组是存储同一种数据类型的多个元素的容器。
 */
public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr;
		//定义数组
		int otherArr[];
		//这种定义方法不推荐。
		
		int[] arrA = new int[3];
		//动态初始化:只给出长度。
		
		System.out.println(arrA);
		//会输出地址值
		
		System.out.println(arrA[0]);
		//默认值为0
		
	}
}
