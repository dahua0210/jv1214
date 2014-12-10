public class StuScore{
	public static void main(String[] args){
		String[] name = {"core C++","coreJava","Servlet","JSP","EJB"};//´æ´¢5
		int[][] grade=new int[20][5];
		int[] sum = new int[20];
		int[] avg = new int[5];
	
		System.out.println("C++\tJava\tServlet\tJSP\tEJB");
		for(int i = 0;i< 20;i++){
			int S = 0;
			for(int j = 0;j<5;j++){
				grade[i][j] = (int)(Math.random()*100); 
				System.out.printf(grade[i][j]+"\t");
				S += grade[i][j];
			}
			System.out.println("");
			sum[i] = S;	
		}
		for(int j=0;j<5;j++){
			int S1=0;
			for(int i = 0;i<20;i++){
			S1  += grade[i][j]; 
			}
			avg[j]= S1/20;
		}
		
		for(int i=0;i<20;i++){
			System.out.println("Student"+(i+1)+"\t"+sum[i]);
		}
		for(int j=0;j<5;j++){
			System.out.println("¿Î³Ì"+(j+1)+"\t"+avg[j]);
		}
	}
}