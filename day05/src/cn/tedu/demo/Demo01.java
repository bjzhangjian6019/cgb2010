package cn.tedu.demo;
/**
 * 补充：
 * 增强性for循环：
 * @author Administrator
 */
public class Demo01 {
	public static void main(String[] args) {
		//数组的初始化---静态初始化
		int[] arr = {1,2,3,4};
		/*
		 * arr:遍历的数组
		 * int i：数组声明时候的数据类型,
		 * 数组每一个元素中的数据类型去做接收
		 */
		for (int i : arr) {
			System.out.println(i);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
