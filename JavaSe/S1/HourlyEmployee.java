class HourlyEmployee extends Employee{
		
		int salary;    		 //����ÿСʱ�Ĺ���
		int hour;     		//���幤����ʱ��
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
	
	System.out.println("����"+name+"����������"+birs+"����"+this.getSalary(month));
	}
}