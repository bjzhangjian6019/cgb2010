package cn.tedu.demo;

import java.util.Random;
import java.util.Scanner;
/**
 * while循环：
 * 
 * 猜数字游戏：
 * 
 * @author Administrator
 *
 */
public class Demo06 {

	public static void main(String[] args) {
		
		//循环输出10次姓名
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("----------------------");
		
		//1+2+3+...+100
		int j = 1;
		int sum = 0;
		while (j <= 100) {
			sum += j;
			j++;
		}
		System.out.println(sum);//5050
		
		System.out.println("----------------------");
		/*
		 * 猜数字游戏：
		 * 1、随机产生一个数字. num   Random
		 * 2、开始猜：while
		 * 	用户输入的数字：guess    num
		 * 	用户输入的数和随机产生的数字，做比较：
		 * 	输入的数字大于随机产生的数字，提示：猜大了
		 * 	输入的数字小于随机产生的数字，提示：猜小了
		 * 	输入的数字等于随机产生的数字，提示：猜对了
		 * 3、游戏结束
		 * 输入-1,退出;
		 */
		Random rand = new Random();
		int num = rand.nextInt(1000);
		System.out.println("请输入你要猜的数字(1-1000),退出请输入0：");
		Scanner sc = new Scanner(System.in);
		int guess = sc.nextInt();
		//开始猜---核心的逻辑
		while (guess != num) {//判断条件
			if (guess == -1) {
				//退出
				break;
			} else if(guess > num) {
				System.out.println("猜大了");
			} else if(guess < num) {
				System.out.println("猜小了");
			} 
			System.out.println("请输入你要猜的数字(1-1000),退出请输入0：");
			guess = sc.nextInt();
		}
		if (guess == num) {
			System.out.println("猜对了！！！");
		} else {
			System.out.println("欢迎再猜！！！");
		}
		
	}
	
}
