package cn.tedu.demo;

/**
 * �����������
 * + - *  /  %   ++  --
 * @author Administrator
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		
		System.out.println(5 % 2);//1
		//�ܽ᣺
		System.out.println(8 % 6);//2
		System.out.println(8 % -6);//2
		System.out.println(-8 % 6);//-2
		System.out.println(-8 % -6);//-2
		
		//д % �� / �ı��ʽ
		System.out.println(8/3);//2
		System.out.println(8%3);//2
		
		//ȡ����3λ���ĸ�λ��ʮλ����λ
		int num = 123;
		System.out.println(num/100);//��λ  1
		System.out.println(num % 100 / 10);//ʮλ
		System.out.println(num / 10 % 10);//ʮλ
		System.out.println(num % 10);//��λ
		System.out.println(num % 100 % 10);//��λ
		
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
		
		//ǰ��++x�ͺ���x++---�ܽ᣺
		
		
	}
	
}
