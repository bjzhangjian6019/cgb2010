package cn.tedu.demo;
/**
 * �����ķ���ֵ��
 * �ܽ᣺
 * 1��ʹ��return�ؼ��֣��ѽ���ķ���ֵ���˵��õ�λ��
 * 2��ȷ�������ķ���ֵ���ͣ����û���κη���ֵ���Ǿ�ʹ��void
 * 		����з���ֵ��Ҫ�����������õ��������������,
 * 		return������������ͣ�����Ҫ�ڷ����з��ص��������͡�
 * @author Administrator
 */
public class Demo04 {

	public static void main(String[] args) {
		//�����ĵ���
		int s = sum(3, 5);
		System.out.println(s);
		String str = sum2("love", 52, 1);
		System.out.println(str);
		String str2 = sum3("love");
		System.out.println(str2);
		sum4();
	}
	//дһ������:return 
	public static int sum(int x, int y) {
		return x + y;//3+5=8�Ѽ���Ľ�������ظ����õ�λ��
	}
	//дһ��������return 
	public static String sum2(String s, int x, int y) {
		return s + x + y;
	}
	//дһ��������return 
	public static String sum3(String s) {
		return s + "1314";
	}
	public static void sum4() {
		System.out.println("void����");
	}

}
