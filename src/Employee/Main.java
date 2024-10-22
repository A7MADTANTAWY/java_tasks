package Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee("Ahmed Tatawy", "Mobile app developer", 20000);
	
		employee1.printEmployeeInfo();
        // Increase salary by 10%
        employee1.increaseSalary(10);
	}

}
