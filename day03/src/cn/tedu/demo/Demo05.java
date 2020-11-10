package cn.tedu.demo;
/**
 * for循环的嵌套：
 * 在外循环执行1次，内循环执行N次
 * @author Administrator
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		//总结：外循环的i执行1次，内部循环的j就要执行4次。
		/*
		 * 第一次循环，i=1;1<4;true;
		 * 		内部依次输出j的值是1234,i自增;i++  ;i=2
		 * 第二次循环，i=2;2<4;true;
		 * 		内部依次输出j的值是1234,i自增;i++  ;i=3
		 * 第三次循环，i=3;3<4;true;
		 * 		内部依次输出j的值是1234,i自增;i++  ;i=4
		 * 第四次循环，i=2;4<4;false;循环结束。	
		 */
		for (int i = 1; i < 4; i++) {//外循环执行3次
			System.out.println("外循环：" + i);
			for (int j = 1; j < 5; j++) {//内循环执行4次
				System.out.println(j);
			}
		}
		
		System.out.println("---------------------------------");
		
		//外循环用来控制行，内循环用来控制列
		for (int i = 1; i < 4; i++) {//行
			for (int j = 1; j < 3; j++) {//列
				System.out.print("*");
			}
			System.out.println();//换行
		}
		/*
		 * 第一次外循环:i=1,1<4;true;
		 * 			j=1;j<3;true;  *  ;j++;j=2;
		 * 			j=2;j<3;true;  ** ;j++;j=3;
		 * 			j=3;j<3;false;内层循环结束；执行i++;i=2；
		 * 第二次外循环：i=2,2<4;true;
		 * 			j=1;j<3;true;  *  ;j++;j=2;
		 * 			j=2;j<3;true;  ** ;j++;j=3;
		 * 			j=3;j<3;false;内层循环结束；执行i++;i=3；
		 * 第三次外循环：i=3;3<4;true;
		 * 			j=1;j<3;true;  *  ;j++;j=2;
		 * 			j=2;j<3;true;  ** ;j++;j=3;
		 * 			j=3;j<3;false;内层循环结束；执行i++;i=4；
		 * 第四次外循环：i=4;4<4;条件不成立；循环终止.
		 * 			**
		 * 			**
		 * 			**
		 */
		
		/* 练习1：
		 * 打印99乘法表：
		 */
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i*j + "     ");
			}
			System.out.println();//换行
		}
		System.out.println("------------------------");
		/*
		 * 练习2：打印
		 * 		*
		 * 		**
		 * 		***
		 * 		****
		 * 		*****
		 */
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
