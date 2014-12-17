import java.util.*;
import static java.lang.System.out;
public class StringTest{
	public static void main(String[] args){
		String s = new String("java.lang Class String");
		String s1 = new String("abcdedfghijk");
		String s2 = new String("0123456789");
		System.out.println(s1.indexOf("d"));
		System.out.println("s1.toUpperCase()"+s1.toUpperCase());
		System.out.println("s.toLowerCase()"+s.toLowerCase());
		System.out.println("s.substring()"+s.substring(2,6));
		System.out.println("s.substring()"+s.substring(2));
		StringBuilder sb = new StringBuilder();
		sb.append("java");
		//׷���ַ���
		sb.insert(0,"hello");
		//����"hello"
		sb.replace(5,6,",");
		System.out.println(sb);
		
		System.out.println("Math.toDegrees(1.57):"+Math.toDegrees(1.57));
		System.out.println("Math.toRadians(90)"+Math.toRadians(90));
		//���Ƕ�ת��Ϊ����
		System.out.println("Math.floor(-1.5)"+Math.floor(-1.5));
		//����С��Ŀ����������
		System.out.println("Math.ceil(1.2)"+Math.ceil(1.2));
		//���ش���Ŀ��������С������
		System.out.println("Math.round(3.3)"+Math.round(3.3));
		//��������ȡ��
		System.out.println("Math.pow(3,2)"+Math.pow(3,2));
		//����˷�
		System.out.println("Math.max(3,8)"+Math.max(3,8));
		//�������ֵ;
		System.out.println("Math.randon"+Math.random());
		//����һ��0-1֮��������
		Random rand = new Random();
		System.out.println("rand.nextDouble():"+rand.nextDouble());
		Date d = new Date();
		Date d1 = new Date(System.currentTimeMillis()+100);
		System.out.println(d1);
		System.out.println(d.compareTo(d1));
		System.out.println(d.before(d1));
		//Calendar����һ��������,���Բ���ʹ�ù�����������Calendar����,
		/*Calendar c = Calendar.getInstance();
		//ȡ����
		System.out.println(c.get(YEAR));
		//ȡ���·�
		System.out.println(c.get(MONTH));
		//ȡ��ri
		System.out.println(c.get(DATE));*/
		

	}


}