package cn.tedu.demo;

import java.util.Arrays;

/**
 * 冒泡排序：
 * 算法：掌握
 * @author Administrator
 */
public class Demo03 {
	public static void main(String[] args) {
		int[] arr = {3,5,6,7,32,8,9};
		arr = bubbleSorted(arr);
		System.out.println(Arrays.toString(arr));
	}
	//定义一个方法：参数：int[]数组   返回值是：int[]
	public static int[] bubbleSorted(int[] arr) {
		//优化：
		boolean flag;//true：代表排好序   false:没有排好序
		for (int i = 0; i < arr.length - 1; i++) {//数组中有n个元素，比较n-1趟。
			flag = true;//假设剩下的元素已经排好序了
			//每一趟次数
			for (int j = 0; j < arr.length - 1 - i; j++) {
				//相邻元素的比较
				//如果前面的元素大于后面的元素，进行交换
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					//如果元素发生了交换，说明剩下的元素是没有排好序的
					flag = false;
					/*
					 * int x = 3 ; int y = 2 
					 * int temp = x;
					 * x = y;
					 * y = temp;
					 */
				}
			}
			System.out.println("i：" + i);
			if (flag) {
				break;//跳出循环
			}
		}
		return arr;
	}
}
