
//进程:是操作系统对应用程序资源分配,进程调度最小单位[正在运行进程]
//线程:是系统中执行任务的最小单位[负责程序执行的最小单位,进程多个执行流]
//		线程有自己特有的任务
//		并行执行/同时
//多任务:
//多进程:
//多线程:
//操作系统给进程,线程分配非常小的时间片,有OS去调度,随机切换===宏观上同时执行,
//解决
//
//JVM虚拟机的多线程:
//1.main 线程
//2.垃圾回收线程
//		
//Java: Object  对象  + 回收?
//
//
class A{
	
	//涉及到系统的资源的时候,需要来复写一下该方法:
	protected void finalize() throws Throwable {
		System.out.println("手动回收垃圾");
		System.out.println(Thread.currentThread().getId()+
				Thread.currentThread().getName());
		
		super.finalize();
	}
	
	
}
public class Demo {


	public static void main(String[] args) {
		
		//System.out.println(Thread.currentThread().getId()+Thread.currentThread().getName());
		A a= new A();
		new A();
		new A();
		new A();
		
		new A();
		System.gc();
		System.out.println("main函数");
		
		
	}

}
