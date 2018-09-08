package com.itheima_04;
/*
 * 逻辑运算符：用于连接关系表达式
*/
public class OperatorDemo {
	public static void main(String[] args) {
		//与：有false则false
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & true);
		System.out.println(false & false);
		System.out.println("---------");
		//或：有true则true
		System.out.println(true | true);
		System.out.println(true | false);
		System.out.println(false | true);
		System.out.println(false | false);
		System.out.println("---------");
		//逻辑异或：相同则false，不同则true。
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		System.out.println("---------");	
		//非
		System.out.println(! true);
		System.out.println(! false);
		System.out.println("---------");
		
	}
}
