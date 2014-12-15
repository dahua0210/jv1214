
public class L3_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1 = new B(20);
		B b2 = new B(20);
		C c1 = new C(12);
		C c2 = new C(13);
		System.out.println(b1==b2);
		System.out.println(c1.equals(c2));
	}
	
}
class B{
	private int i; 		
	
	B(int i){
		this.i= i;
	}
 public boolean equals(B b2){
	 if( this.i== b2.i ){
		 return true;
		 
	 }else{
		 return false;
		 
	 } 
 }
}
class C extends B{//equals方法要改写,
	private int j;
	C(int j){
		super(j);
		this.j = j;
	}
}




