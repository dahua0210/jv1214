import java.util.Scanner;

public class Admin{//����ѧ��һ����
	
	Scanner in = new Scanner(System.in);
	String msg = "\t���\t����\t����\tjava\tC#\thtml\tsql\t�ܷ�\tƽ����";
	public void print(Student[] arr){
		System.out.println(msg);
			for(int i=0;i<arr.length;i++){
				arr[i].setSum();
				arr[i].setAvg();
				System.out.println(arr[i]);
		}
	}
	public boolean exist(int on,Student stu){//�ж�ѧ���Ƿ����
		if(stu!=null){
			if(stu.getOn()==on){
			return true;
			}
			return false;
		}
			return false;
	}
	public void create(String name,int age,Student[] arr){//���ѧ���ķ���
		Student stu = new Student();
		stu.setName(name);
		stu.setAge(age);
		this.setIndex(arr);
		int i= this.setIndex(arr);
		stu.setOn(i);
		if(i == 9999){
			System.out.println("ѧ�������ѵ����");
		}else{
		arr[i] = stu;
		}
		this.print(arr);
	}
	//arr[i] ==ѧ������
	public void select(int on,Student[] arr){
		for(int i=0;i<arr.length;i++){
			if(this.exist(on,arr[i])==true){
				System.out.println(msg);
				System.out.println(arr[i]);
				return;//��break���return�����˷���
			}
		}
		System.out.println("�����޴�ѧ��");
	}
	public int setIndex(Student[] arr){
		for(int i=0;i<arr.length;i++){
			if(arr[i]== null){
				return i;
			}
		}
		return 9999;
	}
	public void update(int on,String name,int age,Student[] arr){
		for(int i =0;i<arr.length;i++){
			if(this.exist(on,arr[i])==true){
				arr[i].setName(name);
				arr[i].setAge(age);
				System.out.println("����ѧ���ɹ�");
				return;
			}
		}
		System.out.println("���޴�ѧ��");
	}
	
	public void delete(int on,Student[] arr){
		for(int i=0;i<arr.length;i++){
			if(this.exist(on,arr[i])==true){
				arr[i]= null;
				this.print(arr);
				System.out.println("ɾ��ѧ���ɹ�");
				return;
			}
		}
		System.out.println("�Ҳ�������Ҫɾ����ѧ�����");	
	
	
	}
	public void score(int on,Student[] arr){
		for(int i =0;i<arr.length;i++){
			if(this.exist(on,arr[i])==true){
               System.out.println("������java�ĳɼ�");
				arr[i].setJava(in.nextInt());
				System.out.println("������c�ĳɼ�");
				arr[i].setC(in.nextInt());
				System.out.println("������html�ĳɼ�");
				arr[i].setHtml(in.nextInt());
				System.out.println("������sql�ĳɼ�");
				arr[i].setSql(in.nextInt());
				this.print(arr);
				break;
			}
	
		}
	
	}
	public void course(int number,Student[] arr){
		if(number==1){
			for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]!=null && arr[j] !=null){
				if(arr[i].getJava()<arr[j].getJava()){
					Student temp =arr[i];
					arr[i] = arr[j];
					arr[j]	=temp;		
					}
				}
			}
		}
	}else if(number ==2){
			for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]!=null && arr[j] !=null){
				if(arr[i].getC()<arr[j].getC()){
					Student temp =arr[i];
					arr[i] = arr[j];
					arr[j]	=temp;		
					}
				}
			}
		}		
	}else if(number ==3){
			for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]!=null && arr[j] !=null){
				if(arr[i].getHtml()<arr[j].getHtml()){
					Student temp =arr[i];
					arr[i] = arr[j];
					arr[j]	=temp;		
					}
				}
			}
		}		
	}else if(number ==4){
			for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]!=null &&arr[j] !=null){
				if(arr[i].getSql()<arr[j].getSql()){
					Student temp =arr[i];
					arr[i] = arr[j];
					arr[j]	=temp;		
						}
					}
				}
			}		
		}
			this.print(arr);
	}
	
	public void sumSort(Student[] arr){//�����ֽܷ�������
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]!=null &&arr[j] !=null){
				if(arr[i].getSum()<arr[j].getSum()){
					Student temp =arr[i];
					arr[i] = arr[j];
					arr[j]	=temp;		
						}
					}
				}
			}		
		this.print(arr);
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}