package cn.tedu.demo;
/**
 * 作业：
 * 输出斐波拉契数列的前20项的值分别是多少？-----扩展
		其中数列：1，1，2，3，5，8，13....
	第一项：1
	第二项：1
	第三项：前两项的和：  1+1=2
	第四项：前两项(第二项和第三项的和)：1+2=3;
	....
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			System.out.println(fun(i));
		}
	}
	//设计方法：利用递归的思路实现
	public static int fun(int n) {
		//第一项和第二项都是1
		if (n == 1 || n == 2) {
			return 1;
		}
		if (n > 2) {//从第三项开始
			//n=1-----fun(1)
			//n=2-----fun(2)
			//n=4-----fun(2)+fun(3)
			// n---- fun(n-2)+fun(n-1)
			return fun(n-2) + fun(n-1);
		}
		return -1;
	}
	/**
	 * 练习：求10！
	 * 3！=3*2*1
	 * 4！=4*3*2*1
	 * 5！=5*4*3*2*1   5*f(4)
	 * n*f(n-1);
	 */
}
