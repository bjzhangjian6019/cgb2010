package cn.tedu.demo;

/**
 * 需求：求1-100之间的所有偶数的和
 * 分析：
 * 		1、定义一个求和的变量，初始化的值为0；
 * 		2、获取1-100之间的数据,使用for循环
 * 		3、取出1-100之间所有的偶数:
 * 			 判断数据是不是偶数?,如果是,执行步骤4
 * 		4、所有偶数累加
 * 		5、输出求和的变量即可
 * @author Administrator
 */
public class Demo04 {
	public static void main(String[] args) {
		System.out.println("start");
		sum();
		sum1();
		int sum = sum(1, 1001);
		System.out.println("sum = " + sum);
		System.out.println("over");
	}
	/**1+2+3+4+...+100=5050*/
	public static void sum() {
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	/**求1-100之间所有的偶数和*/
	public static void sum1() {
		int sum = 0;
		for (int i = 0; i < 101; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	public static int sum(int num1, int max) {
		int sum = 0;
		for (int i = num1; i < max; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
}
