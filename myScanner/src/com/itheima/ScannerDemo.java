package com.itheima;
import java.util.Scanner;
/*
 * 在一个类中
 * package > import > class
*/
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个数");
		int i  = sc.nextInt();
		System.out.println("结果：" + i);
		
		System.out.println("请再输入一个数");		
		int j = sc.nextInt();
		System.out.println("结果：" + (i +j));
	}
}
