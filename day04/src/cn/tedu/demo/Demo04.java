package cn.tedu.demo;
/**
 * 方法的返回值：
 * 总结：
 * 1、使用return关键字，把结果的返回值给了调用的位置
 * 2、确定方法的返回值类型，如果没有任何返回值，那就使用void
 * 		如果有返回值，要看参与运算后得到结果的数据类型,
 * 		return后跟的数据类型，就是要在方法中返回的数据类型。
 * @author Administrator
 */
public class Demo04 {

	public static void main(String[] args) {
		//方法的调用
		int s = sum(3, 5);
		System.out.println(s);
		String str = sum2("love", 52, 1);
		System.out.println(str);
		String str2 = sum3("love");
		System.out.println(str2);
		sum4();
	}
	//写一个方法:return 
	public static int sum(int x, int y) {
		return x + y;//3+5=8把计算的结果，返回给调用的位置
	}
	//写一个方法：return 
	public static String sum2(String s, int x, int y) {
		return s + x + y;
	}
	//写一个方法：return 
	public static String sum3(String s) {
		return s + "1314";
	}
	public static void sum4() {
		System.out.println("void方法");
	}

}
