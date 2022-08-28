import java.util.ArrayList;
import java.util.Scanner;

import HR.Employee.*;

/**
 * @author Kelvin Coelho
 * @date 2022/08/22
 */
public class App {
	// It's a constant that defines the maximum number of inputs that the user can do.
	static Scanner input = new Scanner(System.in);
	// It's a constant that defines the maximum number of inputs that the user can
	// do.
	static final int MAX_INPUTS = 10;

	/**
	 * It's a function that asks the user to choose a type of employee to register,
	 * and returns the option
	 * chosen
	 * 
	 * @return The option that the user has chosen.
	 */
	public static int optionsMenu() {
		int option;
		while (true) {

			System.out.println("Choose a type of Employee to register:");
			System.out.print("\n1 - Mensal Salaried Employee");
			System.out.print("\n2 - Hourly Salaried Employee");
			System.out.print("\n3 - Stop Input\n==> ");
			option = Integer.parseInt(input.nextLine());

			if (option >= 1 && option <= 3)
				break;
		}
		return option;
	}

	public static void main(String[] args) {
		// It's creating an ArrayList of type Employee.
		ArrayList<Employee> employees = new ArrayList<Employee>();

		for (int i = 0; i < MAX_INPUTS; i++) {
			int option = optionsMenu();

			switch (option) {
				case 1:
					employees.add(new MensalSalaried());
					break;
				case 2:
					employees.add(new HourlySalaried());
					break;
				case 3:
					break;
			}
			if (option == 3)
				break;
		}

		// It's calling the static method printEmployeesInfo from the class Employee.
		Employee.printEmployeesInfo(employees);

		// It's calling the static method globalIncreaseSalary from the class Employee.
		Employee.globalIncreaseSalary(employees, 10);

		// It's calling the static method printEmployeeBasicInfo from the class
		// Employee.
		Employee.printEmployeeBasicInfo(employees);

	}
}
