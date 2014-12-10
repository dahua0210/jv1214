class SalariedEmployee extends Employee{
		
		public SalariedEmployee(String name,int birs,int salary){
		super(name,birs);
		this.salary = salary;	
	}
		public int getSalary(int month){
		return (int)(this.salary + super.getSalary(month));
 
	}
	void info(){
	
	System.out.println("姓名"+name+"生日所在月"+birs+"工资"+this.getSalary(month));
	}
	
}