import java.util.*;
public class Text{
	public static void main(String[] args){
		System.out.println("------������ѧ���ĸ���-------");
		Scanner in = new Scanner(System.in);
		Student[] stuArr  = new Student[in.nextInt()];
		Admin adminStu = new Admin();
		while(true){
		System.out.println("--��Ҫִ�еĳ���--");
		System.out.println("--10:���һ��ѧ��--");
		System.out.println("--11:����һ��ѧ��----");
		System.out.println("--12:���ݱ�Ÿ���ѧ���Ļ�����Ϣ--------");
		System.out.println("--13:���ݱ��ɾ��ѧ��--");
		System.out.println("--14:���ݱ���������ѧ���ĳɼ�--");
		System.out.println("--15:����Ī�ųɼ���������--");
		System.out.println("--16:�����ֽܷ�������--");
		System.out.println("--99:�˳�ϵͳ--");
		int num = in.nextInt();
	
		if(num ==10){
			System.out.println("������ѧ��������:");
			String name = in.next();
			System.out.println("������ѧ��������:");
			int age = in.nextInt();
			adminStu.create(name,age,stuArr);//���ѧ��
		}else if(num == 11){
			System.out.println("ִ�в�ѯ");
			System.out.println("ִ��Ҫ��ѯѧ���ı��");
			int on = in.nextInt();
			adminStu.select(on,stuArr);
			adminStu.print(stuArr);
			}else if(num == 12){
			System.out.println("����ѧ����Ϣ����");
			System.out.println("������Ҫѧ�����");
			int on = in.nextInt();
			System.out.println("������Ҫѧ��������");
			String name = in.next();
			System.out.println("������Ҫѧ��������");
			int age = in.nextInt();
			adminStu.update(on,name,age,stuArr);
			adminStu.print(stuArr);
			}else if(num == 13){
				System.out.println("ִ��ɾ������");
				System.out.println("������Ҫɾ��ѧ���ı��");
				int on = in.nextInt();
				adminStu.delete(on,stuArr);
			}else if(num == 14){
				System.out.println("ִ������ɼ��Ĺ���");
				System.out.println("������ѧ�����:");
				int on = in.nextInt();
				adminStu.score(on,stuArr);
			
			}else if(num == 15){
				System.out.println("ִ�пγ�������");
				System.out.println("1.java,2.C,3.html,4.sql");
				int number = in.nextInt();
				adminStu.course(number,stuArr);
			}else if(num == 16){
				System.out.println("ִ���ֽܷ�������ķ���");
				adminStu.sumSort(stuArr);
			}else if(num == 99){
				System.out.println("�������˳�");
				System.exit(0);
			
			}
		
		}
	}
}