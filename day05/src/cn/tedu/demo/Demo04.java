package cn.tedu.demo;

import java.util.Arrays;

/**
 * ��������������Ϊ���� ��
 * ��ʽ�����ĸı�᲻��Ӱ��ʵ�ʲ����ĸı䣿����ı�
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
	//��ʽ������changeArr(int[] arr)----int[] arr 
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
