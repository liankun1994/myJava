package com.itheima_04;
/*
 * 方法的参数如果是基本数据类型：形式参数的改变不影响实际参数
 * 如果参数是引用类型，形式参数的改变直接影响实际参数
 * 
 * 形式参数：用于接收实际参数的变量
 * 实际参数：实际参与运算的变量
 */
public class ArgsDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		swap(a,b);
		
		System.out.println(a);
		System.out.println(b);
		
		int[] arr = {1,2,3};
		change(arr);

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
	
	//不能实现交换的功能
	public static void swap(int a,int b) {
		int temp;
		temp = a;
		a = b;
		b = a;
	}
	
	//可以实现加倍的功能
	public static void change(int[] arr) {
		for(int i=0;i<0;i++) {
			arr[i] *= 2;
		}
	}
	
	
}
