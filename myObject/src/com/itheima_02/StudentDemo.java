package com.itheima_02;
/*
 * Student��һ��ѧ�����������࣬main�������ʺϷ��������档
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s);
		//com.itheima_02.Student@63753b6d
		
		System.out.println(s.name);
		//null
		System.out.println(s.age);
		//0
		
		s.name = "����";
		s.age = 24;
		
		System.out.println(s.name);
		System.out.println(s.age);
		
		s.study();
		s.eat();
	}

}
