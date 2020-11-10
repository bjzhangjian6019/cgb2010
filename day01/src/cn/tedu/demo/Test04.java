package cn.tedu.demo;

import java.math.BigDecimal;

public class Test04 {

	public static void main(String[] args) {
		
		//int x = 10000000011;//编译就发生错误，超出范围
		
		byte b1 = 127;
		//byte b2 = 128;//编译就错误  -128---127
		
		long l = 12344532222L;
		
		float f = 3.125f;
		double d = 3.2345d;
		
		double money = 3.0;
		double price = 2.9;
		System.out.println(money - price); 
		
		BigDecimal p1 = new BigDecimal(Double.toString(money));
		BigDecimal p2 = new BigDecimal(Double.toString(price));
		double p3 = p1.subtract(p2).doubleValue();
		System.out.println(p3);
		
	}
	
}
