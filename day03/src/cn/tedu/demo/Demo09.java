package cn.tedu.demo;

import java.util.Random;
import java.util.Scanner;

/**
 * //改造猜数字游戏,使用do-while
 * @author Administrator
 *
 */
public class Demo09 {

	public static void main(String[] args) {
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
		System.out.println("需要猜的数字：" + num);
		Scanner sc = new Scanner(System.in);
		int guess;
		//开始猜---核心的逻辑
		do {//判断条件
			System.out.println("请输入你要猜的数字(1-1000),退出请输入-1：");
			guess = sc.nextInt();
			if (guess == -1) {
				//退出
				break;
			} else if(guess > num) {
				System.out.println("猜大了");
			} else if(guess < num) {
				System.out.println("猜小了");
			} 
		}while (guess != num);
		if (guess == num) {
			System.out.println("猜对了！！！");
		} else {
			System.out.println("欢迎再猜！！！");
		}
		
		
		
	}
	
}
