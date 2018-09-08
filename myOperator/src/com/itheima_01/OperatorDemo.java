package com.itheima_01;

public class OperatorDemo {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		System.out.println(a+b);
		System.out.println(a%b);
	
		//有浮点数参与运算才能算出小数
		System.out.println(3.0/4);
		
		/*字符参与加法运算，使用编码
		 * 'A' 65
		 * 'a' 97
		 * '0' 48
		 */
		System.out.println('A' + 1);
		System.out.println(1 + 'A');
		
	}
}
