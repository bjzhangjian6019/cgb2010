package cn.tedu.demo;
/**
 * for循环：
 * 
 * @author Administrator
 *
 */
public class Demo03 {

	public static void main(String[] args) {
		//需求：打印10次你的姓名;  alt+ctrl+下键
//		System.out.println("悟空");
//		System.out.println("悟空");
//		System.out.println("悟空");
//		System.out.println("悟空");
//		System.out.println("悟空");
//		System.out.println("悟空");
//		System.out.println("悟空");
//		System.out.println("悟空");
//		System.out.println("悟空");
//		System.out.println("悟空");
		
		/*
		 * int i = 1;//从第1次开始打印   i表示次数
		 * i <= 10;//到10就结束了---范围10
		 * i++; 次数在按照+1的方式在依次递增的。
		 */
		for (int i = 1; i <= 10; i++) {
			System.out.println("悟空！");
		}
		/*
		 * 执行顺序：
		 * i = 1;  1 <= 10; true 悟空   --- i++  i = 2;
		 * i = 2;  2 <= 10; true 悟空   --- i++  i = 3;
		 * i = 3;  3 <= 10; true 悟空   --- i++  i = 4;
		 * ...
		 * i = 10;  10 <= 10; true 悟空  ---i++  i = 11;
		 * i = 11;  11 <= 10? false 循环结束;
		 */
		
		//需求1：打印10到0,并把执行过程写出来.
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		
		//需求2：打印出8   88   888   8888
		System.out.println(8);
		System.out.println(88);
		System.out.println(888);
		System.out.println(8888);
		System.out.println("----------------------");
		/*
		 * 打印出8   88   888   8888
		 * 第一次循环，输出8,int i = 8;
		 * 8					8
		 * 8----88   	 		8*10+8=88
		 * 8---88---888  		88*10+8=888
		 * 8---88---888-8888    888*10+8=8888
		 */
		for (int i = 8; i <= 8888; i = i*10+8) {
			System.out.println(i);
		}
		/*
		 * 执行顺序：
		 * i = 8;  8 <= 8888;  true  8; i = i*10+8; i=88;
		 * i = 88; 88 <= 8888; true  88; i = i * 10 + 8;i=888;
		 * i = 888; 888 <= 8888;true 888;i = i * 10 + 8; i= 8888;
		 * i = 8888; 8888 <= 8888;true 8888; i = i*10+8;i = 88888;
		 * i = 88888;88888 <= 8888;false 循环结束
		 * 
		 */
		/*
		 * 作业：
		 * 1/(1 * 3) + 1/(3 * 5) + 1/(5 * 7) + 1/(7 * 9) +…  …
		 */
	}
	
}
