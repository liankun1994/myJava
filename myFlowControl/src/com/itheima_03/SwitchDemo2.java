package com.itheima_03;

import java.util.Scanner;

/*
 * case´©Í¸
 */
public class SwitchDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("´º¼¾");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("ÏÄ¼¾");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Çï¼¾");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("¶¬¼¾");
			break;
		default:
			System.out.println("ÄãµÄÊäÈëÓĞÎó");
		}
	}
}
