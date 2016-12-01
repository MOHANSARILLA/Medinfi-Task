import java.util.HashMap;
import java.util.Scanner;

class Employee {
	long emp_Id;
	String emp_Name;
	double emp_Salary;
	String emp_Company;

	
	public Employee(long emp_Id, String emp_Name, double emp_Salary, String emp_Company) {
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		this.emp_Salary = emp_Salary;
		this.emp_Company = emp_Company;
	}

}

class GenerateDetails {
	private void getEmployee(long id, HashMap<Long, Employee> employee) {
		if (employee.containsKey(id)) {
			Employee getemp = employee.get(id);

			System.out.println("Employee Id: " + getemp.emp_Id);
			System.out.println("Employee Name: " + getemp.emp_Name);
			System.out.println("Employee Salary: " + getemp.emp_Salary);
			System.out.println("Employee Company: " + getemp.emp_Company);
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Employee Details");

		HashMap<Long, Employee> edetails = new HashMap<Long, Employee>();
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the " + (i + 1) + "st Employee Details");
			System.out.println("Enter the Employee Id:");
			long eid = in.nextLong();
			if(!edetails.isEmpty())
			{
				while(edetails.containsKey(eid))
				{
					System.out.println("Employee id already exists! Please enter another id");
					eid=in.nextInt();
				}
			}
			System.out.println("Enter the Employee Name:");
			String ename = in.next();
			System.out.println("Enter the Employee Salary:");
			double esalary = in.nextDouble();
			System.out.println("Enter the Employee Company:");
			String ecompany = in.next();

			Employee employee = new Employee(eid, ename, esalary, ecompany);
			
			edetails.put(eid, employee);
		}

		System.out.println("Enter the Employeee ID which you want to get details:");
		long getemployee = in.nextLong();

		GenerateDetails emp=new GenerateDetails();
		emp.getEmployee(getemployee, edetails);
		

	}
}
