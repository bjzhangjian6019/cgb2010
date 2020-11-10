package cn.tedu.demo;
/**
 * 	练习：
 * 写一个print方法的重载：
 * 打印int/double/String/boolean/char
 */
public class Demo06 {
	
	public static void main(String[] args) {
		print(123);
		print('燕');
		print("燕京理工学院");
		print(3.14);
		print(true);
	}
	//重载
	public static void print(int x) {
		System.out.println(x);
	}
	public static void print(double x) {
		System.out.println(x);
	}
	public static void print(String x) {
		System.out.println(x);
	}
	public static void print(boolean x) {
		System.out.println(x);
	}
	public static void print(char x) {
		System.out.println(x);
	}
}
	


