package cn.tedu.demo;
/**
 * 逻辑运算符：
 * &&  ||    
 * &:单与  -------- 并且 ,要想让&的结果为true，左右两边，必须都是true
 * |: 或者  
 * 
 * || &&
 * 总结：使用&&，左边为false，右边的就不执行了;
 * 但是&，左右都会执行。
 * 一般使推荐用&&,提高效率。
 * @author Administrator
 * cn.tedu.entity---实体
 * cn.tedu.mm----实体
 */
public class Demo07 {
	public static void main(String[] args) {
		System.out.println(3 > 2 & 3 > 4);//false
		System.out.println(3 > 2 & 3 > 1);//true
		System.out.println(3 > 5 & 3 > 1);//false
		System.out.println(3 > 5 & 3 > 4);//false
		
		System.out.println(3 > 2 | 3 > 4);//true
		System.out.println(3 > 2 | 3 > 1);//true
		System.out.println(3 > 5 | 3 > 1);//true
		System.out.println(3 > 5 | 3 > 4);//false
		
		System.out.println(3 < 2 && 3 > 4);
		
	}
}
