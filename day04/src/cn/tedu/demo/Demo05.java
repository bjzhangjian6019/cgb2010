package cn.tedu.demo;

/**
 * 方法的重载：
 * 	一个类中,方法名称相同，参数列表不同
 * @author Administrator
 */
public class Demo05 {
	public static void main(String[] args) {
		//方法的调用
		sum("哈哈哈", 123);
		
	}
	//方法的重载
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
	
	/*	练习：
	 * 写一个print方法的重载：
	 * 打印int/double/String/boolean/char
	 */

}



