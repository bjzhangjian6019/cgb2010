package cn.tedu.demo;
/**
 * �����Ĵ��Σ�
 * �ܽ᣺
 * 1�������Ĳ����б������У�������;����Ƕ���������ö��ŷָ���
 * 2�������⣺ʵ�����βε�����
 *    ʵ�Σ��ǽ��з����ĵ��õ�ʱ�򣬴����ʵ�ʲ���
 *    sum2(3,2);
 *    �βΣ����ڶ��巽����ʱ�򣬲����б���淶д�Ĳ��������� ������
 *    sum3(int x ,int y, String str)
 * 3��  ƥ���ϵ��������Ҫƥ��+��������ҲҪ����ƥ��
 * @author Administrator
 */
public class Demo03 {
	public static void main(String[] args) {
		//�����ĵ���------ע�������Ҫ�Ҹ�,����������Ҫƥ��
		sum(5);
//		sum(qwer);
		sum2(3, 2);
		sum3(1, 3, "Love you");
		sum4("love", 52, 0);
	}
	//����һ������:sum(���������� ��������)
	public static void sum(int x) {
		System.out.println(x);
	}
	//����һ��������sum2(���������� ��������)
	public static void sum2(int x, int y) {
		System.out.println(x+y);
	}
	//����һ��������sum3(���������� ��������)
	public static void sum3(int x, int y, String str) {
		System.out.println(x+y+str);
	}
	//����һ��������sum4(���������� ��������)
	public static void sum4(String str, int x, int y) {
		System.out.println(str+x+y);
	}
}
