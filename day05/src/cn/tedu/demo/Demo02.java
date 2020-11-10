package cn.tedu.demo;

import java.util.Arrays;

/**
 * Arrays:������
 * 		toString():�����������ݱ�ɴ�չʾ[1,2,3,4]
 * 		sort():����������������
 * @author Administrator
 */
public class Demo02 {
	public static void main(String[] args) {
		//����һ������
		int[] arr = {13,2,1,3,6,8,23};
		//������toString()��ӡ
		print(arr);//�����ĵ���
		sortArr(arr);//���������
		copyArr(arr);//��������и���
	}
	//����ĸ��ƣ�copyOf(1,2)  1���ŵ���Ҫ���Ƶ����飬2:�µĳ���
	public static void copyArr(int[] arr) {
		int[] arr1 = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr1));
		System.out.println("---------------------------------");
		//1��ԭ����arr����������Ԫ��-----���������
		arr1 = Arrays.copyOf(arr1, arr1.length + 2);
		System.out.println(Arrays.toString(arr1));
		//2����ԭ����arr�м���4��Ԫ��------���������
		arr1 = Arrays.copyOf(arr1, arr1.length - 4);
		System.out.println(Arrays.toString(arr1));
	}
	//���������
	public static void sortArr(int[] arr) {
		//����������������
		Arrays.sort(arr);
		//������ַ�����ʽ
		//[1, 2, 3, 6, 8, 13, 23]-----Ĭ���Ǵ�С�����
		System.out.println(Arrays.toString(arr));
	}

	//�����Ķ��壺ȷ������ֵ����  ȷ�������б�
	public static void print(int[] arr) {
		//		for (int i = 0; i < arr.length; i++) {
		//			System.out.println(arr[i]);
		//		}
		//ʹ�ù�����
		//toString(arr);//��ָ��������arr��������ݱ���ַ�������չʾ�ġ�
		String str = Arrays.toString(arr);
		//[1, 3, 6, 8, 23]
		System.out.println(str);
		//[1, 3, 6, 8, 23]
		System.out.println(Arrays.toString(arr));
	}
}
