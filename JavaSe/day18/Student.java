import org.omg.CORBA.PRIVATE_MEMBER;


public class Student {
	private int    sNo;
	private String sName;
	private String sSex;
	private int    sAge;
	private int    sJava;
	
	public Student() {
	
	}
	public Student(int sNo, String sName, String sSex, int sAge, int sJava) {
		super();
		this.sNo = sNo;
		this.sName = sName;
		this.sSex = sSex;
		this.sAge = sAge;
		this.sJava = sJava;
	}
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsSex() {
		return sSex;
	}
	public void setsSex(String sSex) {
		this.sSex = sSex;
	}
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	public int getsJava() {
		return sJava;
	}
	public void setsJava(int sJava) {
		this.sJava = sJava;
	}
	
	public String toString(){
		return "sNo:"+sNo+"sName:"+sName+"sSex:"+sSex+"sAge:"+sAge+"sJava;"+sJava+"\n";
	}

}
