package cn.tedu.demo;
/**
 * 方法的使用：
	 * 方法在什么时候执行？----被调用的时候，进行执行
	 * 方法的语法？----怎么写一个方法
 * @author Administrator
 */
public class Demo02 {
	
	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");
		
		//调用say方法
		say();
		
		System.out.println("3");
		System.out.println("4");
	}
	
	//写一个say方法:基本语法：
	public static void say() {
		System.out.println("5");
		System.out.println("6");
	}
	
	
	
	

}
