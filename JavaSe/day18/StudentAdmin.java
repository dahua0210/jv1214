import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;


public class StudentAdmin {

	public static void main(String[] args) {
		ArrayList aa = new ArrayList();
		int sum = 0;
		int avg=0;
		Student s1 = new Student(1,"����","��",21,92);
		Student s2 = new Student(2,"������","Ů",24,51);
		Student s3 = new Student(3,"�ܽ���","��",21,64);
		Student s4 = new Student(4,"С����","Ů",21,86);
		Student s5 = new Student(5,"��С��","��",21,70);
		aa.add(s1);
		aa.add(s2);
		aa.add(s3);
		aa.add(s4);
		aa.add(s5);
		Iterator iterator= aa.iterator();
		while (iterator.hasNext()) {
			Student object = (Student) iterator.next();
			System.out.println(object);
		}
		int i = 0 ;
		for ( i = 0; i < aa.size(); i++) {
			sum +=((Student)aa.get(i)).getsJava();
		}
		System.out.println("ѧ�����ܷ�:"+sum);
		System.out.println("ѧ����java�ɼ�:"+sum/5);
		int max=0; 
		int min=999;
		for( i = 0; i < aa.size(); i++){	
			if(max<((Student)aa.get(i)).getsJava()){
					max =((Student)aa.get(i)).getsJava();
				}
			}
		for( i = 0; i < aa.size(); i++){	
			if(min>((Student)aa.get(i)).getsJava()){
					min =((Student)aa.get(i)).getsJava();
				}
			}
		System.out.println("java��߳ɼ�:"+max);
		System.out.println("java��ͳɼ�:"+min);
		}
		
	}

