class SalesEmployee extends Employee{
			int sales;
			double tichen;
			public SalesEmployee(String name,int birs,int sales,double tichen){
				super(name,birs);
				this.sales = sales;
				this.tichen = tichen;
			}
			public void setSales(int sales){
				this.sales = sales;
			}
			public int getSales(int sales){
				return sales;
			}
			public int getSalary(int month){
				 return(int)(this.sales*tichen+super.getSalary(month));
			}
			void info(){
	
			System.out.println("姓名"+name+"生日所在月"+birs+"工资"+this.getSalary(month));
			}
		
}