import java.util.Scanner;
public class HuiWen{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("����������");
		int i = in.nextInt();
		if(i > 1 && i<9999){
			
			int a = i%10;//��λȡ��;
			int b = i/10%10;//ʮλȡ��
			int c = i/100%10;//��λȡ��
			int d = i/1000%10;//����λȡ��
			if(d > 0){
			System.out.println("�����Ϊ��λ��");
				if(a==d && b==c){
					System.out.println(i+"Ϊ������");
					}
					else{
					System.out.println(i+"���ǻ�����");
					}				
			}
			else if(d ==0 && c>0){
			System.out.println("�����Ϊ��λ��");
				if(a==c){
					System.out.println(i+"Ϊ������");
					}
					else{
					System.out.println(i+"���ǻ�����");
					}
			}
			else if(d == 0 && c== 0 && b > 0 ){
			System.out.println("�����Ϊ��λ��");
				if(a==b){
					System.out.println(i+"Ϊ������");
					}
					else{
					System.out.println(i+"���ǻ�����");
					}
			}
			else if(d ==0&&c==0 &&b==0 && a > 0 ){
			System.out.println("�����Ϊһλ��");
			System.out.println(i+"Ϊ������");
			}	
			else{
			System.out.println("������1��9999֮�����");
			
			}
		}
		
	}
}







 