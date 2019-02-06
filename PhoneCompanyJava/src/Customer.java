
/**
 * 
 * @author Dylan Hesser
 *Program that will keep information of customers for the phone plan program
 */
public class Customer 
{
	/**
	 * String name - name to be used
	 */
	private String name;
	/**
	 * String street - street to be used
	 */
	private String street;
	/**
	 * String city - city name to be used
	 */
	private String city;
	/**
	 * String State - state of the customer
	 */
	private String state;
	/**
	 * String zip - zip of the customer
	 */
	private String zip;
	/**
	 * String phoneNumber - phone number of the customer
	 */
	private String phoneNumber;
	/**
	 * int customerIDNumber - id of the customer 
	 */
	private int customerIDNumber;
	/**
	 * String address - address of the customer
	 */
	private String address;
	/**
	 * default Constructor
	 */
	public Customer() 
	{
		this.name = null;
		this.street = null;
		this.city = null;
		this.state = null;
		this.zip = null;
		this.phoneNumber = null;
		this.customerIDNumber = 0;
	}
	/**
	 * custom constructor to take custom input
	 * @param name name to be used
	 * @param street street to be used
	 * @param city city to be used
	 * @param state state to be used
	 * @param zip zip to be used
	 * @param phoneNumber phone number to be used
	 */
	public Customer (String name, String street, String city, String state, String zip, String phoneNumber) 
	{
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
	}
	/**
	 * gets the name of the customer
	 * @return name of customer
	 */
	public String getName() 
	{
		return name;
	}
	/**
	 * gets the address of the customer
	 * @return address of customer
	 */
	public String getAddress() 
	{
		return address;
	}
	/**
	 * gets the phone number of the customer
	 * @return phone number of customer
	 */
	public String getPhoneNumber() 
	{
		return phoneNumber;
	}
	/**
	 * gets the street of the customer
	 * @return street of customer
	 */
	public String getStreet()
	{
		return street;
	}
	/**
	 * gets the city of the customer
	 * @return city of the customer
	 */
	public String getCity() 
	{
		return city;
	}
	/**
	 * gets the state of the customer
	 * @return state of customer
	 */
	public String getState() 
	{
		return state;
	}
	/**
	 * gets the zip code of the customer
	 * @return zip of customer
	 */
	public String getZip() 	
	{
		return zip;
	}
	/**
	 * gets the customer id
	 * @return id of the customer
	 */
	public int getCustomerID() 
	{
		return customerIDNumber;
	}
	/**
	 * sets the name of the customer
	 * @param name name to be used
	 */
	public void setName(String name) 
	{
		this.name = name;
	}
	/**
	 * sets the street of the customer
	 * @param street street to be used
	 */
	public void setStreet(String street) 
	{
		this.street = street;
	}
	/**
	 * sets the city of the customer
	 * @param city city to be used
	 */
	public void setCity(String city) 
	{
		this.city = city;
	}
	/**
	 * sets the state of the customer
	 * @param state state to be used
	 */
	public void setState(String state) 
	{
		this.state = state;
	}
	/**
	 * sets the zip code of the customer
	 * @param zip zip code to be used
	 */
	public void setZip (String zip) 
	{
		this.zip = zip;
	}
	/**
	 * sets the ID of the customer
	 * @param customerID The id to be used
	 */
	public void setIDNum(int customerID)
	{
		this.customerIDNumber = customerID ;
	}
	/**
	 * sets the phone number of the customer
	 * @param phoneNumber phone number to be used
	 */
	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}
	/**
	 * sets the address of the customer using location information
	 * @param street street of customer
	 * @param city city of customer
	 * @param state state of customer
	 * @param zip zip of customer
	 */
public void setAddress(String street, String city, String state, String zip) 
	{
		this.address = getStreet() + " " + getCity() + " " + getState() + " " + getZip();
	}
}
