package weapons;


//延时抛出异常

//自定义异常类:必须继承exception异常,可抛型=抛给调用者,==throw throw关键字抛出
/*实现了:逻辑处理 和 异常处理的 分离
 * 
 * 
 * 异常处理
 *  jvm处理
 *  
 * 
 * 
 */

class FuException extends RuntimeException{
	public FuException(){
	}
	public FuException(String message) {
		super(message);//调用父类的构造函数,对他进行传参
	}
}
class Test{
	
	void run(int[] arr,int index){
		
		//自动抛异常:JVM--new--throw--->main--->JVm--->控制台
		//throw   java.lang.ArrayIndexOutOfBoundsException
		if(index < 0){
			//throw new ArrayIndexOutOfBoundsException("下标负");//手动抛出异常
			//手动跑出:自定义异常
			throw  new FuException("自定义--负下标异常");
			
		}else if(index>=arr.length){
			throw new ArrayIndexOutOfBoundsException("index>= 数组长度"+arr.length);
		}else if(arr== null){
			//异常对象:new + 构造
			throw new NullPointerException("空指针异常");	
		}else{
			System.out.println(arr[index]);
		}
	}
}

public class ExecptionDemo {
	//演示一下抛出异常的流程
	
	
	/**
	 * @param args
	 * @throws FuException 
	 */
	public static void main(String[] args)  { //--->>JVM
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		int[] array = null;
		
		//1.在在main函数中,直接非法操作数组
		//array[0] = 123;
		//arr[5]= 1232;    //ArrayIndexOutOfBoundsException
		
		
		//2.调用成员方法,在成员方法中非法操作数组
		//run(arr,-5);
		
		
		//3.在其他类中非法操作
	Test test = new Test();
	test.run(arr,-5);//throw   java.lang.ArrayIndexOutOfBoundsException
	//test.run(arr,6);//常识性
	System.out.println("======end=======");
	}
	public static void run(int[] arr,int index){
		System.out.println(arr[index]);	
	}

}//怎嘛抛出异常:jvm--new[]---main---jvm---控制台---告诉程序员
