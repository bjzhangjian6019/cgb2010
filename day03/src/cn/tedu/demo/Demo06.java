package cn.tedu.demo;

import java.util.Random;
import java.util.Scanner;
/**
 * whileѭ����
 * 
 * ��������Ϸ��
 * 
 * @author Administrator
 *
 */
public class Demo06 {

	public static void main(String[] args) {
		
		//ѭ�����10������
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("----------------------");
		
		//1+2+3+...+100
		int j = 1;
		int sum = 0;
		while (j <= 100) {
			sum += j;
			j++;
		}
		System.out.println(sum);//5050
		
		System.out.println("----------------------");
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
		System.out.println("��������Ҫ�µ�����(1-1000),�˳�������0��");
		Scanner sc = new Scanner(System.in);
		int guess = sc.nextInt();
		//��ʼ��---���ĵ��߼�
		while (guess != num) {//�ж�����
			if (guess == -1) {
				//�˳�
				break;
			} else if(guess > num) {
				System.out.println("�´���");
			} else if(guess < num) {
				System.out.println("��С��");
			} 
			System.out.println("��������Ҫ�µ�����(1-1000),�˳�������0��");
			guess = sc.nextInt();
		}
		if (guess == num) {
			System.out.println("�¶��ˣ�����");
		} else {
			System.out.println("��ӭ�ٲ£�����");
		}
		
	}
	
}
