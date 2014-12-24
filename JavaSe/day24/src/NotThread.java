


/*main--------{}
 * 
 * Thread:线程类,线程有自己的任务,在定义线程类的时候,需要实现?如run()
 * 
 * 一,继承Thread类来创建:
 * 1.继承
 * 2.读写run():任务  //子类
 * 3.实例化:线程对象
 * 4.启动使用:start
 */
class Monkey extends Thread{
	String name;
	public Monkey(String name){
		super();
		this.name=name;
		
	}
	public void run(){
		for(int i = 1;i<11;i++){
			System.out.println(name+"打败第"+i+"个天兵天将");
			System.out.println(Thread.currentThread().getId()+
					Thread.currentThread().getName());
		}
		
	}
	
}



public class NotThread {

	public static void main(String[] args) {
		Monkey m1=new Monkey("第一个小悟空");
		Monkey m2=new Monkey("第二个小悟空");
		Monkey m3=new Monkey("第三个小悟空");
		m1.setName("线程一");
		m1.start();
		m2.start();
		m3.start();
		System.out.println(Thread.currentThread().getId()+
				Thread.currentThread().getName());
	}

}
