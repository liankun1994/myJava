package com.itheima_05;
/*
 * 二维数组定义格式：
 * 		A:数据类型[][] 数组名; (推荐的方式)
 * 		B:数据类型 数组名[][];
 * 		C:数据类型[] 数组名[];
 * 初始化:
 * 		A:动态初始化
 * 			数据类型[][] 数组名 = new 数据类型[m][n];
 * 			m表示的二维数组的中的一位数组的个数
 * 			n表示的是一位数组中的元素个数
 * 		B:静态初始化
 * 			数据类型[][] 数组名 = new 数据类型[][]{{元素...},{元素...},{元素...},...};
 * 			简化格式:
 * 			数据类型[][] 数组名 = {{元素...},{元素...},{元素...},...};
 */
public class ArrayArrayDemo {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(arr);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		/*
		 * [[I@3b192d32
			[I@16f65612
			[I@311d617d
		 */
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + "  ");
				//不带换行的输出方式
			}
			System.out.println();
			//添加一个空行
		}
	}

}
