


/*
 * 1.实现了[线程任务run]和线程对象
 * 2.RunnableDemo Extends A [避免单继承限制]
 * 
 */
public class RunnableDemo implements Runnable {
	private int i;
	
	public void run() {
		for(int i=0;i<20;i++){
			
			System.out.println(Thread.currentThread().getName()+"=="+i);
		
		}
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		RunnableDemo rd= new RunnableDemo();
		
		
		Thread t1=new Thread(rd);
		Thread t2=new Thread(rd);
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+"()()()()"+i);
			if(i==55){
				t1.start();
				t2.start();
			}
		}
	}
}
