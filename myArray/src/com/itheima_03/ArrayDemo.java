package com.itheima_03;
/*
 * ��������С���⣺
 * 		ArrayIndexOutOfBoundsException: ��������Խ���쳣
 * 			������ԭ�����Ƿ����˲����ڵ�����
 * 		NullPointerException: ��ָ���쳣
 * 			������ԭ�������Ѿ�����ָ����ڴ�������ˣ��㻹ʹ��������ȥ����Ԫ��
 */
public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		System.out.println(arr[3]);
		
		//�������ͣ��࣬��ڣ�����
		//�������ճ�����null���ǿ��Ը�ֵ���������͵�
		arr = null;
		System.out.println(arr[1]);
	}
}
