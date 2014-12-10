class BasePlusSalesEmployee extends SalesEmployee{
		int minSalary;
		public  BasePlusSalesEmployee(String name,int birs,int sales,double tichen,
		int miniSalary){
			super(name,birs,sales,tichen);
		
			this.minSalary = minSalary;
		}
		public void setSales(int sales){
			this.sales= sales;
			
		}
		public int getSales(int sales){
			return sales;
		
		}
		public int getSalary(){
			return minSalary;
		}
		public int getSalary(int month){
			return(int)(minSalary+this.sales*tichen+super.getSalary(month));
		}
		void info(){
	
		System.out.println("姓名"+name+"生日所在月"+birs+"工资"+this.getSalary(12));
	}
}