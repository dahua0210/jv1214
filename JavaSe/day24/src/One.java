




public class One implements Runnable {
	int ticket = 10;//����10��Ʊ����
	int num= 0;//��ǰ������Ʊ��
	public void run(){
		for(int i=1;i<=10;i++){
			if (ticket>0) {
				ticket--;
				num++;
				System.out.println(Thread.currentThread().getName()+"�����˵�"+num+"��Ʊ��,��ʣ"+ticket+
						"�ų�Ʊ");
				
				
			}
		}
	}
	public static void main(String[] args) {
	 One o=new One();
	 Thread t1 = new Thread(o);
	 Thread t2 = new Thread(o);
	 Thread t3 = new Thread(o);
	 t1.setName("��һ����Ʊ����:");
	 t2.setName("�ڶ�����Ʊ����:");
	 t3.setName("��������Ʊ����:");
	 t1.start();
	 t2.start();
	 t3.start();
		
		
		
		
	}

}
