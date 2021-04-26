import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollService {

	public enum IOService {CONSOLE_IO, FILE_IO, DB_IO, REST_IO}
	private List<EmployeePayrollData> employeePayrollList;

	public EmployeePayrollService() {}

	public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList)
   {
		this.employeePayrollList = employeePayrollList;
	}

	public static void main(String[] args)
   {
		ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
		EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
		Scanner consoleInputReader = new Scanner(System.in);
		employeePayrollService.readEmployeePayrollData(consoleInputReader);
		employeePayrollService.writeEmployeePayrollData();
	}

	private void readEmployeePayrollData(Scanner consoleInputReader)
	{
		System.out.println("Enter Employee ID : ");
		int id = consoleInputReader.nextInt();
		System.out.println("Enter Employee Name : ");
		String name = consoleInputReader.next();
		System.out.println("Enter Employee salary : ");
		double salary = consoleInputReader.nextDouble();
		employeePayrollList.add(new EmployeePayrollData(id, name, salary));
	}

   public void writeEmployeePayrollData(IOService ioService)
	{
		if(ioService.equals(EmployeePayrollService.IOService.CONSOLE_IO))
			System.out.println("\nWriting Employee payroll Roaster to Console\n" + employeePayrollList);
		else if(ioService.equals(EmployeePayrollService.IOService.FILE_IO))
			new EmployeePayrollFileIOService().writeData(employeePayrollList);
	}

   public void printData(IOService ioService)
	{
		if(ioService.equals(IOService.FILE_IO))
			new EmployeePayrollFileIOService().printData();
	}
}

