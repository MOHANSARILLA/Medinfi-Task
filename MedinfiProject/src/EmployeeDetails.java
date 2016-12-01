import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class EmployeeDetails {
	
	public int emp_Id;
	public String emp_Name;
	public int emp_Salary;
	public String emp_CompanyName;
	
	
	public EmployeeDetails(int emp_Id, String emp_Name, int emp_Salary, String emp_CompanyName) {
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		this.emp_Salary = emp_Salary;
		this.emp_CompanyName = emp_CompanyName;
	}


	public static void main(String[] args) {
		//BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		Scanner in=new Scanner(System.in);
		HashSet<EmployeeDetails> e_Details=new HashSet<EmployeeDetails>();
		for(int i=0;i<3;i++)
		{
			EmployeeDetails e=new EmployeeDetails(in.nextInt(), in.next(), in.nextInt(), in.next());
			e_Details.add(e);
		}
		
		
		System.out.println("Enter the Employee id");
		int empid=in.nextInt();
		Iterator getElements=e_Details.iterator();
		
		while(getElements.hasNext())
		{
			EmployeeDetails getEmployee=(EmployeeDetails)getElements.next();
			if(getEmployee.emp_Id==empid){
			System.out.println(getEmployee.emp_Id);
			System.out.println(getEmployee.emp_Name);
			System.out.println(getEmployee.emp_Salary);
			System.out.println(getEmployee.emp_CompanyName);
			}
		}
		
		
		
	}

}
