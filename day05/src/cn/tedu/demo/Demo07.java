package cn.tedu.demo;
/**
 * 二维数组的遍历：
 * 
 * @author Administrator
 *
 */
public class Demo07 {
	
	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(arr[0]);//1
		//第一个一维数组
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[0][i]);
		}
		
		//获取第二个
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[1][i]);
		}
		
		//获取第三个
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[2][i]);
		}
		System.out.println("---------------");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
