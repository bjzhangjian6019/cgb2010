package cn.tedu.demo;
/**
 * forѭ����
 * 
 * @author Administrator
 *
 */
public class Demo03 {

	public static void main(String[] args) {
		//���󣺴�ӡ10���������;  alt+ctrl+�¼�
//		System.out.println("���");
//		System.out.println("���");
//		System.out.println("���");
//		System.out.println("���");
//		System.out.println("���");
//		System.out.println("���");
//		System.out.println("���");
//		System.out.println("���");
//		System.out.println("���");
//		System.out.println("���");
		
		/*
		 * int i = 1;//�ӵ�1�ο�ʼ��ӡ   i��ʾ����
		 * i <= 10;//��10�ͽ�����---��Χ10
		 * i++; �����ڰ���+1�ķ�ʽ�����ε����ġ�
		 */
		for (int i = 1; i <= 10; i++) {
			System.out.println("��գ�");
		}
		/*
		 * ִ��˳��
		 * i = 1;  1 <= 10; true ���   --- i++  i = 2;
		 * i = 2;  2 <= 10; true ���   --- i++  i = 3;
		 * i = 3;  3 <= 10; true ���   --- i++  i = 4;
		 * ...
		 * i = 10;  10 <= 10; true ���  ---i++  i = 11;
		 * i = 11;  11 <= 10? false ѭ������;
		 */
		
		//����1����ӡ10��0,����ִ�й���д����.
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		
		//����2����ӡ��8   88   888   8888
		System.out.println(8);
		System.out.println(88);
		System.out.println(888);
		System.out.println(8888);
		System.out.println("----------------------");
		/*
		 * ��ӡ��8   88   888   8888
		 * ��һ��ѭ�������8,int i = 8;
		 * 8					8
		 * 8----88   	 		8*10+8=88
		 * 8---88---888  		88*10+8=888
		 * 8---88---888-8888    888*10+8=8888
		 */
		for (int i = 8; i <= 8888; i = i*10+8) {
			System.out.println(i);
		}
		/*
		 * ִ��˳��
		 * i = 8;  8 <= 8888;  true  8; i = i*10+8; i=88;
		 * i = 88; 88 <= 8888; true  88; i = i * 10 + 8;i=888;
		 * i = 888; 888 <= 8888;true 888;i = i * 10 + 8; i= 8888;
		 * i = 8888; 8888 <= 8888;true 8888; i = i*10+8;i = 88888;
		 * i = 88888;88888 <= 8888;false ѭ������
		 * 
		 */
		/*
		 * ��ҵ��
		 * 1/(1 * 3) + 1/(3 * 5) + 1/(5 * 7) + 1/(7 * 9) +��  ��
		 */
	}
	
}
