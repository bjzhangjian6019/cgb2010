package cn.tedu.demo;

import java.util.Scanner;

/*
 * --计算公式为：BMI=体重（千克）除以身高（米）的平方。
		--體重過輕 BMI ＜ 18.5 
		--正常範圍 18.5≦BMI＜24 
		--過重：24≦BMI＜27
		--輕度肥胖：27≦BMI＜30
		--中度肥胖：30≦BMI＜35
		--重度肥胖：BMI≧35
 */
public class Demo01 {
	
	public static void main(String[] args) {
		
		System.out.println("请输入你的体重(kg)：");
		Scanner sc = new Scanner(System.in);
		double weight = sc.nextDouble();
		System.out.println("请输入你的身高(m): ");
		double height = sc.nextDouble();
		
		//利用给定的算法公式：BMI=体重（千克）除以身高（米）的平方
		double bmi = weight/(height*height);
		if (bmi < 18.5) {
			System.out.println("体重过轻");
		} else if(bmi >= 18.5 && bmi < 24) {
			System.out.println("正常范围");
		} else if(bmi >= 24 && bmi < 27) {
			System.out.println("过重");
		} else if(bmi >= 27 && bmi < 30) {
			System.out.println("轻度肥胖");
		} else if(bmi >= 30 && bmi < 35) {
			System.out.println("中度肥胖");
		} else if(bmi >= 35) {
			System.out.println("重度肥胖");
		} 
		
		sc.close();
	}

}
