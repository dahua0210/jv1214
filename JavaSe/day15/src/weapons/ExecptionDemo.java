package weapons;


//��ʱ�׳��쳣

//�Զ����쳣��:����̳�exception�쳣,������=�׸�������,==throw throw�ؼ����׳�
/*ʵ����:�߼����� �� �쳣����� ����
 * 
 * 
 * �쳣����
 *  jvm����
 *  
 * 
 * 
 */

class FuException extends RuntimeException{
	public FuException(){
	}
	public FuException(String message) {
		super(message);//���ø���Ĺ��캯��,�������д���
	}
}
class Test{
	
	void run(int[] arr,int index){
		
		//�Զ����쳣:JVM--new--throw--->main--->JVm--->����̨
		//throw   java.lang.ArrayIndexOutOfBoundsException
		if(index < 0){
			//throw new ArrayIndexOutOfBoundsException("�±긺");//�ֶ��׳��쳣
			//�ֶ��ܳ�:�Զ����쳣
			throw  new FuException("�Զ���--���±��쳣");
			
		}else if(index>=arr.length){
			throw new ArrayIndexOutOfBoundsException("index>= ���鳤��"+arr.length);
		}else if(arr== null){
			//�쳣����:new + ����
			throw new NullPointerException("��ָ���쳣");	
		}else{
			System.out.println(arr[index]);
		}
	}
}

public class ExecptionDemo {
	//��ʾһ���׳��쳣������
	
	
	/**
	 * @param args
	 * @throws FuException 
	 */
	public static void main(String[] args)  { //--->>JVM
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		int[] array = null;
		
		//1.����main������,ֱ�ӷǷ���������
		//array[0] = 123;
		//arr[5]= 1232;    //ArrayIndexOutOfBoundsException
		
		
		//2.���ó�Ա����,�ڳ�Ա�����зǷ���������
		//run(arr,-5);
		
		
		//3.���������зǷ�����
	Test test = new Test();
	test.run(arr,-5);//throw   java.lang.ArrayIndexOutOfBoundsException
	//test.run(arr,6);//��ʶ��
	System.out.println("======end=======");
	}
	public static void run(int[] arr,int index){
		System.out.println(arr[index]);	
	}

}//�����׳��쳣:jvm--new[]---main---jvm---����̨---���߳���Ա
