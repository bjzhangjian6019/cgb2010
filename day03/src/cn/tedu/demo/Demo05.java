package cn.tedu.demo;
/**
 * forѭ����Ƕ�ף�
 * ����ѭ��ִ��1�Σ���ѭ��ִ��N��
 * @author Administrator
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		//�ܽ᣺��ѭ����iִ��1�Σ��ڲ�ѭ����j��Ҫִ��4�Ρ�
		/*
		 * ��һ��ѭ����i=1;1<4;true;
		 * 		�ڲ��������j��ֵ��1234,i����;i++  ;i=2
		 * �ڶ���ѭ����i=2;2<4;true;
		 * 		�ڲ��������j��ֵ��1234,i����;i++  ;i=3
		 * ������ѭ����i=3;3<4;true;
		 * 		�ڲ��������j��ֵ��1234,i����;i++  ;i=4
		 * ���Ĵ�ѭ����i=2;4<4;false;ѭ��������	
		 */
		for (int i = 1; i < 4; i++) {//��ѭ��ִ��3��
			System.out.println("��ѭ����" + i);
			for (int j = 1; j < 5; j++) {//��ѭ��ִ��4��
				System.out.println(j);
			}
		}
		
		System.out.println("---------------------------------");
		
		//��ѭ�����������У���ѭ������������
		for (int i = 1; i < 4; i++) {//��
			for (int j = 1; j < 3; j++) {//��
				System.out.print("*");
			}
			System.out.println();//����
		}
		/*
		 * ��һ����ѭ��:i=1,1<4;true;
		 * 			j=1;j<3;true;  *  ;j++;j=2;
		 * 			j=2;j<3;true;  ** ;j++;j=3;
		 * 			j=3;j<3;false;�ڲ�ѭ��������ִ��i++;i=2��
		 * �ڶ�����ѭ����i=2,2<4;true;
		 * 			j=1;j<3;true;  *  ;j++;j=2;
		 * 			j=2;j<3;true;  ** ;j++;j=3;
		 * 			j=3;j<3;false;�ڲ�ѭ��������ִ��i++;i=3��
		 * ��������ѭ����i=3;3<4;true;
		 * 			j=1;j<3;true;  *  ;j++;j=2;
		 * 			j=2;j<3;true;  ** ;j++;j=3;
		 * 			j=3;j<3;false;�ڲ�ѭ��������ִ��i++;i=4��
		 * ���Ĵ���ѭ����i=4;4<4;������������ѭ����ֹ.
		 * 			**
		 * 			**
		 * 			**
		 */
		
		/* ��ϰ1��
		 * ��ӡ99�˷���
		 */
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i*j + "     ");
			}
			System.out.println();//����
		}
		System.out.println("------------------------");
		/*
		 * ��ϰ2����ӡ
		 * 		*
		 * 		**
		 * 		***
		 * 		****
		 * 		*****
		 */
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
