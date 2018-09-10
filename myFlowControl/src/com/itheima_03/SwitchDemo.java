package com.itheima_03;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		//switch(表达式){...}
		//表达式的要求：byte short int char
		//			JDK5以后可以是枚举
		//			JDK7以后可以是字符串
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个数字(1-7)：");
		int weekday = sc.nextInt();
		
		switch(weekday) {
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期日");
				break;
			default:
				System.out.println("有错误");
				break;
		}
		
		
	}
}
