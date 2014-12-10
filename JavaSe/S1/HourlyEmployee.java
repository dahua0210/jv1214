class HourlyEmployee extends Employee{
		
		int salary;    		 //定义每小时的工资
		int hour;     		//定义工作的时间
		public HourlyEmployee(String name,int birs,int salary,int hour){
				super(name,birs);
				this.salary = salary;
				this.hour = hour;		
		}
		public int getSalary(){
				return salary;
		
		}
		public void setSalary(int salary){
				this.salary= salary;
		}
		public int getSalary(int month){
			if(hour>160){
			return(int)(this.salary*160+(this.hour-160)*this.salary*1.5+super.getSalary(month));
			
			}
			else{
			return(int)(this.salary*160+super.getSalary(month));
			}
		}
		void info(){
	
	System.out.println("姓名"+name+"生日所在月"+birs+"工资"+this.getSalary(month));
	}
}