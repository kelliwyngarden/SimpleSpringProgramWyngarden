package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
		
		System.out.println("Before Pay Rate Change");
		System.out.println(employeeService.getEmployee(1).getEmployeeName() + "'s hourly rate: $" + employeeService.getEmployee(1).getPayRate());
		System.out.println(employeeService.getEmployee(2).getEmployeeName() + "'s hourly rate: $" + employeeService.getEmployee(2).getPayRate());
		
		employeeService.changePayRate(1, 2);
		employeeService.changePayRate(2,  2);
		
		System.out.println("After Pay Rate Change");
		System.out.println(employeeService.getEmployee(1).getEmployeeName() + "'s hourly rate: $" + employeeService.getEmployee(1).getPayRate());
		System.out.println(employeeService.getEmployee(2).getEmployeeName() + "'s hourly rate: $" + employeeService.getEmployee(2).getPayRate());
	}

}
