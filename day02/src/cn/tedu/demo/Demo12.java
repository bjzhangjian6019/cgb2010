package cn.tedu.demo;

import java.util.Scanner;

/**
 * switch�ṹ��
 * 	ʹ��String���͵�/char���͵�
 * @author Administrator
 */
public class Demo12 {
	
	public static void main(String[] args) {
		String indexStr = "ƴ���1";
		switch (indexStr) {//�ж�����
		case "ƴ���":
			System.out.println("����������������������ͳ����6Ʊ,���ҿ�һ��.");
			//������break��ʱ�򣬻�����ִֹͣ��
			break;
		case "����":
			System.out.println("��ӭʹ�þ�������֧��iPhone 12 pro max");
			break;
		case "��Ѷ��Ƶ":
			System.out.println("��ӭ��ֵ��ѶVIP���񣡣���");
			break;
		default:
			System.out.println("�Ա�˫ʮһ�����ˣ�����");
		}
		
		System.out.println("----------char---------------");
		char c = 'b';
		Scanner sc = new Scanner(System.in);
		char[] cs = sc.next().toCharArray();
		char c1 = cs[0];
		System.out.println(c1);
		switch (c1) {
		case 'a':
			System.out.println("a++++++++++");
			break;
		}
		
	}

}
