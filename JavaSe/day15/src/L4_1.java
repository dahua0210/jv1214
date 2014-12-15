import java.util.*;


public class L4_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList aaa = new ArrayList();
		Xs xs1 = new Xs("刘强东",001,98);
		Xs xs2 = new Xs("东",002,98);
		Xs xs3 = new Xs("强东",006,9);
		Xs xs4 = new Xs("强",45,8);
		aaa.add(xs1);
		aaa.add(xs2);
		aaa.add(xs3);
		aaa.add(xs4);
		System.out.println("大小为"+aaa.size());
		for(int i=0;i<aaa.size();i++){
			Xs tv = (Xs)aaa.get(i);
			System.out.println("第"+(i+1)+"个学生的姓名:"+tv.getName());
			
		}
		
		
		
	}

}
