package hellofem;
import java.util.Scanner;


public class Hellogem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������γ̴���(1��3֮�������)");
		Scanner in = new Scanner(System.in);
		int courseCode = in.nextInt();//�Ӽ�����������
		switch(courseCode){
		case 1:
			System.out.println("C���");
			break;
		case 2:
			System.out.println("Java���");
			break;
		case 3:
			System.out.println("SQl����");
			break;
		}
	}
}
//�쳣��:���������г��ֵĲ����������
//�쳣�ж�,�쳣�������
