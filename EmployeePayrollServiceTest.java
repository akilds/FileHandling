import org.junit.Test;
import java.util.Arrays;
import org.junit.Assert;

public class EmployeePayrollServiceTest {

   //TEST CASE 1
	@Test
	public void employeePayrollCheck()
	{
		EmployeePayrollData[] arrayOfEmps = {
				new EmployeePayrollData(1,"Jeff Bezos",10000.0),
				new EmployeePayrollData(2,"Bill Gates",20000.0),
				new EmployeePayrollData(3,"Mark Zuckerburg",30000.0)
		};
		EmployeePayrollService employeePayrollService;
		employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmps));
		employeePayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
	}

   //TEST CASE 2
	@Test
	public void employeePayrollCheck2()
	{
		EmployeePayrollData[] arrayOfEmps = {
				new EmployeePayrollData(1,"Jeff Bezos",10000.0),
				new EmployeePayrollData(2,"Bill Gates",20000.0),
				new EmployeePayrollData(3,"Mark Zuckerburg",30000.0)
		};
		EmployeePayrollService employeePayrollService;
		employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmps));
		employeePayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
		employeePayrollService.printData(EmployeePayrollService.IOService.FILE_IO);
	}

   //TEST CASE 3
   @Test
	public void employeePayrollCheck3()
	{
		EmployeePayrollData[] arrayOfEmps = {
				new EmployeePayrollData(1,"Jeff Bezos",10000.0),
				new EmployeePayrollData(2,"Bill Gates",20000.0),
				new EmployeePayrollData(3,"Mark Zuckerburg",30000.0)
		};
		EmployeePayrollService employeePayrollService;
		employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmps));
		employeePayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
		employeePayrollService.printData(EmployeePayrollService.IOService.FILE_IO);
		long entries = employeePayrollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
		Assert.assertEquals(3,entries);
	}

   //TEST CASE 4
   @Test
	public void employeePayrollCheck4()
	{
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		long entries = employeePayrollService.readEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
		Assert.assertEquals(3,entries);
	}
}
