package cn.tedu.demo;

/**
 * ���������أ�
 * 	һ������,����������ͬ�������б�ͬ
 * @author Administrator
 */
public class Demo05 {
	public static void main(String[] args) {
		//�����ĵ���
		sum("������", 123);
		
	}
	//����������
	public static void sum(int x, int y) {
		System.out.println(x + y);
	}
	public static void sum(int x, int y, int z) {
		System.out.println(x + y + z);
	}
	public static void sum(String x, int y) {
		System.out.println(x + y);
	}
	public static void sum(String x, int y, int z) {
		System.out.println(x + y + z);
	}
	public static void sum(int y, int z, String x) {
		System.out.println(x + y + z);
	}
	
	/*	��ϰ��
	 * дһ��print���������أ�
	 * ��ӡint/double/String/boolean/char
	 */

}



