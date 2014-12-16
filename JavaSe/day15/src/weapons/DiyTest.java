package weapons;


//[程序员]手动异常处理之二: try catch finally
/*
 * runtime异常:程序员手动抛出,vs  jvm--自动处理
 * checked异常: 程序员---抛出   vs  程序员---手动处理
 * checked异常处理
 * [程序员]手动处理之一:throws
 * [程序员]手动处理之二:try catch finally
 *
 *程序员考虑:
 *1.啥时候会发生异常?
 *2.发生的是什么异常?  ----runtime   checked
 *3.根据异常类型异常怎么处理?
 *		a.runtime   JVM
 *		b.checked:  			when?           how?													---某个上级解决
 *				|-?throws====不知道如何解决		签名函数:throws+checked 异常类名---抛给调用者---调用者处理?---是你上级解决不了--->jVM
 *				|-?try catch===知道怎么解决		2.可以声明
 *4.catch(){}   -------?	
 */

//cheecked异常:继承
class FuacException extends Exception{
	public FuacException(){
	}
	public FuacException(String message){
		super(message);
	}

}
class Demo{
	/*
	 * 判断异常---- 抛出异常----处理异常
	 * runtime    代码                  JVM
	 * checked ========程序员处理======
	 * 
	 * 
	 */
	
	public void run(int[] arr,int index)throws FuacException{
		if(arr ==null){
			throw new NullPointerException("JVm :空指针异常");
			
		}
		if(index >=arr.length){
			throw new ArrayIndexOutOfBoundsException("jvm:index大于了数组了长度");
		}else if(index < 0){
			throw new FuacException("程序员处理:index负数");
			
			
		}else {
			System.out.println(arr[index]);
		}
		
	
	}
	
}


public class DiyTest {
/*
 * try 
 * 		可能出现异常的代码语句
 * catch(异常类型  e){
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
			demo.run(array,123);//从哪里看出抛出什么异常
		} catch (FuacException fu) {
			fu.printStackTrace();
			System.out.println(fu);
			System.out.println(fu.toString()+"\n"+fu.getLocalizedMessage());
		}catch(NullPointerException e){
			System.out.println("进入语句");
			System.out.println(e);
			e.printStackTrace();	//catch 先catch子类,后catch父类
		}catch (Exception e) {      //所有异常的父类
			// TODO: handle exception
		}
		finally{
			//必须执行的操作=不管你正不正常异常是否发生:资源的操作
			System.out.println("finally");
			
		}
		System.out.println("=====end======");
	}

}
