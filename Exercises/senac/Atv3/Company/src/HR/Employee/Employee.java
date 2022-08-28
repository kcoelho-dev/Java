package HR.Employee;

import java.util.ArrayList;
import java.util.Scanner;

import HR.Employee.Info.Adress;


/**
 * It's an abstract class that stores the basic information of an employee, and it has a static int to
 * count the quantity of employees stored
 */
public abstract class Employee {
    static Scanner input = new Scanner(System.in);

    private static int countEmployees; /* < Static int to count the quantity of employees stored */

    private String name; /* <Name of Employee */
    private String cpf; /* <Brazilian individual taxpayer registry identification */
    private String phone; /* <Mobile phone number of Employee */
    private String sector; /* <The sector that the Employee works for */
    private double salary; /* < The salary of the Employee */
    private Adress adress; /* <Adress object to store the Employee's adress */

    // A constructor
    public Employee(String text) {
        System.out.println(text);
        System.out.println("Registering Employee Informations");

        System.out.print("Name: ");
        setName(input.nextLine());

        System.out.print("Cpf: ");
        setCpf(input.nextLine());

        System.out.print("Phone: ");
        setPhone(input.nextLine());

        System.out.print("Sector: ");
        setSector(input.nextLine());

        this.adress = new Adress(getName());

        countEmployees++;
    }

    /**
     * Parametrized Constructor of class Employee, that receives the following
     * parameters
     * 
     * @param name
     * @param cpf
     * @param phone
     * @param sector
     * @param salary
     * @param adress
     */
    public Employee(String name, String cpf, String phone, String sector, double salary, Adress adress) {
        this.name = name;
        this.cpf = cpf;
        this.phone = phone;
        this.sector = sector;
        this.salary = salary;
        this.adress = new Adress(adress);
        countEmployees++; /* <Increment of countEmployees */
    }

    /**
     * It returns the name of the object.
     * 
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * This function sets the name of the object to the name passed in as a
     * parameter
     * 
     * @param name The name of the parameter.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * It returns the cpf of the object.
     * 
     * @return The cpf variable is being returned.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * This function sets the value of the variable cpf to the value of the
     * parameter cpf
     * 
     * @param cpf The CPF number, which is a String.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * This function returns the phone number of the person
     * 
     * @return The phone number of the person.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This function sets the phone number of the user
     * 
     * @param phone The phone number to send the message to.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This function returns the sector of the company
     * 
     * @return The sector of the company.
     */
    public String getSector() {
        return sector;
    }

    /**
     * This function sets the sector of the company.
     * 
     * @param sector The sector of the company
     */
    public void setSector(String sector) {
        this.sector = sector;
    }

    /**
     * This function returns the salary of the employee
     * 
     * @return The salary of the employee.
     */
    public double getSalary() {
        return salary;
    }

    /**
     * The setSalary() function is an abstract function that is defined in the
     * Employee class, but
     * implemented in the MensalSalaried and HourlySalaried classes.
     */
    public abstract void setSalary();

    /**
     * It sets the salary of the employee.
     * 
     * @param salary The salary of the employee.
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * This function returns the adress of the employee
     * 
     * @return The adress object.
     */
    public Adress getAdress() {
        return adress;
    }

    /**
     * This function takes an Adress object as a parameter and sets the adress field
     * of the object to a new
     * Adress object that is a copy of the parameter.
     * 
     * @param adress Adress
     */
    public void setAdress(Adress adress) {
        this.adress = new Adress(adress);
    }

    /**
     * It returns the number of employees.
     * 
     * @return The countEmployees variable is being returned.
     */
    public static int getCountEmployees() {
        return countEmployees;
    }

    /**
     * Increase the salary of the employee by the given rate.
     * 
     * @param rate The percentage by which the salary is increased.
     */
    public abstract void increaseSalary(double rate);

    /**
     * This function takes an ArrayList of Employee objects and a double as
     * parameters and increases the
     * salary of each Employee object in the ArrayList by the given rate
     * 
     * @param e    an ArrayList of Employee objects
     * @param rate the percentage of the increase
     */
    public static void globalIncreaseSalary(ArrayList<Employee> e, double rate) {
        for (Employee employee : e) {
            employee.increaseSalary(rate);
        }
    }

    /**
     * It prints the information of all the employees in the ArrayList
     * 
     * @param e ArrayList of Employee
     */
    public static void printEmployeesInfo(ArrayList<Employee> e) {
        System.out.println("Printing Employees Informations\n");

        for (Employee employee : e) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Cpf: " + employee.getCpf());
            System.out.println("Phone: " + employee.getPhone());
            System.out.println("Sector: " + employee.getSector());
            System.out.println("Salary: " + employee.getSalary());
            employee.getAdress().printAdress();
            System.out.println();

        }

        System.out.println("Total Listed Employees: " + Employee.getCountEmployees());
        System.out.println();
    }

    /**
     * This function prints the basic information (Name and Salary) of all the
     * employees in the array list
     * 
     * @param e ArrayList of Employee objects
     */
    public static void printEmployeeBasicInfo(ArrayList<Employee> e) {
        System.out.println("Printing Employees Basic Informations\n");

        for (Employee employee : e) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println();
        }
        System.out.println();
    }
}
