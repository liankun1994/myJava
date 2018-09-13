package com.itheima_07;
/*
 * this关键字
 * 
 * 如果有局部变量名和成员变量名相同，在局部使用的时候，采用的是就近的原则。
 * this:代表所在类的对象引用
 * 		方法被哪个对象调用，this就代表那个对象
 */
public class Student {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
}
