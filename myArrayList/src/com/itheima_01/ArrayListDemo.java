package com.itheima_01;

import java.util.ArrayList;

/*
 * ������
 * 
 * Ϊʲô����ּ�����:
 * 		����ѧϰ����������������ԣ�������������Զ��������������ͨ�����������ֵġ�
 * 		Ϊ�˷���Զ��������в����������˼����࣡
 * 
 * �ص�:
 * 		���ȿɱ䡣		
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("hello");
		array.add("world");
		array.add("java");
		//���Ԫ��
		
		array.add(1,"android");
		//��ָ�������������һ��Ԫ��
		
		System.out.println(array);
		//����Ĳ��ǵ���ֵ
		
		
		
	}
}
