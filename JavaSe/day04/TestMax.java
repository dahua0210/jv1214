public class TestMax{
	public static void main(String[] args){
		int max;
		int min;
		int i;
		int[] a = {10,41,78,45,69};
		min=a[0];
		max=a[0];
		System.out.println("����a��Ԫ�ذ���:");
		for(i =0;i<a.length;i++){
		
			if(a[i]>max){
				max = a[i];
				
			}
			if(a[i]<min){
				min= a[i];
				
			}
		
		
		}
	System.out.println("���ֵ��:"+max);
	System.out.println("��Сֵ��:"+min);
	
	}

}