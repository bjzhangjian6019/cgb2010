package cn.tedu.demo;
/**
 * continue的使用：
 * 作用：结束这次循环，进行下一次循环。
 * @author Administrator
 */
public class Demo11 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if (i % 3 == 0) {
				//break;//输出了2次
				continue;//输出6次
			}
			System.out.println("双十一来啦，清空购物车！！！" + i);
		}
	}
}
