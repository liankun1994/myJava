package com.itheima_02;
//û�з���ֵ�ķ���
public class MethodDemo {
	public static void main(String[] args) {
		printHelloWorld();
		printNumber(5);
	}
	
	public static void printHelloWorld() {
		System.out.println("HelloWorld!");
		System.out.println();
	}
	
	public static void printNumber(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
		System.out.println();
	}
}
