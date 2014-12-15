
public class SalesEmoployee extends Employee {
	private double sales;
	private float percent;
	public SalesEmoployee() {
		super();
		
		// TODO Auto-generated constructor stub
	}

	public SalesEmoployee(String name, int birthMonth,double sales,float percent) {
		super(name, birthMonth);
		// TODO Auto-generated constructor stub
		this.sales = sales;
		this.percent = percent;
		
	}
	public double getSalary(int month) {
		return super.getSalary(month)+sales*percent;
	}

}
