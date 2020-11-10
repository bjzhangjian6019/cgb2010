package cn.tedu.demo;

import java.math.BigDecimal;

public class Demo01 {
	
	public static void main(String[] args) {
		double d1 = 5.1;
		double d2 = 2.1;
		//double d3 = d1 - d2;
		BigDecimal b1 = new BigDecimal(Double.toString(d1));
		BigDecimal b2 = new BigDecimal(Double.toString(d2));
		double d3 = b1.subtract(b2).doubleValue();
		System.out.println(d3);
	}

}
