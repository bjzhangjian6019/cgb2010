package cn.tedu.demo;

import java.util.Scanner;

/**
 * switch结构：
 * 	使用String类型的/char类型的
 * @author Administrator
 */
public class Demo12 {
	
	public static void main(String[] args) {
		String indexStr = "拼多多1";
		switch (indexStr) {//判断条件
		case "拼多多":
			System.out.println("【好友助力】我离美国总统仅差6票,帮我砍一刀.");
			//当遇到break的时候，会立即停止执行
			break;
		case "京东":
			System.out.println("欢迎使用京东白条支付iPhone 12 pro max");
			break;
		case "腾讯视频":
			System.out.println("欢迎充值腾讯VIP服务！！！");
			break;
		default:
			System.out.println("淘宝双十一嗨嗨嗨！！！");
		}
		
		System.out.println("----------char---------------");
		char c = 'b';
		Scanner sc = new Scanner(System.in);
		char[] cs = sc.next().toCharArray();
		char c1 = cs[0];
		System.out.println(c1);
		switch (c1) {
		case 'a':
			System.out.println("a++++++++++");
			break;
		}
		
	}

}
