package cn.tedu.demo;
/**
 * �߼��������
 * &&  ||    
 * &:����  -------- ���� ,Ҫ����&�Ľ��Ϊtrue���������ߣ����붼��true
 * |: ����  
 * 
 * || &&
 * �ܽ᣺ʹ��&&�����Ϊfalse���ұߵľͲ�ִ����;
 * ����&�����Ҷ���ִ�С�
 * һ��ʹ�Ƽ���&&,���Ч�ʡ�
 * @author Administrator
 * cn.tedu.entity---ʵ��
 * cn.tedu.mm----ʵ��
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
