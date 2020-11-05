package cn.tedu.demo;
/**
 * 数据类型的转换：
 * 小转大
 * 大转小
 * @author Administrator
 *
 */
public class Test05 {

	public static void main(String[] args) {
		//总结：计算结果的类型，是与最大类型一致的。
		System.out.println(1+1);//int + int => int----2
		System.out.println(1 + "2");//12  拼接字符串 
		System.out.println(1 + '0');//int + char =>int  49
		System.out.println(1 + 1.0);//int + double =>double 2.0		
		System.out.println(5/3);//int/int => int  1
		System.out.println(5.0/3);//double/int =>double  1.66666666667
		System.out.println(5d/3);//double/int =>double 1.66666666667
		
		//2、总结：byte,short,char三种比int小的整数，运算的时候，先自动转化为int类型
		byte b1 = 1;
		byte b2 = 2;
		//byte c = b1 + b2;
		//大转小----需要强制转化
		byte c = (byte) (b1 + b2);
		System.out.println(c);
		System.out.println("-----------------------------");
		
		//3、在整数运算过程中，可能会超出范围，可以编译运行，最终的数据不准确了。
		int x = 1000*365*24*60*60*1000;//int*int*int*int*int*int==>int
		System.out.println(x);
		//修改：在运算的结果加上L---L就是long类型的  int类型转为long类型
		System.out.println(1000*365*24*60*60*1000L);
		long x1 = 1000*365*24*60*60*1000l;//加上L
		System.out.println(x1);
		
		//4、了解：浮点型数据参与运算，结果不精确
		System.out.println(1-0.8);
		
		//5、了解 Infinity---无穷大   
		System.out.println(3.14/0);
		/*
		 * NaN（Not a Number，非数）是计算机科学中数值数据类型的一类值，
		 * 表示未定义或不可表示的值。常在浮点数运算中使用。
		 * 首次引入NaN的是1985年的IEEE 754浮点数标准。
		 */
		System.out.println(0/0.0);
		
	}
	
	
}
