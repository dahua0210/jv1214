import java.util.*;

//数组:存放同种数据类型的元素:下表的范围[0,N-1]
public class ArrayTest{
	public static void main(String args[]){
			//声明数组 :变量在栈空间
			//int[] arr;    //建议使用这种数组
			//int  arr[];
			//int test[10];  //声明数组时,不可以指定大小
			
			
			//初始化
			//arr = new int[10];
			//arr1 = {1,2,4};
			//声明+初始化
			//String[] str = new String[5];//默认初始化
			//String[] IT = String[]{"Java","C","C++","Android"};
			//String[] IT1 =         {"Java","C","C++","Android"};//简写
			//for(int i =1; i<IT.length;i++){
				//System.out.println(IT+"");

			//}
	
			//完成数组的遍历
			/*String[] Array = new String[]{"Java","c++","lee"};
			for(int i =1; i<Array.length;i++){
				
				System.out.println(Array+"国华");

			}*/
			/*int[] samallPrimes = {2,3,5,7,11,13};
			int[] luckyNumbers = {1001,1002,1003,1004,1005,1006,1007};
			System.arraycopy(samallPrimes,2,luckyNumbers,3,4);
			for(int i =1; i<luckyNumbers.length;i++){
				
				System.out.println(i+":"+ luckyNumbers[i]);*/
			/*if(args[0].equals("-h"))
				System.out.println("Hello,");
				else if(args[0].equals("-g"))
					System.out.println("Goodbye,");
					for(int i = 1;i< args.length;i++)
					System.out.println(""+args[i]);
					System.out.println("!");*/
					//java message -g cruel world
					int a[] ={4,32,45,32,65,32,2};
					System.out.print("数组排序前的顺序");
					for(int i=0;i<a.length;i++)
					System.out.print(a[i]+" ");	
					Arrays.sort(int,Collections.reverseOrder(a));//数组的排序方法
					System.out.print("数组排序后的顺序");
					for(int i = 0;i<a.length;i++)
					System.out.print(a[i]+" ");
					System.out.print("\n");
					
					
					
					
			}
	}






