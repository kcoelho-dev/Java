package HR.Employee.Info;

/**
 * This class used to create an address object implementing abstracts IAdress methods
 */
public class Adress implements IAdress {

	private String street;
	private String district;
	private int number;
	private String city;
	private String state;
	private String country;
	private String postalCode;

	// A constructor.
	public Adress(String name) {
		System.out.println("Creating " + name + "'s Address");

		System.out.print("Street: ");
		setStreet(input.nextLine());

		System.out.print("District: ");
		setDistrict(input.nextLine());

		System.out.print("House/Apartment Number: ");
		setNumber(Integer.parseInt(input.nextLine()));

		System.out.print("City: ");
		setCity(input.nextLine());

		System.out.print("State: ");
		setState(input.nextLine());

		System.out.print("Country: ");
		setCountry(input.nextLine());

		System.out.print("Postal Code: ");
		setPostalCode(input.nextLine());

	}

	// A copy constructor.
	public Adress(Adress a) {
		this.street = a.getStreet();
		this.number = a.getNumber();
		this.country = a.getCountry();
		this.state = a.getState();
		this.city = a.getCity();
		this.postalCode = a.getPostalCode();
	}

	/**
	 * This function returns the district of the address
	 * 
	 * @return The district
	 */
	@Override
	public String getDistrict() {
		return district;
	}

	/**
	 * Sets the district of the address.
	 * 
	 * @param district The district to search for.
	 */
	@Override
	public void setDistrict(String district) {
		this.district = district;
	}

	/**
	 * This function sets the street of the address
	 * 
	 * @param street The street name
	 */
	@Override
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * This function returns the street of the address
	 * 
	 * @return The street name
	 */
	@Override
	public String getStreet() {
		return this.street;
	}

	/**
	 * This function sets the number of the object to the number passed in.
	 * 
	 * @param number The number of the house/apartment.
	 */
	@Override
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * This function returns the number of the house/apartment
	 * 
	 * @return The number of the house/apartment.
	 */
	@Override
	public int getNumber() {
		return this.number;
	}

	/**
	 * This function sets the country of the address
	 * 
	 * @param country The country to be set.
	 */
	@Override
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * This function returns the country of the current object
	 * 
	 * @return The country
	 */
	@Override
	public String getCountry() {
		return this.country;
	}

	/**
	 * This function sets the postal code of the address
	 * 
	 * @param postalCode The postal code of the address.
	 */
	@Override
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * This function returns the postal code of the address
	 * 
	 * @return The postal code of the address.
	 */
	@Override
	public String getPostalCode() {
		return this.postalCode;
	}

	/**
	 * This function sets the city of the address
	 * 
	 * @param city The city.
	 */
	@Override
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * This function returns the city of the address
	 * 
	 * @return The city
	 */
	@Override
	public String getCity() {
		return this.city;
	}

	/**
	 * This function sets the state of the object
	 * 
	 * @param state The state of the current user.
	 */
	@Override
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * This function returns the state of the object
	 * 
	 * @return The state of the object.
	 */
	@Override
	public String getState() {
		return this.state;
	}

	/**
	 * This function prints the address of the person
	 */
	@Override
	public void printAdress() {
		System.out.println("Street: " + getStreet());
		System.out.println("District: " + getDistrict());
		System.out.println("House/Apartment Number: " + getNumber());
		System.out.println("City: " + getCity());
		System.out.println("State: " + getState());
		System.out.println("Country: " + getCountry());
		System.out.println("Postal Code: " + getPostalCode());
	}

}
