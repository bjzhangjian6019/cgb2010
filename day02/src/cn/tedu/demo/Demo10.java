package cn.tedu.demo;

/*
 * ��ϰ��
	�ɼ�������0-100��
		����90,����
		80-90,����
		70-80,�е�
		60-70,����
		60����,������
 */
public class Demo10 {

	public static void main(String[] args) {
		int score = 45;
		System.out.println("���������(0-100):");
		//����Ľ�׳��
		if (score < 0 || score > 100) {
			System.out.println("�������������뷶Χ(0-100)֮��ķ�����");
		} else {
			if (score >= 90) {
				System.out.println("����");
			} else if(score >= 80 && score < 90) {
				System.out.println("����");
			} else if(score >= 70) {
				System.out.println("�е�");
			} else if(score >= 60) {
				System.out.println("����");
			} else {
				System.out.println("������");
			}
		}
	}
}
