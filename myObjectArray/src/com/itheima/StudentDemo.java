package com.itheima;

public class StudentDemo {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		
		Student s1 = new Student("张三",40);
		Student s2 = new Student("李四",35);
		Student s3 = new Student("王五",30);
		
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
		for(int x=0;x<students.length;x++) {
			Student s = students[x];
			System.out.println(s.getName());
			System.out.println(s.getAge());
		}
	}
}
