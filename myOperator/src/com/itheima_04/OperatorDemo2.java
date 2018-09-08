package com.itheima_04;

public class OperatorDemo2 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		//&& 有短路效果 左边false 右边不执行
		//& 没有短路效果
		System.out.println((x++ > 10) & (y++ > 20));
		System.out.println((x++ > 10) && (y++ > 20));
	}
}
