package cn.tedu.demo;

import java.util.Arrays;

/**
 * Arrays:工具类
 * 		toString():把数组红的数据变成串展示[1,2,3,4]
 * 		sort():无序的数组进行排序。
 * @author Administrator
 */
public class Demo02 {
	public static void main(String[] args) {
		//定义一个数组
		int[] arr = {13,2,1,3,6,8,23};
		//方法：toString()打印
		print(arr);//方法的调用
		sortArr(arr);//数组的排序
		copyArr(arr);//对数组进行复制
	}
	//数组的复制：copyOf(1,2)  1：放的是要复制的数组，2:新的长度
	public static void copyArr(int[] arr) {
		int[] arr1 = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr1));
		System.out.println("---------------------------------");
		//1、原数组arr中增加两个元素-----数组的扩容
		arr1 = Arrays.copyOf(arr1, arr1.length + 2);
		System.out.println(Arrays.toString(arr1));
		//2、在原数组arr中减少4个元素------数组的缩容
		arr1 = Arrays.copyOf(arr1, arr1.length - 4);
		System.out.println(Arrays.toString(arr1));
	}
	//数组的排序
	public static void sortArr(int[] arr) {
		//对数组进行排序操作
		Arrays.sort(arr);
		//输出的字符串形式
		//[1, 2, 3, 6, 8, 13, 23]-----默认是从小到大的
		System.out.println(Arrays.toString(arr));
	}

	//方法的定义：确定返回值类型  确定参数列表
	public static void print(int[] arr) {
		//		for (int i = 0; i < arr.length; i++) {
		//			System.out.println(arr[i]);
		//		}
		//使用工具类
		//toString(arr);//将指定的数组arr里面的数据变成字符串进行展示的。
		String str = Arrays.toString(arr);
		//[1, 3, 6, 8, 23]
		System.out.println(str);
		//[1, 3, 6, 8, 23]
		System.out.println(Arrays.toString(arr));
	}
}
