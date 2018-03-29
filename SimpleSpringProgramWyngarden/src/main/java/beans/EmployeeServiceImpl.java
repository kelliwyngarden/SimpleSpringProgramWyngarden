package beans;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao employeeDao;
	
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public void changePayRate(long employeeId, double amount) {
		// TODO Auto-generated method stub
		Employee employee = employeeDao.find(employeeId);
		int tenure = 3;
		if(employee.getYearsEmployed() > tenure) {
			employee.setPayRate(employee.getPayRate() + amount);
		} else {
			employee.setPayRate(employee.getPayRate() + (amount/4));
		}
		employeeDao.update(employee);
	}

	public Employee getEmployee(long employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.find(employeeId);
	}

}
