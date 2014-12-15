
public class BaseplusEmployee extends SalesEmoployee {
	private double baseSalary;
	
	public BaseplusEmployee() {
		// TODO Auto-generated constructor stub
	}

	public BaseplusEmployee(String name, int birthMonth,double sales,
			float percent,double baseSalary) {
		super(name, birthMonth,sales,percent);
		// TODO Auto-generated constructor stub
		this.baseSalary = baseSalary;
	}
	public double getSalary(int month){
		return super.getSalary(month)+baseSalary;
		
		
	}

}
