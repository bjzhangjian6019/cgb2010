package cn.tedu.demo;

import java.util.Random;

/**
 * �����������������ĸ�����---������װ
	�������н��е��á�
*/
public class Demo09 {

	public static void main(String[] args) {
		numbers();
		testArr1();
	}
	//�������������ĸ���
	//��Ʒ���
	public static void numbers() {
		//1����������
		int[] arr = {12,34,56,76,75,3,1,88,93};
		//����һ�������������洢�����ĸ���
		int count = 0;
		//��������
		for (int i = 0; i < arr.length; i++) {
			//ȡ��ÿһ������ �е�Ԫ��
			//�ж��ǲ�������
			if (arr[i] % 2 == 1) {//true������
				//������+
				count++;
				System.out.println(arr[i]);
			}
		}
		//��ӡ�������ĸ���
		System.out.println("�����������ĸ���Ϊ��" + count);
	}
	
	//����һ�����飬��������
	public static void testArr1() {
		//��������
		int[] arr = new int[10];
		//�������飬�޸�Ĭ��ֵ
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(100);
		}
		//��ӡ����
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
