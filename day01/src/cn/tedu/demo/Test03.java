package cn.tedu.demo;
/**
 * 交换数据  
 * x = 5;y=8;  
 * x = 8; y = 5;
 * @author Administrator
 *
 */
public class Test03 {
	
	public static void main(String[] args) {
		int x = 5;
		int y = 8;
		System.out.println("交换前的数据：x = " + x + ",y = " + y );
		
		//temp中间值的临时变量
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("交换后的数据：x = " + x + ",y = " + y );
		
	}

}
