package cn.tedu.demo;
/**
 * 数组的初始化
 * @author Administrator
 *
 */
public class Demo07 {
	
	public static void main(String[] args) {
		//动态初始化:
		int[] arr = new int[3];
		System.out.println(arr);//[I@15db9742  地址
		System.out.println(arr[0]);//0
		System.out.println(arr[1]);//0
		System.out.println(arr[2]);//0
		
		//静态初始化
		int[] arr2 = {1,3,5,7};
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		
		//char： h e l l o
		char[] arr3 = {'h','e','l','l','o'};
		char[] arr4 = new char[] {'h','e','l','l','o'};
		System.out.println(arr3);
		System.out.println(arr3.length);
		System.out.println(arr4.length);
		
		char[] arr5 = new char[5];
		arr5[0] = 'h';
		arr5[1] = 'e';
		arr5[2] = 'l';
		arr5[3] = 'l';
		arr5[4] = 'o';
		System.out.println(arr5);
		//ArrayIndexOutOfBoundsException
		arr5[5] = '1';
		System.out.println(arr5[5]);
		
		System.out.println("1234567");
		
		
		
		
		
	}

}
