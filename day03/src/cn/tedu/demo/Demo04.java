package cn.tedu.demo;

/**
 * ������1-100֮�������ż���ĺ�
 * ������
 * 		1������һ����͵ı�������ʼ����ֵΪ0��
 * 		2����ȡ1-100֮�������,ʹ��forѭ��
 * 		3��ȡ��1-100֮�����е�ż��:
 * 			 �ж������ǲ���ż��?,�����,ִ�в���4
 * 		4������ż���ۼ�
 * 		5�������͵ı�������
 * @author Administrator
 */
public class Demo04 {
	public static void main(String[] args) {
		System.out.println("start");
		sum();
		sum1();
		int sum = sum(1, 1001);
		System.out.println("sum = " + sum);
		System.out.println("over");
	}
	/**1+2+3+4+...+100=5050*/
	public static void sum() {
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	/**��1-100֮�����е�ż����*/
	public static void sum1() {
		int sum = 0;
		for (int i = 0; i < 101; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	public static int sum(int num1, int max) {
		int sum = 0;
		for (int i = num1; i < max; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
}
