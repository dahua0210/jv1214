import java.util.*;

//����:���ͬ���������͵�Ԫ��:�±�ķ�Χ[0,N-1]
public class ArrayTest{
	public static void main(String args[]){
			//�������� :������ջ�ռ�
			//int[] arr;    //����ʹ����������
			//int  arr[];
			//int test[10];  //��������ʱ,������ָ����С
			
			
			//��ʼ��
			//arr = new int[10];
			//arr1 = {1,2,4};
			//����+��ʼ��
			//String[] str = new String[5];//Ĭ�ϳ�ʼ��
			//String[] IT = String[]{"Java","C","C++","Android"};
			//String[] IT1 =         {"Java","C","C++","Android"};//��д
			//for(int i =1; i<IT.length;i++){
				//System.out.println(IT+"");

			//}
	
			//�������ı���
			/*String[] Array = new String[]{"Java","c++","lee"};
			for(int i =1; i<Array.length;i++){
				
				System.out.println(Array+"����");

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
					System.out.print("��������ǰ��˳��");
					for(int i=0;i<a.length;i++)
					System.out.print(a[i]+" ");	
					Arrays.sort(int,Collections.reverseOrder(a));//��������򷽷�
					System.out.print("����������˳��");
					for(int i = 0;i<a.length;i++)
					System.out.print(a[i]+" ");
					System.out.print("\n");
					
					
					
					
			}
	}






