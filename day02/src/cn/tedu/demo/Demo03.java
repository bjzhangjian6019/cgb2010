package cn.tedu.demo;
/**
 * ��Ԫ�������
 * boolean���ʽ?���ʽ1�����ʽ2;
 * @author Administrator
 * �������������е����ֵ��
 */
public class Demo03 {

	public static void main(String[] args) {
		//����num1,num2
		int num1 = 3;
		int num2 = 5;
		//��Ԫ�������ȡ�����ֵ���ŵ������max�д洢
		int max = num1 > num2 ? num1 : num2;
		//������ֵ
		System.out.println(max);
		//�������е����ֵ
		int num3 = 2;
		max = num3 > max ? num3 : max;
		System.out.println(max);
	}
}
