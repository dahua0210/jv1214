public class Test{
	public static void main(String args[]){
		
		/*int sum = 1;
		for(int i = 1;i <= 100 && sum <= 5;i++){
			if(i%3 == 0){
			System.out.println("输出第"+sum+"个数"+i);
			sum++;
			continue;
			}
		}*/
		
			int sum = 1;
			for(int i=101;i<200;i+=2){
				if(i%2 != 0 ){
				
				System.out.println("输出第"+sum+"质数"+i);
				sum++;
				continue;
				
				}
			
			}	
	}
}