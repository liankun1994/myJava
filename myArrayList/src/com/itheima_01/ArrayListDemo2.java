package com.itheima_01;

import java.util.ArrayList;

/*
 * ArrayList�Ļ�������
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		System.out.println(array);
		
		System.out.println(array.get(0));
		//��ȡԪ��
		
		System.out.println(array.size());
		//�񼯺ϳ���
		
		System.out.println(array.remove("world"));
		System.out.println(array);
		//ɾ��ָ��Ԫ�أ�����ɾ���Ƿ�ɹ���
		
		System.out.println(array.remove(0));
		System.out.println(array);
		//ɾ��ָ��������Ԫ��
		
		System.out.println(array.set(0, "android"));
		System.out.println(array);
		//�޸�ָ��������Ԫ�أ����ر��޸ĵ�Ԫ��ԭ����ֵ��
		
	}
}
