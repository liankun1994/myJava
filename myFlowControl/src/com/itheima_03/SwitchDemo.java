package com.itheima_03;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		//switch(���ʽ){...}
		//���ʽ��Ҫ��byte short int char
		//			JDK5�Ժ������ö��
		//			JDK7�Ժ�������ַ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ������(1-7)��");
		int weekday = sc.nextInt();
		
		switch(weekday) {
			case 1:
				System.out.println("����һ");
				break;
			case 2:
				System.out.println("���ڶ�");
				break;
			case 3:
				System.out.println("������");
				break;
			case 4:
				System.out.println("������");
				break;
			case 5:
				System.out.println("������");
				break;
			case 6:
				System.out.println("������");
				break;
			case 7:
				System.out.println("������");
				break;
			default:
				System.out.println("�д���");
				break;
		}
		
		
	}
}
