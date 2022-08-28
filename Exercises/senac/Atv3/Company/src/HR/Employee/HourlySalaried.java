package HR.Employee;

/**
 * This class is a subclass of the Employee class, and it's used to create a new Hourly Salaried
 * Employee
 */
public class HourlySalaried extends Employee {
	private int workedHours;
	private double hourOfWorkValue;

	// It's the constructor of the HourlySalaried class. It's used to create a new HourlySalaried object.
	public HourlySalaried() {
		super("Creating new Hourly Salaried Employee");
		
		System.out.print("Worked Hours: ");
		setWorkedHours(Integer.parseInt(input.nextLine()));

		System.out.print("Value of a Worked Hour: R$");
		setHourOfWorkValue(Double.parseDouble(input.nextLine()));
		this.setSalary();
	}

	

	/**
	 * This function returns the number of hours worked by the employee
	 * 
	 * @return The workedHours variable is being returned.
	 */
	public int getWorkedHours() {
		return workedHours;
	}

	
	
	/**
	 * This function sets the workedHours variable to the value of the workedHours parameter
	 * 
	 * @param workedHours The number of hours the employee worked.
	 */
	public void setWorkedHours(int workedHours) {
		this.workedHours = workedHours;
	}

	
	
	/**
	 * This function returns the value of the hour of work
	 * 
	 * @return The value of the hourOfWorkValue variable.
	 */
	public double getHourOfWorkValue() {
		return hourOfWorkValue;
	}

	
	
	/**
	 * This function sets the value of the hourOfWorkValue variable
	 * 
	 * @param hourOfWorkValue The value of the hour of work.
	 */
	public void setHourOfWorkValue(double hourOfWorkValue) {
		this.hourOfWorkValue = hourOfWorkValue;
	}

	
	/**
	 * The function increases the salary of the employee by a given rate
	 * 
	 * @param rate the percentage of the increase
	 */
	@Override
	public void increaseSalary(double rate) {
		this.setSalary(getSalary() * (1 + (rate / 100)) );
	}

	/**
	 * The function sets the salary of the employee by multiplying the hourly rate of the employee by the
	 * number of hours worked
	 */
	@Override
	public void setSalary() {
		super.setSalary(getHourOfWorkValue() * getWorkedHours());		
	}

}
