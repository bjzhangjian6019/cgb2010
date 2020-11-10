package cn.tedu.demo;
/**
 * 方法的传参：
 * 总结：
 * 1、方法的参数列表：可以有，可以无;如果是多个参数，用逗号分隔开
 * 2、面试题：实参与形参的区别
 *    实参：是进行方法的调用的时候，传入的实际参数
 *    sum2(3,2);
 *    形参：是在定义方法的时候，参数列表李规范写的参数的类型 参数名
 *    sum3(int x ,int y, String str)
 * 3、  匹配关系：方法名要匹配+参数类型也要进行匹配
 * @author Administrator
 */
public class Demo03 {
	public static void main(String[] args) {
		//方法的调用------注意参数不要乱给,参数的类型要匹配
		sum(5);
//		sum(qwer);
		sum2(3, 2);
		sum3(1, 3, "Love you");
		sum4("love", 52, 0);
	}
	//定义一个方法:sum(参数的类型 参数名称)
	public static void sum(int x) {
		System.out.println(x);
	}
	//定义一个方法：sum2(参数的类型 参数名称)
	public static void sum2(int x, int y) {
		System.out.println(x+y);
	}
	//定义一个方法：sum3(参数的类型 参数名称)
	public static void sum3(int x, int y, String str) {
		System.out.println(x+y+str);
	}
	//定义一个方法：sum4(参数的类型 参数名称)
	public static void sum4(String str, int x, int y) {
		System.out.println(str+x+y);
	}
}
