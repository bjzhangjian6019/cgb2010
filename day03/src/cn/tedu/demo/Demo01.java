package cn.tedu.demo;

import java.util.Scanner;

/*
 * --���㹫ʽΪ��BMI=���أ�ǧ�ˣ�������ߣ��ף���ƽ����
		--�w���^�p BMI �� 18.5 
		--�������� 18.5�QBMI��24 
		--�^�أ�24�QBMI��27
		--�p�ȷ��֣�27�QBMI��30
		--�жȷ��֣�30�QBMI��35
		--�ضȷ��֣�BMI�R35
 */
public class Demo01 {
	
	public static void main(String[] args) {
		
		System.out.println("�������������(kg)��");
		Scanner sc = new Scanner(System.in);
		double weight = sc.nextDouble();
		System.out.println("������������(m): ");
		double height = sc.nextDouble();
		
		//���ø������㷨��ʽ��BMI=���أ�ǧ�ˣ�������ߣ��ף���ƽ��
		double bmi = weight/(height*height);
		if (bmi < 18.5) {
			System.out.println("���ع���");
		} else if(bmi >= 18.5 && bmi < 24) {
			System.out.println("������Χ");
		} else if(bmi >= 24 && bmi < 27) {
			System.out.println("����");
		} else if(bmi >= 27 && bmi < 30) {
			System.out.println("��ȷ���");
		} else if(bmi >= 30 && bmi < 35) {
			System.out.println("�жȷ���");
		} else if(bmi >= 35) {
			System.out.println("�ضȷ���");
		} 
		
		sc.close();
	}

}
