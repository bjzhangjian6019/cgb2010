package cn.tedu.demo;
/**
 * continue��ʹ�ã�
 * ���ã��������ѭ����������һ��ѭ����
 * @author Administrator
 */
public class Demo11 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if (i % 3 == 0) {
				//break;//�����2��
				continue;//���6��
			}
			System.out.println("˫ʮһ��������չ��ﳵ������" + i);
		}
	}
}
