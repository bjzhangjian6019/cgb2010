package cn.tedu.demo;

import java.util.Scanner;

/**
 * ����1���û��������,�·ݣ����������ж����졣
 * 
 * Scanner 
 * ������int  year ; int month  
 * 		int days;
 * ���ģ���Ƹ�������ж�������㷨��
 * 		1-3-5-7-8-10-12  31
 * 		4-6-9-11         30
 * 		2   ƽ28  ��29
 * @author Administrator
 */
public class Demo02 {
	public static void main(String[] args) {
		int year = 0;
		int month = 0;
		int days = 31;//Ĭ����31��
		System.out.println("���������ѯ����ݣ�");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		System.out.println("���������ѯ���·ݣ�");
		month = sc.nextInt();
		testDays(year, month, days);
		sc.close();
	}

	//����㷨----����
	public static void testDays(int year, int month, int days) {
		//����㷨
		switch (month) {//
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			//					if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			//						days = 29;
			//					} else{
			//						days = 28;
			//					}
			days = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28;
			break;
		}
		System.out.println(year + "��" + month + "����" + days + "�죡����");
	}

}
