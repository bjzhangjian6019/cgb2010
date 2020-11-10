package cn.tedu.demo;
/**
 * 三元运算符：
 * boolean表达式?表达式1：表达式2;
 * @author Administrator
 * 需求：求两个数中的最大值。
 */
public class Demo03 {

	public static void main(String[] args) {
		//定义num1,num2
		int num1 = 3;
		int num2 = 5;
		//三元运算符：取到最大值，放到定义的max中存储
		int max = num1 > num2 ? num1 : num2;
		//输出最大值
		System.out.println(max);
		//三个数中的最大值
		int num3 = 2;
		max = num3 > max ? num3 : max;
		System.out.println(max);
	}
}
