package Employeee;
public class EmployeeMain {
	public static void main(String args[])
	{
		Employee obj = new Employee();
		obj.setName("Karthik kumar");
		obj.setAddress("Warangal");
		obj.setMobile("9592336132");
		System.out.println(obj.getName());
		System.out.println(obj.getAddress());
		System.out.println(obj.getMobile());
	}
}