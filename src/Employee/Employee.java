package Employee;

public class Employee {
	  private String name;
	    private String jobTitle;
	    private double salary;

	    // Constructor to initialize employee details
	    public Employee(String name, String jobTitle, double salary) {
	        this.name = name;
	        this.jobTitle = jobTitle;
	        this.salary = salary;
	    }

	    // Method to get the employee's name
	    public String getName() {
	        return name;
	    }

	    // Method to get the employee's job title
	    public String getJobTitle() {
	        return jobTitle;
	    }

	    // Method to get the employee's salary
	    public double getSalary() {
	        return salary;
	    }

	    // Method to calculate a salary increase (percentage increase)
	    public void increaseSalary(double percentage) {
	        if (percentage > 0) {
	            double increment = (percentage / 100) * salary;
	            salary += increment;
	            System.out.println(name + "'s salary has been increased by " + percentage + "% to: $" + salary);
	        } else {
	            System.out.println("Increase percentage must be positive.");
	        }
	    }


	    public void printEmployeeInfo() {
	    	System.out.println("Employee Name: " + name + ", Job Title: " + jobTitle + ", Monthly Salary: $" + salary);
	    }
}
