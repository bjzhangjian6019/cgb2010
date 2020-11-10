package cn.tedu.demo;
/**
 * break的使用：
 * 1、使用场景：
 * 2、注意点：
 * 3、作用:
 * @author Administrator
 *
 */
public class Demo10 {
	
	public static void main(String[] args) {
		//break;
		
		for (int i = 1; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println("今天星期六拉" + i);
		}
		
	}
}
