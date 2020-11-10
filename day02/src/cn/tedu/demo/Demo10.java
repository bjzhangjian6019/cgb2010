package cn.tedu.demo;

/*
 * 练习：
	成绩评定：0-100分
		大于90,优秀
		80-90,良好
		70-80,中等
		60-70,及格
		60以下,不及格
 */
public class Demo10 {

	public static void main(String[] args) {
		int score = 45;
		System.out.println("请输入分数(0-100):");
		//程序的健壮性
		if (score < 0 || score > 100) {
			System.out.println("输入有误！请输入范围(0-100)之间的分数：");
		} else {
			if (score >= 90) {
				System.out.println("优秀");
			} else if(score >= 80 && score < 90) {
				System.out.println("良好");
			} else if(score >= 70) {
				System.out.println("中等");
			} else if(score >= 60) {
				System.out.println("及格");
			} else {
				System.out.println("不及格");
			}
		}
	}
}
