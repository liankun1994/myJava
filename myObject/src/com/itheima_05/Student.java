package com.itheima_05;
/*
 * pirvate�ؼ���
 * get set
 */
public class Student {
	String name;
	private int age;
	
	public void setAge(int a) {
		if(a<0 ||a>200) {
			System.out.println("�������������");
		}else {
			age = a;		
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void show() {
		System.out.println("�����ǣ�" + name + ",������" + age);
	}
}
