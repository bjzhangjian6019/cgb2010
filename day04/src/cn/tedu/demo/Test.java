package cn.tedu.demo;
/**
 * ��ҵ��
 * ���쳲��������е�ǰ20���ֵ�ֱ��Ƕ��٣�-----��չ
		�������У�1��1��2��3��5��8��13....
	��һ�1
	�ڶ��1
	�����ǰ����ĺͣ�  1+1=2
	�����ǰ����(�ڶ���͵�����ĺ�)��1+2=3;
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
	//��Ʒ��������õݹ��˼·ʵ��
	public static int fun(int n) {
		//��һ��͵ڶ����1
		if (n == 1 || n == 2) {
			return 1;
		}
		if (n > 2) {//�ӵ����ʼ
			//n=1-----fun(1)
			//n=2-----fun(2)
			//n=4-----fun(2)+fun(3)
			// n---- fun(n-2)+fun(n-1)
			return fun(n-2) + fun(n-1);
		}
		return -1;
	}
	/**
	 * ��ϰ����10��
	 * 3��=3*2*1
	 * 4��=4*3*2*1
	 * 5��=5*4*3*2*1   5*f(4)
	 * n*f(n-1);
	 */
}
