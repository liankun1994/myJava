package com.itheima_04;

public class OperatorDemo2 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		//&& �ж�·Ч�� ���false �ұ߲�ִ��
		//& û�ж�·Ч��
		System.out.println((x++ > 10) & (y++ > 20));
		System.out.println((x++ > 10) && (y++ > 20));
	}
}
