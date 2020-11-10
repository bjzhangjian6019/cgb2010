package cn.tedu.demo;
/*
 * 赋值运算符：+= 
 * 需求（面试题）：x += 2 和 x = x + 2的区别
 */
public class Demo06 {
	public static void main(String[] args) {
		byte x = 3;
		//x = x + 2;//报错
		//x = (byte) (x + 2);
		x += 2;//相当于自动完成了类型转换---不用强转
		System.out.println(x);
	}
}
