package cn.tedu.demo;

import java.util.Scanner;

/*
 * if�ṹ��
	��Ʒ���ۣ�
		˫ʮһ
			��5000�ģ���5��
			��3000�ģ���8��
			��2000�ģ���9��
		ԭ�����û����룬���ԭ�ۺʹ��ۺ�ļ۸�
 */
public class Demo09 {
	public static void main(String[] args) {
		System.out.println("��������Ʒ�ļ۸�");
		Scanner sc = new Scanner(System.in);
		double price = sc.nextDouble();
		double discount = price;
		if (price >= 5000) {
			discount = price * 0.5;
			// price >= 3000 && price < 5000
		} else if(price >= 3000) {
			discount = price * 0.8;
		} else if(price >= 2000) {
			discount = price * 0.9;
		}
		System.out.println("ԭ�ۣ�" + price + "������֮��ļ۸�Ϊ��" + discount);
		sc.close();
	}
}
