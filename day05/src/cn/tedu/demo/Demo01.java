package cn.tedu.demo;
/**
 * ���䣺
 * ��ǿ��forѭ����
 * @author Administrator
 */
public class Demo01 {
	public static void main(String[] args) {
		//����ĳ�ʼ��---��̬��ʼ��
		int[] arr = {1,2,3,4};
		/*
		 * arr:����������
		 * int i����������ʱ�����������,
		 * ����ÿһ��Ԫ���е���������ȥ������
		 */
		for (int i : arr) {
			System.out.println(i);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
