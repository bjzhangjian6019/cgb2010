package cn.tedu.demo;
import java.util.Random;//����
/**
 * Random:�������ʹ��
 * 1������
 * 2����������
 * 3����������
 * @author Administrator
 */
public class Demo07 {
	public static void main(String[] args) {
		//��������
		Random rand = new Random();
		//��������----2  �������0����1  [0,2)
		int num = rand.nextInt(2);
		System.out.println(num);
	}
}
