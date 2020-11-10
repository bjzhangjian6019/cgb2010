package cn.tedu.oop;
/**
 * 测试类：Car
 * 多个类，放到一起，只有一个公共public修饰、
 * 		这个public修饰的类名就是.java的类名。
 * @author Administrator
 *
 */
public class Demo08 {
	public static void main(String[] args) {
		new Cars().go();//匿名对象
		Cars c = new Cars();//有名字的对象，叫c
		//调用成员变量和方法
		c.color = "黑色";
		c.brand = "奔驰";
		c.price = 400000.0;
		System.out.println(c.color);
		System.out.println(c.brand);
		System.out.println(c.price);
		c.go();
		c.back();
		System.out.println("---------------------");
		Car c1 = new Car();//有名字的对象，叫c
		//调用成员变量和方法
		c1.color = "黑色";
		c1.brand = "大众";
		c1.price = 200000.0;
		System.out.println(c1.color);
		System.out.println(c1.brand);
		System.out.println(c1.price);
		c1.go();
		c1.back();
	}
}
class Cars {
	//成员变量：声明在类内部，方法的外部
	String color;//颜色
	String brand;//品牌
	double price;//价格
	//方法：定义方法
	public void go() {
		System.out.println("go go go...");
	}
	public void back() {
		System.out.println("后退哦......");
	}
}

