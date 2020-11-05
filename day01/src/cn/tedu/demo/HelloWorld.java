package cn.tedu.demo;//一个包里面的类名是不能重复的；
//注释：单行注释
/* 多行注释：
 * 
 *  */
/**
 * 文本注释：
 * 定义一个包：
 * package cn.tedu.demo;
 * package：包，java中的关键字
 * cn.tedu.demo  包名称，域名反写  全部小写 cn.tedu  com.baidu
 *   				cn.jd
 * ;  中文中类似于句号，java中的结束标识。
 * for(int x= 0;x>7;x++);{语句}
 * @author Administrator
 * 
 */
/*
 * 定义一个类：
 * public: java中的关键字，用来修饰这个类是公共的，访问权限
 * class: java的关键字，用来定义一个类的
 * HelloWorld: 类名----驼峰命名法
 * {代码}
 */
public class HelloWorld {
	/*
	 * 定义一个主方法：
	 * 主函数/方法 ---main方法就是程序的入口
	 * public：java的关键字，用来修饰方法的访问权限，公共的
	 * static: java的关键字，用来修饰方法是静态的
	 * void: java的关键字，用来修饰方法是没有返回值的
	 * main：方法的名称
	 * (): 就是方法的标志
	 * String[] args: 方法的参数列表
	 * {代码...}:方法体
	 * 写法：输入main，按按键：alt+/
	 */
	public static void main(String[] args) {
		//syso alt+/  
		/*
		 * 控制台输出指定的数据：
		 * System：发出一个系统的指令
		 * out: 向外输出
		 * println:打印之后进行换行操作
		 * print:打印之后不用进行换行
		 * ():方法的标记
		 * 12345----方法的参数
		 * ;  java的语句结束标志
		 * .  调用
		 */
		System.out.print(12345);
		System.out.println();//换行
		System.out.println(12345);
	}

}
