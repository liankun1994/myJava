package com.itheima_08;

/*
 * ���췽��:
 * 		����������ݽ��г�ʼ��
 * 
 * ��ʽ:
 * 		��������������ͬ
 * 		û�з���ֵ���ͣ���void������д
 * 		û�о���ķ���ֵ
 * 
 * ���췽����ע������:
 * 		�������û�и������췽����ϵͳ�����ṩһ��Ĭ�ϵ��޲ι��췽��������ʹ�á�
 * 		������Ǹ����˹��췽����ϵͳ�������ṩĬ�ϵĹ��췽��������ʹ�á�
 * 			���ʱ�����������ʹ���޲ι��췽�������Ǳ����Լ��ṩ��
 * 			�Ƽ����Լ����޲ι��췽����
 * 		���췽��Ҳ�ǿ������صġ�
 */
public class Student {
	private String name;
	private int age;

	public Student() {
		System.out.println("�������޲ι��췽��");
	}

	public Student(String name) {
		this.name = name;
	}

	public Student(int age) {
		this.age = age;
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void show() {
		System.out.println(name);
		System.out.println(age);
	}
}
