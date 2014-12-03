import java.util.Scanner;
public class HuiWen{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入数字");
		int i = in.nextInt();
		if(i > 1 && i<9999){
			
			int a = i%10;//个位取余;
			int b = i/10%10;//十位取余
			int c = i/100%10;//百位取余
			int d = i/1000%10;//其哪位取余
			if(d > 0){
			System.out.println("这个数为四位数");
				if(a==d && b==c){
					System.out.println(i+"为回文数");
					}
					else{
					System.out.println(i+"不是回文数");
					}				
			}
			else if(d ==0 && c>0){
			System.out.println("这个数为三位数");
				if(a==c){
					System.out.println(i+"为回文数");
					}
					else{
					System.out.println(i+"不是回文数");
					}
			}
			else if(d == 0 && c== 0 && b > 0 ){
			System.out.println("这个数为二位数");
				if(a==b){
					System.out.println(i+"为回文数");
					}
					else{
					System.out.println(i+"不是回文数");
					}
			}
			else if(d ==0&&c==0 &&b==0 && a > 0 ){
			System.out.println("这个数为一位数");
			System.out.println(i+"为回文数");
			}	
			else{
			System.out.println("请输入1到9999之间的数");
			
			}
		}
		
	}
}







 