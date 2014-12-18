import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;


public class StudentAdmin {

	public static void main(String[] args) {
		ArrayList aa = new ArrayList();
		int sum = 0;
		int avg=0;
		Student s1 = new Student(1,"华仔","男",21,92);
		Student s2 = new Student(2,"邓紫棋","女",24,51);
		Student s3 = new Student(3,"周杰伦","男",21,64);
		Student s4 = new Student(4,"小妹妹","女",21,86);
		Student s5 = new Student(5,"曾小贤","男",21,70);
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
		System.out.println("学生的总分:"+sum);
		System.out.println("学生的java成绩:"+sum/5);
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
		System.out.println("java最高成绩:"+max);
		System.out.println("java最低成绩:"+min);
		}
		
	}

