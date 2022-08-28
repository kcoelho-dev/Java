package HR.Employee;

/**
 * This class is a subclass of Employee and it's used to create a new
 * MensalSalaried Employee
 */
public class MensalSalaried extends Employee {
	private double mensalSalary;

	public MensalSalaried() {
		super("Creating new Mensal Salaried Employee");

		System.out.print("Mensal Salary: R$");
		setMensalSalary(Double.parseDouble(input.nextLine()));
		this.setSalary();
	}

	/**
	 * @return double
	 */
	public double getMensalSalary() {
		return mensalSalary;
	}

	/**
	 * @param mensalSalary
	 */
	public void setMensalSalary(double mensalSalary) {
		this.mensalSalary = mensalSalary;
	}

	public MensalSalaried(MensalSalaried ms) {
		super("Using MensalSalaried Copy Constructor");
		this.mensalSalary = ms.getMensalSalary();
	}

	/**
	 * @param rate
	 */
	@Override
	public void increaseSalary(double rate) {
		this.setSalary(getSalary() * (1 + (rate / 100)));
	}

	@Override
	public void setSalary() {
		super.setSalary(getMensalSalary());

	}

}
