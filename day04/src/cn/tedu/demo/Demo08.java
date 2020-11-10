package cn.tedu.demo;
/**
 * 数组的遍历：
 * arr[0]
 * for循环
 * @author Administrator
 *
 */
public class Demo08 {

	public static void main(String[] args) {
		
		int[] arr = {34,2,12,67,3};
		//遍历出每一个元素
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
		//for循环解决遍历数组的元素
		/*
		 * 初始位置：从0开始
		 * 最大范围: 最大下标arr.length - 1
		 * i++:数组下标的变化，有顺序的。
		 * i数组的下标
		 */
		for (int i = 0; i <= arr.length - 1; i++) {
			//根据数组的下标进行打印
			System.out.println(arr[i]);
		}
	}
}
