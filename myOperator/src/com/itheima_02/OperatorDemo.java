package com.itheima_02;

public class OperatorDemo {
	public static void main(String[] args) {
		//扩展的负值运算符，隐含了强制类型转换。
		//s += 1; 相当于 s = (short)(s + 1);
		short s = 1;
		s += 1;
		System.out.println(s);
	}
}
