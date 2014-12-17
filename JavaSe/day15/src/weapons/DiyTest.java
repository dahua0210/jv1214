package weapons;


//[����Ա]�ֶ��쳣����֮��: try catch finally
/*
 * runtime�쳣:����Ա�ֶ��׳�,vs  jvm--�Զ�����
 * checked�쳣: ����Ա---�׳�   vs  ����Ա---�ֶ�����
 * checked�쳣����
 * [����Ա]�ֶ�����֮һ:throws
 * [����Ա]�ֶ�����֮��:try catch finally
 *
 *����Ա����:
 *1.ɶʱ��ᷢ���쳣?
 *2.��������ʲô�쳣?  ----runtime   checked
 *3.�����쳣�����쳣��ô����?
 *		a.runtime   JVM
 *		b.checked:  			when?           how?													---ĳ���ϼ����
 *				|-?throws====��֪����ν��		ǩ������:throws+checked �쳣����---�׸�������---�����ߴ���?---�����ϼ��������--->jVM
 *				|-?try catch===֪����ô���		2.��������
 *4.catch(){}   -------?	
 */

//cheecked�쳣:�̳�
class FuacException extends Exception{
	public FuacException(){
	}
	public FuacException(String message){
		super(message);
	}

}
class Demo{
	/*
	 * �ж��쳣---- �׳��쳣----�����쳣
	 * runtime    ����                  JVM
	 * checked ========����Ա����======
	 * 
	 * 
	 */
	
	public void run(int[] arr,int index)throws FuacException{
		if(arr ==null){
			throw new NullPointerException("JVm :��ָ���쳣");
			
		}
		if(index >=arr.length){
			throw new ArrayIndexOutOfBoundsException("jvm:index�����������˳���");
		}else if(index < 0){
			throw new FuacException("����Ա����:index����");
			
			
		}else {
			System.out.println(arr[index]);
		}
		
	
	}
	
}


public class DiyTest {
/*
 * try 
 * 		���ܳ����쳣�Ĵ������
 * catch(�쳣����  e){
 * 	
 * 
 * }
 * finally
 * 
 * 
 * 
 */
	public static void main(String[] args) {
		int[] array = null;
		
		Demo demo  = new Demo();
		try {
			demo.run(array,123);//�����￴���׳�ʲô�쳣
		} catch (FuacException fu) {
			fu.printStackTrace();
			System.out.println(fu);
			System.out.println(fu.toString()+"\n"+fu.getLocalizedMessage());
		}catch(NullPointerException e){
			System.out.println("�������");
			System.out.println(e);
			e.printStackTrace();	//catch ��catch����,��catch����
		}catch (Exception e) {      //�����쳣�ĸ���
			// TODO: handle exception
		}
		finally{
			//����ִ�еĲ���=���������������쳣�Ƿ���:��Դ�Ĳ���
			System.out.println("finally");
			
		}
		System.out.println("=====end======");
	}

}
