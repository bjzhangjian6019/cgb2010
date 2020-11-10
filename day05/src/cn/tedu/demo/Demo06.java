package cn.tedu.demo;

/**
 * 二维数组：
 * 	动态初始化：
 * 	静态初始化：
 * 
 * @author Administrator
 *
 */
public class Demo06 {

	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		//System.out.println(arr[0][3]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		//System.out.println(arr[2][0]);
		
		int[][] arr1 = {{1,2,3},{4,5,6}};
		System.out.println(arr1);
		System.out.println(arr1[0]);//数组 
		System.out.println(arr1[1]);
		//System.out.println(arr1[2]);
		
	}
	
}
