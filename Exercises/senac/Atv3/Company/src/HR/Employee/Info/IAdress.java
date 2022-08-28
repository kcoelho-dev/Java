package HR.Employee.Info;

import java.util.Scanner;

// A interface to Adresses.
public interface IAdress {
	// A static variable that is used to read input from the user.
	static Scanner input = new Scanner(System.in);

	/**
	 * This function sets the street of the address.
	 * 
	 * @param street The street name
	 */
	public void setStreet(String street);

	/**
	 * Get the street.
	 * 
	 * @return The street name.
	 */
	public String getStreet();

	/**
	 * This function sets the number of the object to the number passed in.
	 * 
	 * @param number The number of the house/apartment.
	 */
	public void setNumber(int number);

	/**
	 * This function returns an integer.
	 * 
	 * @return The number of the house/apartment.
	 */
	public int getNumber();

	/**
	 * Sets the district of the address
	 * 
	 * @param district The district to search for.
	 */
	public void setDistrict(String district);

	/**
	 * Returns the district of the address
	 * 
	 * @return The district of the adress.
	 */
	public String getDistrict();

	/**
	 * Sets the country of the employee
	 * 
	 * @param country The country to get that employee lives.
	 */
	public void setCountry(String country);

	/**
	 * Returns the country of the user.
	 * 
	 * @return The country of the address.
	 */
	public String getCountry();

	/**
	 * Sets the postal code of the address
	 * 
	 * @param postalCode The postal code of the address.
	 */
	public void setPostalCode(String postalCode);

	/**
	 * Returns the postal code of the address.
	 * 
	 * @return The postal code of the address.
	 */
	public String getPostalCode();

	/**
	 * Sets the city of the address.
	 * 
	 * @param city The city to search for.
	 */
	public void setCity(String city);

	/**
	 * Returns the city of the address.
	 * 
	 * @return The city of the address.
	 */
	public String getCity();

	/**
	 * Sets the state of the object to the given state.
	 * 
	 * @param state The state of the button.
	 */
	public void setState(String state);

	/**
	 * It returns the state of the object.
	 * 
	 * @return The state of the object.
	 */
	public String getState();

	/**
	 * PrintAdress prints the address of the object.
	 */
	public void printAdress();
}
