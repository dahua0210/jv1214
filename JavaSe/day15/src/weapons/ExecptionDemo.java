package weapons;
//��ʱ�׳��쳣
class Test{
	void run(int[] arr,int index){
		
		//�Զ����쳣:JVM--new--throw--->main--->JVm--->����̨
		//throw   java.lang.ArrayIndexOutOfBoundsException
		if(index < 0){
			throw new ArrayIndexOutOfBoundsException("�±긺");//�ֶ��׳��쳣
		}else if(index>=arr.length){
			throw new ArrayIndexOutOfBoundsException("index>= ���鳤��"+arr.length);
		}else if(arr== null){
			throw new ArrayIndexOutOfBoundsException("��ָ���쳣");	
		}else{
			System.out.println(arr[index]);
		}
	}
}

public class ExecptionDemo {
	//��ʾһ���׳��쳣������
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) { //--->>JVM
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		int[] array = null;
		
		
		//array[0] = 123;
		//arr[5]= 1232;    //ArrayIndexOutOfBoundsException
	Test test = new Test();
	//test.run(arr,5);//throw   java.lang.ArrayIndexOutOfBoundsException
	test.run(arr,6);//��ʶ��
	System.out.println("======end=======");
	}

}//�����׳��쳣:jvm--new[]---main---jvm---����̨---���߳���Ա
