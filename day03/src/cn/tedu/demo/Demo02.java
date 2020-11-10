package cn.tedu.demo;

import java.util.Scanner;

/**
 * 需求：1、用户输入年份,月份，求该年该月有多少天。
 * 
 * Scanner 
 * 变量：int  year ; int month  
 * 		int days;
 * 核心：设计该年该月有多少天的算法？
 * 		1-3-5-7-8-10-12  31
 * 		4-6-9-11         30
 * 		2   平28  闰29
 * @author Administrator
 */
public class Demo02 {
	public static void main(String[] args) {
		int year = 0;
		int month = 0;
		int days = 31;//默认是31天
		System.out.println("请输入你查询的年份：");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		System.out.println("请输入你查询的月份：");
		month = sc.nextInt();
		testDays(year, month, days);
		sc.close();
	}

	//设计算法----方法
	public static void testDays(int year, int month, int days) {
		//设计算法
		switch (month) {//
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			//					if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			//						days = 29;
			//					} else{
			//						days = 28;
			//					}
			days = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28;
			break;
		}
		System.out.println(year + "年" + month + "月有" + days + "天！！！");
	}

}
