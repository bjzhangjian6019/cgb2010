package cn.tedu.demo;

import java.util.Random;

/**
 * 需求：求数组中奇数的个数。---方法封装
	主函数中进行调用。
*/
public class Demo09 {

	public static void main(String[] args) {
		numbers();
		testArr1();
	}
	//求数组中奇数的个数
	//设计方法
	public static void numbers() {
		//1、创建数组
		int[] arr = {12,34,56,76,75,3,1,88,93};
		//定义一个变量，用来存储奇数的个数
		int count = 0;
		//遍历数组
		for (int i = 0; i < arr.length; i++) {
			//取出每一个数组 中的元素
			//判断是不是奇数
			if (arr[i] % 2 == 1) {//true，奇数
				//个数加+
				count++;
				System.out.println(arr[i]);
			}
		}
		//打印出奇数的个数
		System.out.println("数组中奇数的个数为：" + count);
	}
	
	//创建一个数组，存放随机数
	public static void testArr1() {
		//创建数组
		int[] arr = new int[10];
		//遍历数组，修改默认值
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(100);
		}
		//打印出来
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
