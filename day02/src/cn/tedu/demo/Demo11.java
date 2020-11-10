package cn.tedu.demo;
/**
 * 需求：拨打110,119,120,10086,1666
	switch结构写
 * @author Administrator
 */
public class Demo11 {

	public static void main(String[] args) {
		int index = 10086;
		switch (index) {
		case 110:
			System.out.println("你好,110已经接通...");
			break;
		case 119:
			System.out.println("你好,119已经接通...");
			break;
		case 120:
			System.out.println("你好,120已经接通...");
			break;
		case 10086:
			System.out.println("你好,欢迎致电10086!!!");
			//break;//switch结构具有穿透性
		case 1666:
			System.out.println("你好,隔壁老王为您服务！！！");
			break;
		}
		
		
	}
	
}
