

public class Employee {
	private String name;
	private double salary;  //总薪水
	private int birthMonth;
	public Employee(){
		
		
		
	}
	public Employee(String name,  int birthMonth) {
	super();
	this.name = name;
	
	this.birthMonth = birthMonth;
	}
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//根据参数月份来确定工资,如果该月员工过生日,则公司会额外奖励100元
	public double getSalary(int month) {
		if(this.birthMonth == month){
			System.out.println("祝"+this.name+"生日快乐");
			return salary + 100;
		}else{
			return this.salary;
		}
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getBirthMonth() {
		return birthMonth;
	}
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
	
	

}

