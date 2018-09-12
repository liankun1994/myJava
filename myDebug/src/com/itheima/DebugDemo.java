package com.itheima;
/*
 * 断点调试的作用：
 * 		A:查看程序的执行流程
 * 		B:调试程序
 * 
 * 断点：
 * 		其实就是一个标记
 * 
 * 在哪里加断点呢?
 * 		哪里不会加哪里
 * 
 * 如何加断点呢？
 * 		在代码区域的左边双击即可
 * 
 * 如何运行加断点的程序呢？
 * 		代码区域--右键--Debug As--Java APPlication
 * 		弹出一个框框让我们选择是否进入Debug视图，我们选择yes。
 * 
 * 如何让程序往下执行呢？
 * 		按F6
 * 
 * 看哪些区域呢？
 * 		代码区域：看程序的执行流程
 * 		Debug区域：看程序的执行流程
 * 		Variables：变量的变化
 * 		Console：看程序的输入和输出
 * 
 * 如何去掉断点呢？
 * 		A:把加断点的动作再来一遍
 * 		B:在Debug视图中，找到Breakpoints，选中要删除的断点，点击双叉即可
 */
public class DebugDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}
}
