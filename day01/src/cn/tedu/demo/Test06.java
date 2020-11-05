package cn.tedu.demo;

import java.util.ArrayList;
import java.util.List;

public class Test06 {
	
	public static void main(String[] args) {
		
		List<String> name = new ArrayList<String>();
		//List<int> name1 = new ArrayList<int>();
		List<Integer> age = new ArrayList<Integer>();
		//int类型---基本数据类型----包装类型Integer
		
		//装箱和拆箱
		//装箱：将基本数据类型封装为包装类对象
		Integer i = 666;//装箱，666是int整型 , i是包装类型的
		//
		Integer i1 = new Integer(666);//编译后
		System.out.println(i1);
		
		//拆箱：将包装类中包装的基本数据类型数据取出
		Integer i2 = 666;//自动装箱
		int j = i2;//自动拆箱
		System.out.println(j);//666
		int j1 = i2.intValue();//编译后
		
		//了解：jdk1.5以后，自动装箱和拆箱，所以可以互相赋值。
		/*
		 * 基本数据类型         包装类型                 父类
		 * byte			   Byte			
		 * short		   Short
		 * int			   Integer		Number
		 * long			   Long
		 * float		   Float
		 * double		   Double
		 * --------------------------------------
		 * char			   Character     Object
		 * boolean		   Boolean
		 */
		/*
		 * 1、在方法体内部尽量使用基本类型，占空间比较小，用完立即释放，节约内存资源。
		 * 2、在使用实体类的时候，尽量使用包装类型，比如：mybatis持久层框架
		 * 就必须使用包装类型，否则可能会出错。
		 */
		
	}

}
