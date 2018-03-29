package beans;

public class Employee {
	private String employeeName;
	private long id;
	private double payRate;
	private int yearsEmployed;
	
	public Employee() {
		
	}
	
	public Employee(String employeeName, long id, double payRate, int yearsEmployed) {
		this.employeeName = employeeName;
		this.id = id;
		this.payRate = payRate;
		this.yearsEmployed = yearsEmployed;		
	}
	
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	public int getYearsEmployed() {
		return yearsEmployed;
	}

	public void setYearsEmployed(int yearsEmployed) {
		this.yearsEmployed = yearsEmployed;
	}

}

	