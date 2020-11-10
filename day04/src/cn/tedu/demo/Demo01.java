package cn.tedu.demo;
/**
 * 变量：
 * 	成员变量和局部变量
 * 
 * @author Administrator
 *
 */
public class Demo01 {
	//成员变量:定义在方法外部，类内部，不用进行初始化也可以
	static int num;//默认值是0
	static double num2;//默认值是0.0
	static boolean num3;//默认值是false
	
	public static void main(String[] args) {
		//局部变量：定义在方法内部，作用范围就是方法内部,必须要进行初始化
		int num4 = 5;
		System.out.println(num4);//局部变量
//		byte num5;
//		System.out.println(num5);//编译就不通过，使用的是局部变量
		//在我们同时使用局部变量和成员变量的时候，
		//如果局部变量名和成员变量名相同的时候，优先使用局部变量。
		int num = 10;
		System.out.println(num);//10---就近原则
		
		System.out.println(num);//0,使用的是成员变量
		System.out.println(num2);//0.0,使用的是成员变量
		
		if (!num3) {//只有条件成立的情况下true，才执行
			System.out.println("我爱你！！！");
		}
		
	}
	

}
