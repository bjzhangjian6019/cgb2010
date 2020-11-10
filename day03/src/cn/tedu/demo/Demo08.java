package cn.tedu.demo;
/**
 * do-while循环：
 * 	先执行再判断
	循环体至少执行一次
 * @author Administrator
 *
 */
public class Demo08 {

	public static void main(String[] args) {
		int x = 6;
		while (x > 7) {//false
			System.out.println("1111");
		}
		
		System.out.println("--------------------");
		
		do {
			System.out.println("do-while循环......");
		}while(x > 7);
		
		//改造猜数字游戏,使用do-while
		
	}
	
}
