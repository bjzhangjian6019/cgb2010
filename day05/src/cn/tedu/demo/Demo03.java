package cn.tedu.demo;

import java.util.Arrays;

/**
 * ð������
 * �㷨������
 * @author Administrator
 */
public class Demo03 {
	public static void main(String[] args) {
		int[] arr = {3,5,6,7,32,8,9};
		arr = bubbleSorted(arr);
		System.out.println(Arrays.toString(arr));
	}
	//����һ��������������int[]����   ����ֵ�ǣ�int[]
	public static int[] bubbleSorted(int[] arr) {
		//�Ż���
		boolean flag;//true�������ź���   false:û���ź���
		for (int i = 0; i < arr.length - 1; i++) {//��������n��Ԫ�أ��Ƚ�n-1�ˡ�
			flag = true;//����ʣ�µ�Ԫ���Ѿ��ź�����
			//ÿһ�˴���
			for (int j = 0; j < arr.length - 1 - i; j++) {
				//����Ԫ�صıȽ�
				//���ǰ���Ԫ�ش��ں����Ԫ�أ����н���
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					//���Ԫ�ط����˽�����˵��ʣ�µ�Ԫ����û���ź����
					flag = false;
					/*
					 * int x = 3 ; int y = 2 
					 * int temp = x;
					 * x = y;
					 * y = temp;
					 */
				}
			}
			System.out.println("i��" + i);
			if (flag) {
				break;//����ѭ��
			}
		}
		return arr;
	}
}
