package cn.tedu.demo;

import java.util.Scanner;

/**
 * 求圆的面积和周长:
 * double r
 * 面积：3.14*r*r;
 * 周长：2*3.14*r;
 * @author Administrator
 */
public class AreaDemo {
	public static void main(String[] args) {
//		long x = 123456789011l;
//		System.out.println(x);
		//半径
		//double r = 5;//固定
		System.out.println("请输入圆的半径：");
		//键盘接收数据
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		System.out.println("你输入圆的半径为：" + r);
		System.out.println("开始计算圆的面积与周长...");
		//计算圆的面积和周长 
		double s = 3.14 * r * r;
		double l = 3.14 * 2 * r;
//		double s = Math.PI * r * r;
//		double l = Math.PI * 2 * r;
		System.out.println("得到圆的面积：" + s);
		System.out.println("得到圆的周长：" + l);
		sc.close();
	}
}
