package cn.tedu.demo;

import java.util.Random;
import java.util.Scanner;

/**
 * //�����������Ϸ,ʹ��do-while
 * @author Administrator
 *
 */
public class Demo09 {

	public static void main(String[] args) {
		/*
		 * ��������Ϸ��
		 * 1���������һ������. num   Random
		 * 2����ʼ�£�while
		 * 	�û���������֣�guess    num
		 * 	�û����������������������֣����Ƚϣ�
		 * 	��������ִ���������������֣���ʾ���´���
		 * 	���������С��������������֣���ʾ����С��
		 * 	��������ֵ���������������֣���ʾ���¶���
		 * 3����Ϸ����
		 * ����-1,�˳�;
		 */
		Random rand = new Random();
		int num = rand.nextInt(1000);
		System.out.println("��Ҫ�µ����֣�" + num);
		Scanner sc = new Scanner(System.in);
		int guess;
		//��ʼ��---���ĵ��߼�
		do {//�ж�����
			System.out.println("��������Ҫ�µ�����(1-1000),�˳�������-1��");
			guess = sc.nextInt();
			if (guess == -1) {
				//�˳�
				break;
			} else if(guess > num) {
				System.out.println("�´���");
			} else if(guess < num) {
				System.out.println("��С��");
			} 
		}while (guess != num);
		if (guess == num) {
			System.out.println("�¶��ˣ�����");
		} else {
			System.out.println("��ӭ�ٲ£�����");
		}
		
		
		
	}
	
}
