




public class One implements Runnable {
	int ticket = 10;//共有10张票出售
	int num= 0;//当前卖出的票数
	public void run(){
		for(int i=1;i<=10;i++){
			if (ticket>0) {
				ticket--;
				num++;
				System.out.println(Thread.currentThread().getName()+"卖出了第"+num+"张票数,还剩"+ticket+
						"张车票");
				
				
			}
		}
	}
	public static void main(String[] args) {
	 One o=new One();
	 Thread t1 = new Thread(o);
	 Thread t2 = new Thread(o);
	 Thread t3 = new Thread(o);
	 t1.setName("第一个售票窗口:");
	 t2.setName("第二个售票窗口:");
	 t3.setName("第三个售票窗口:");
	 t1.start();
	 t2.start();
	 t3.start();
		
		
		
		
	}

}
