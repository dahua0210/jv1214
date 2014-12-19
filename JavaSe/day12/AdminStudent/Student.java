public class Student{
	private int on;
	private String name;
	private int age;
	private int java;
	private int c;
	private int html;
	private int sql;
	private int sum;
	private int avg;
	public void setOn(int on){
		this.on = on;
	}
	public int getOn(){
		return on;
	}
	public void setName(String name){
		this.name= name;
	}
	public String getName(){
		return this.name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void setJava(int java){
		this.java= java;
	}
	public int getJava(){
		return java;
	}
	public void setC(int c){
		this.c= c;
	}
	public int getC(){
		return c;
	}
	public void setHtml(int html){
		this.html= html;
	}
	public int getHtml(){
		return html;
	}
	public void setSql(int sql){
		this.sql= sql;
	}
	public int getSql(){
		return sql;
	}
	public void setSum(){
		this.sum =this.java +this.c+ this.html +this.sql;
	}
	public int getSum(){ 
		return sum ;
	}
	public void setAvg(){
		this.avg= this.sum/4;
	}
	public int getAvg( ){
		return avg;
	}
	public String toString(){
		String msg = "\t"+this.on+"\t"+this.name+"\t"+this.age+"\t"+this.java+"\t"
		+this.c+"\t"+this.html+"\t"+this.sql+"\t"+this.sum+"\t"+this.avg;
		return msg;
	
	}
	
}