package com.itheima;
/*
 * �Զ����ɹ��췽��
 * 		���������Ҽ� -- Source -- Generate Constructors from Superclass... �޲ι��췽��
 * 		���������Ҽ� -- Source -- Generate Constructors using Fields... ���ι��췽��
 * �Զ�����get/set����
 * 		���������Ҽ� -- Source -- Generate Getters and Setters...
 */
public class Student {
	private String name;
	private int age;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
