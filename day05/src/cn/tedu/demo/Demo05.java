package cn.tedu.demo;
/**
 * ��������������Ϊ��������ʽ��������ʽ�����ĸı䲻��Ӱ��ʵ�ʲ����ĸı䡣
 * @author Administrator
 */
public class Demo05 {
	public static void main(String[] args) {
		int x = 5;
		int y = 6;
		System.out.println("x = " + x + ", y = " + y);//5,6
		change(x,y);
		System.out.println("----------------------");
		System.out.println("x = " + x + ", y = " + y);//5,6
	}
	private static void change(int x, int y) {
		System.out.println("x = " + x + ", y = " + y);//5,6
		y = x;//5
		y = x + y;//10
		System.out.println("x = " + x + ", y = " + y);//5,10
	}
}
