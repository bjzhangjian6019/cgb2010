package cn.tedu.demo;

import java.util.Arrays;

/**
 * 引用数据类型作为参数 ：
 * 形式参数的改变会不会影响实际参数的改变？？会改变
 * @author Administrator
 */
public class Demo04 {

	public static void main(String[] args) {
		
		int[] arr = {1,3,6,9,10};
		System.out.println(Arrays.toString(arr));
		changeArr(arr);
		System.out.println(Arrays.toString(arr));
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
	}
	//形式参数：changeArr(int[] arr)----int[] arr 
	public static void changeArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {//6,10
				arr[i] *= 2;//12,20
			}
		}
		//1,3,12,9,20
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	
	
	
	
}
