package cn.tedu.demo;

import java.util.Scanner;

/*
 * if结构：
	商品打折：
		双十一
			满5000的，打5折
			满3000的，打8折
			满2000的，打9折
		原价由用户输入，输出原价和打折后的价格。
 */
public class Demo09 {
	public static void main(String[] args) {
		System.out.println("请输入商品的价格：");
		Scanner sc = new Scanner(System.in);
		double price = sc.nextDouble();
		double discount = price;
		if (price >= 5000) {
			discount = price * 0.5;
			// price >= 3000 && price < 5000
		} else if(price >= 3000) {
			discount = price * 0.8;
		} else if(price >= 2000) {
			discount = price * 0.9;
		}
		System.out.println("原价：" + price + "，打折之后的价格为：" + discount);
		sc.close();
	}
}
