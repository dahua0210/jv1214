import java.util.*;
public class ErweiTest{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String [] name = {"a","b","c"};//�洢ѧ��������
		int[][] grade={{50,40,70},{70,50,90,},{88,12,47},};//�洢����ѧ���ĳɼ�ѧ���ĳɼ�
		System.out.println("����Ҫ��ѯ��ѧ������");
		String chioce = in.next();
		for(int i = 0;i < 3;i++){
			if(name[i] .equals(chioce)){
			System.out.println("ѧ��:"+name[i]+"�ĳɼ�����:");
			System.out.println("C����:"+grade[i][0]+"����:"+grade[i][1]+
			"Ӣ��:"+grade[i][2]);
			
			
			}
		}
		System.out.println("����Ҫ��ѯ������Ŀ�Ŀ�����");
		System.out.println("1�������,2.����3.Ӣ��");
		int ch = in.nextInt();
		int time=0;
		for(int i = 0;i<3;i++){
		if(grade[i][ch-1]<60){
			time++;
		System.out.println("�ÿ�Ŀ:"+i+"�ҵĴ���"+time);
		
		}
		}
		
		
	}
}