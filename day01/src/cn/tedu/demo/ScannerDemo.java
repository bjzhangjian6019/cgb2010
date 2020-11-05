package cn.tedu.demo;

import java.util.Scanner;
/**
 * Scanner：
 * 1、导包
 * 2、创建对象
 * 3、接受对象
 * 4、关闭close
 * @author Administrator
 */
public class ScannerDemo {
	public static void main(String[] args) {
		//ctrl+shift+O
		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		System.out.println(num);
		System.out.println("请输入你的信息：");
		System.out.println("姓名：");
		String name = sc.next();
		//+  作为连接符  拼接字符串
		System.out.println("大家好，他是" + name);
		//System.out.println("大家好，他是任贤齐！");
		System.out.println(name + "你好帅！！！");
		System.out.println("大家好，我是" + name + "，哈哈！！！");
		sc.close();
	}
}
