package com.itheima;
import java.util.Scanner;
/*
 * ��һ������
 * package > import > class
*/
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ����");
		int i  = sc.nextInt();
		System.out.println("�����" + i);
		
		System.out.println("��������һ����");		
		int j = sc.nextInt();
		System.out.println("�����" + (i +j));
	}
}
