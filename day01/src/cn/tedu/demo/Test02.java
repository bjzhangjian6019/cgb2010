package cn.tedu.demo;

public class Test02 {
	public static void main(String[] args) {
		//订单：恶意刷单，7天后自动删除。----毫秒为单位
		int week = 7*24*60*60*1000;
		System.out.println(week);//604800000
	}
}
