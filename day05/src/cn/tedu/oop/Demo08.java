package cn.tedu.oop;
/**
 * �����ࣺCar
 * ����࣬�ŵ�һ��ֻ��һ������public���Ρ�
 * 		���public���ε���������.java��������
 * @author Administrator
 *
 */
public class Demo08 {
	public static void main(String[] args) {
		new Cars().go();//��������
		Cars c = new Cars();//�����ֵĶ��󣬽�c
		//���ó�Ա�����ͷ���
		c.color = "��ɫ";
		c.brand = "����";
		c.price = 400000.0;
		System.out.println(c.color);
		System.out.println(c.brand);
		System.out.println(c.price);
		c.go();
		c.back();
		System.out.println("---------------------");
		Car c1 = new Car();//�����ֵĶ��󣬽�c
		//���ó�Ա�����ͷ���
		c1.color = "��ɫ";
		c1.brand = "����";
		c1.price = 200000.0;
		System.out.println(c1.color);
		System.out.println(c1.brand);
		System.out.println(c1.price);
		c1.go();
		c1.back();
	}
}
class Cars {
	//��Ա���������������ڲ����������ⲿ
	String color;//��ɫ
	String brand;//Ʒ��
	double price;//�۸�
	//���������巽��
	public void go() {
		System.out.println("go go go...");
	}
	public void back() {
		System.out.println("����Ŷ......");
	}
}

