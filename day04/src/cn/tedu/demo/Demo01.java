package cn.tedu.demo;
/**
 * ������
 * 	��Ա�����;ֲ�����
 * 
 * @author Administrator
 *
 */
public class Demo01 {
	//��Ա����:�����ڷ����ⲿ�����ڲ������ý��г�ʼ��Ҳ����
	static int num;//Ĭ��ֵ��0
	static double num2;//Ĭ��ֵ��0.0
	static boolean num3;//Ĭ��ֵ��false
	
	public static void main(String[] args) {
		//�ֲ������������ڷ����ڲ������÷�Χ���Ƿ����ڲ�,����Ҫ���г�ʼ��
		int num4 = 5;
		System.out.println(num4);//�ֲ�����
//		byte num5;
//		System.out.println(num5);//����Ͳ�ͨ����ʹ�õ��Ǿֲ�����
		//������ͬʱʹ�þֲ������ͳ�Ա������ʱ��
		//����ֲ��������ͳ�Ա��������ͬ��ʱ������ʹ�þֲ�������
		int num = 10;
		System.out.println(num);//10---�ͽ�ԭ��
		
		System.out.println(num);//0,ʹ�õ��ǳ�Ա����
		System.out.println(num2);//0.0,ʹ�õ��ǳ�Ա����
		
		if (!num3) {//ֻ�����������������true����ִ��
			System.out.println("�Ұ��㣡����");
		}
		
	}
	

}
