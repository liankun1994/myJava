package com.itheima_04;
/*
 * �߼���������������ӹ�ϵ���ʽ
*/
public class OperatorDemo {
	public static void main(String[] args) {
		//�룺��false��false
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & true);
		System.out.println(false & false);
		System.out.println("---------");
		//����true��true
		System.out.println(true | true);
		System.out.println(true | false);
		System.out.println(false | true);
		System.out.println(false | false);
		System.out.println("---------");
		//�߼������ͬ��false����ͬ��true��
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		System.out.println("---------");	
		//��
		System.out.println(! true);
		System.out.println(! false);
		System.out.println("---------");
		
	}
}
