package cn.tedu.demo;

/**
 * 算术运算符：
 * + - *  /  %   ++  --
 * @author Administrator
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		
		System.out.println(5 % 2);//1
		//总结：
		System.out.println(8 % 6);//2
		System.out.println(8 % -6);//2
		System.out.println(-8 % 6);//-2
		System.out.println(-8 % -6);//-2
		
		//写 % 和 / 的表达式
		System.out.println(8/3);//2
		System.out.println(8%3);//2
		
		//取任意3位数的个位，十位，百位
		int num = 123;
		System.out.println(num/100);//百位  1
		System.out.println(num % 100 / 10);//十位
		System.out.println(num / 10 % 10);//十位
		System.out.println(num % 10);//个位
		System.out.println(num % 100 % 10);//个位
		
		//++  -- 
		System.out.println(num++);//123
		System.out.println(num);//124
		
		System.out.println(++num);//125
		System.out.println(num);//125
		
		System.out.println("-----------------------");
		int x = 5;
		int y = x++;
		//int y = ++x;
		System.out.println(x);//6
		System.out.println(y);//5
		
		//前增++x和后增x++---总结：
		
		
	}
	
}
