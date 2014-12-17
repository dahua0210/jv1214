package weapons;
//延时抛出异常
class Test{
	void run(int[] arr,int index){
		
		//自动抛异常:JVM--new--throw--->main--->JVm--->控制台
		//throw   java.lang.ArrayIndexOutOfBoundsException
		if(index < 0){
			throw new ArrayIndexOutOfBoundsException("下标负");//手动抛出异常
		}else if(index>=arr.length){
			throw new ArrayIndexOutOfBoundsException("index>= 数组长度"+arr.length);
		}else if(arr== null){
			throw new ArrayIndexOutOfBoundsException("空指针异常");	
		}else{
			System.out.println(arr[index]);
		}
	}
}

public class ExecptionDemo {
	//演示一下抛出异常的流程
	
	
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
	test.run(arr,6);//常识性
	System.out.println("======end=======");
	}

}//怎嘛抛出异常:jvm--new[]---main---jvm---控制台---告诉程序员
