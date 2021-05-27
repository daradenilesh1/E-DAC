package Assi2.Employee;

public class Employee {
	//empid,name,address,salary.Use Getter Setters
	
	private int empid;
	private String name;
	private String address;
	private int salary;
	
public Employee(int empid,String name,String address,int salary)
{
	this.empid=empid;
	this.name=name;
	this.address=address;
	this.salary=salary;
	
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSlary() {
		return salary;
	}

	public void setSlary(int salary) {
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}
	
	public void setEmpid(int empid)
	{
		this.empid=empid;
	}
	
	
	
	

}
