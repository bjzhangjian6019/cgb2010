package cn.tedu.demo;

import java.util.Scanner;

/**
 * �����û��������,
 * ͨ���Ƚϣ����������ƽ�껹�����ꡣ
 * 1���ܱ�400����
 * 2���ܱ�4���������Ҳ��ܱ�100��������
 * @author Administrator
 */
public class Demo04 {
	
	public static void main(String[] args) {
		
		System.out.println("�������ѯ����ݣ�");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {//�ж�����
			System.out.println(year + "�������꣡��");
		} else {
			System.out.println(year + "����ƽ�꣡��");
		}
		/*
		 * && ����Ϊ�棬������
		 * 
		 */
		String str = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ? "����" : "ƽ��";
		System.out.println(year + "����" + str);
		
		sc.close();
	}

}
