package com.itheima_04;
/*
 * �����Ĳ�������ǻ����������ͣ���ʽ�����ĸı䲻Ӱ��ʵ�ʲ���
 * ����������������ͣ���ʽ�����ĸı�ֱ��Ӱ��ʵ�ʲ���
 * 
 * ��ʽ���������ڽ���ʵ�ʲ����ı���
 * ʵ�ʲ�����ʵ�ʲ�������ı���
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
	
	//����ʵ�ֽ����Ĺ���
	public static void swap(int a,int b) {
		int temp;
		temp = a;
		a = b;
		b = a;
	}
	
	//����ʵ�ּӱ��Ĺ���
	public static void change(int[] arr) {
		for(int i=0;i<0;i++) {
			arr[i] *= 2;
		}
	}
	
	
}
