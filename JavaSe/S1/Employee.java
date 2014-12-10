class Employee{
	String name;
	double salary;
	int birs;
	int month;
	public Employee(){
	}
	public Employee(String name,int birs){
		this.name = name;
		this.birs = birs;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setBirs(int birs){
		this.birs = birs;
	}
	public String getName(String name){
		return name;
	}
	public int getBirs(int birs){
		return birs;
	}
	int getSalary(int month){
		if(month == birs){
			return 100;
		}else{
			return 0;
		}
	}
	
}
