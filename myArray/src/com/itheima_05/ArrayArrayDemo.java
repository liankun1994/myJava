package com.itheima_05;
/*
 * ��ά���鶨���ʽ��
 * 		A:��������[][] ������; (�Ƽ��ķ�ʽ)
 * 		B:�������� ������[][];
 * 		C:��������[] ������[];
 * ��ʼ��:
 * 		A:��̬��ʼ��
 * 			��������[][] ������ = new ��������[m][n];
 * 			m��ʾ�Ķ�ά������е�һλ����ĸ���
 * 			n��ʾ����һλ�����е�Ԫ�ظ���
 * 		B:��̬��ʼ��
 * 			��������[][] ������ = new ��������[][]{{Ԫ��...},{Ԫ��...},{Ԫ��...},...};
 * 			�򻯸�ʽ:
 * 			��������[][] ������ = {{Ԫ��...},{Ԫ��...},{Ԫ��...},...};
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
				//�������е������ʽ
			}
			System.out.println();
			//���һ������
		}
	}

}
