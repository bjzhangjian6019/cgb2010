package cn.tedu.demo;
/**
 * 取值范围：测试一下
 * @author Administrator
 *
 */
public class DataTypeDemo {
	
	public static void main(String[] args) {
		//1、整型：byte  short  int  long
		//如何声明一个变量??  变量的数据类型  变量名 = 变量的值;
		//定义一个byte类型的变量 最小值用min  最大值用max
		byte min = -128;
		byte max = 127;
		System.out.println(min);
		System.out.println(max);
		byte min1 = Byte.MIN_VALUE;
		byte max1 = Byte.MAX_VALUE;
		System.out.println(min1);//-128
		System.out.println(max1);//127
		//short
		short min2 = Short.MIN_VALUE;//使用工具类
		short max2 = Short.MAX_VALUE;//使用工具类
		System.out.println(min2);//-32768
		System.out.println(max2);//32767
		
		//int ---> 包装类 Integer
		int min3 = Integer.MIN_VALUE;
		int max3 = Integer.MAX_VALUE;
		System.out.println(min3);//-2147483648
		System.out.println(max3);//2147483647
		
		//long ---> Long
		long min4 = Long.MIN_VALUE;
		long max4 = Long.MAX_VALUE;
		System.out.println(min4);//-9223372036854775808
		System.out.println(max4);//9223372036854775807
		
		//浮点型
		float min5 = Float.MIN_VALUE;
		float max5 = Float.MAX_VALUE;
		System.out.println(min5);//1.4E-45
		System.out.println(max5);//3.4028235E38
		
		double min6 = Double.MIN_VALUE;
		double max6 = Double.MAX_VALUE;
		System.out.println(min6);//4.9E-324
		System.out.println(max6);//1.7976931348623157E308
		
		//boolean  默认值false
		boolean flag  = false;
		boolean flag2  = true;
		System.out.println(flag);
		System.out.println(flag2);
		
		//char类型  单引号引起来的
		char c = '燕';
		System.out.println(c);
		char c2 = 'a';
		System.out.println(c2);//a
		char c3 = '?';
		char c4 = 65535;
		System.out.println(c3);
		System.out.println(c4);
		char c5 = 48;
		System.out.println(c5);//a
	}
}
