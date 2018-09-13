package com.itheima_02;
/*
 * Student是一个学生事物描述类，main方法不适合放在它里面。
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
		
		s.name = "张三";
		s.age = 24;
		
		System.out.println(s.name);
		System.out.println(s.age);
		
		s.study();
		s.eat();
	}

}
