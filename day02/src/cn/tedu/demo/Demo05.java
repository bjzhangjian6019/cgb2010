package cn.tedu.demo;
/**
 * + ���ӷ�
 * ע�⣺ʹ�÷�����ߡ��ұߡ��м�
 * @author Administrator
 *
 */
public class Demo05 {

	public static void main(String[] args) {
		System.out.println("hello" + 123);//hello123
		System.out.println("hello" + 123 + 123);//hello123123
		System.out.println("hello" + (123 + 123));//hello246
		System.out.println(123 + "hello");//123hello
		System.out.println(123 + 123 + "hello");//246hello
		System.out.println("world" + 123 + 123 + "hello");//world123123hello
		System.out.println("world" + (123 + 123) + "hello");//world246hello
	}
	
}
