package cn.tedu.demo;
/**
 * 基本数据类型作为方法的形式参数，形式参数的改变不会影响实际参数的改变。
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
