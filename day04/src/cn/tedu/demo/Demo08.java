package cn.tedu.demo;
/**
 * ����ı�����
 * arr[0]
 * forѭ��
 * @author Administrator
 *
 */
public class Demo08 {

	public static void main(String[] args) {
		
		int[] arr = {34,2,12,67,3};
		//������ÿһ��Ԫ��
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
		//forѭ��������������Ԫ��
		/*
		 * ��ʼλ�ã���0��ʼ
		 * ���Χ: ����±�arr.length - 1
		 * i++:�����±�ı仯����˳��ġ�
		 * i������±�
		 */
		for (int i = 0; i <= arr.length - 1; i++) {
			//����������±���д�ӡ
			System.out.println(arr[i]);
		}
	}
}
