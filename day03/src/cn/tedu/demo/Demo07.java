package cn.tedu.demo;
import java.util.Random;//导包
/**
 * Random:随机数的使用
 * 1、导包
 * 2、创建对象
 * 3、接收数据
 * @author Administrator
 */
public class Demo07 {
	public static void main(String[] args) {
		//创建对象
		Random rand = new Random();
		//接收数据----2  随机产生0或者1  [0,2)
		int num = rand.nextInt(2);
		System.out.println(num);
	}
}
