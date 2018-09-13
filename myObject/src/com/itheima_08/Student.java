package com.itheima_08;

/*
 * 构造方法:
 * 		给对象的数据进行初始化
 * 
 * 格式:
 * 		方法名和类名相同
 * 		没有返回值类型，连void都不能写
 * 		没有具体的返回值
 * 
 * 构造方法的注意事项:
 * 		如果我们没有给出构造方法，系统将会提供一个默认的无参构造方法供我们使用。
 * 		如果我们给出了构造方法，系统将不再提供默认的构造方法供我们使用。
 * 			这个时候，如果我们想使用无参构造方法，我们必须自己提供。
 * 			推荐：自己给无参构造方法。
 * 		构造方法也是可以重载的。
 */
public class Student {
	private String name;
	private int age;

	public Student() {
		System.out.println("调用了无参构造方法");
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
