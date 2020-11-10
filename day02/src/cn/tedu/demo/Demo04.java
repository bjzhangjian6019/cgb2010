package cn.tedu.demo;

import java.util.Scanner;

/**
 * 需求：用户输入年份,
 * 通过比较，输出该年是平年还是闰年。
 * 1、能被400整除
 * 2、能被4整除，并且不能被100整除的数
 * @author Administrator
 */
public class Demo04 {
	
	public static void main(String[] args) {
		
		System.out.println("请输入查询的年份：");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {//判断条件
			System.out.println(year + "年是闰年！！");
		} else {
			System.out.println(year + "年是平年！！");
		}
		/*
		 * && ：都为真，才是真
		 * 
		 */
		String str = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ? "闰年" : "平年";
		System.out.println(year + "年是" + str);
		
		sc.close();
	}

}
