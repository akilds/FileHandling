public class EmployeePayrollData {
	private int id;
	private String name;
	private Double salary;

	public EmployeePayrollData(int id, String name, Double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString()
	{
		return "id=" + id + ", name=" + name + ", salary=" + salary;
	}
}
