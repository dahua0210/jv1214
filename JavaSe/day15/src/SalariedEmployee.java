
/**
 * @author C4
 *
 */
public class SalariedEmployee extends Employee {
	private double monthSalary; //¹Ì¶¨ÔÂÐ½
	public SalariedEmployee() {
		// TODO Auto-generated constructor stub
	}

	public SalariedEmployee(String name,double monthSalary, int birthMonth) {
		super(name, birthMonth);
		this.monthSalary = monthSalary;
		
	}
	@Override
	public double getSalary(int month) {
		// TODO Auto-generated method stub
		return super.getSalary(month)+this.monthSalary;
	}
}
