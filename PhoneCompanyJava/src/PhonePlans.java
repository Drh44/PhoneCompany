/**
 * program to hold information about phones and phone plans 
 * @author Dylan Hesser
 *
 */
public class PhonePlans 
{
	/**
	 * variable to hold which package is used
	 */
	private String monthlyTalkPackages;
	/**
	 * cost of package used
	 */
	private	double monthlyTalkPackagesCost;
	
	/**
	 * cell phone to use
	 */
	private String cellPhones;
	/**
	 * cell phone cost
	 */
	private double cellPhonesCost;
	
	/**
	 * monthly data to use
	 */
	private String monthlyData;
	/**
	 * cost of data to use
	 */
	private double monthlyDataCost;
	
	/**
	 * shipping cost variable to use
	 */
	private double shippingCost;
	/**
	 * shipping if zip code is in a certain area
	 */
	private static double FREE_SHIPPING = 0;
	/**
	 * shipping to main land United States
	 */
	private static double CONTINENTAL_SHIPPING = 5.00;
	/**
	 * shipping if zipcode is in two state not connected to United States
	 */
	private static double THOSE_OTHER_TWO_STATES = 10.00;
	/**
	 * default constructor
	 */
	public PhonePlans () 
	{
	this.monthlyTalkPackagesCost = 0;
	this.cellPhonesCost = 0;
	this.monthlyDataCost = 0;
	this.shippingCost = 0;
	this.cellPhones = null;
	this.monthlyData = null;
	this.monthlyTalkPackages = null;
	}
	/**
	 * custom constructor to take custom input
	 * @param monthlyTalkPackages talk package to use
	 * @param monthlyTalkPackagesCost cost of talk package
	 * @param cellPhones cell phone to use
	 * @param cellPhonesCost cell phone cost
	 * @param monthlyData data plan to use
	 * @param monthlyDataCost cost of data plan
	 * @param shippingCost cost of shipping to use
	 */
	public PhonePlans (String monthlyTalkPackages,double monthlyTalkPackagesCost,String cellPhones, double cellPhonesCost,String monthlyData, double monthlyDataCost, double shippingCost) 
		{
		this.monthlyTalkPackages = monthlyTalkPackages;
		this.cellPhones = cellPhones;
		this.monthlyData = monthlyData;
		this.shippingCost = shippingCost;
		this.monthlyTalkPackagesCost = monthlyTalkPackagesCost;
		this.cellPhonesCost = cellPhonesCost;
		this.monthlyDataCost = monthlyDataCost;
		}
	/**
	 * gets the monthly talk package
	 * @return talk package 
	 */
	public String getMonthlyTalkPackage() 
	{
		return monthlyTalkPackages;
	}
	/**
	 * gets cost of monthly talk package
	 * @return cost of monthly talk package
	 */
	public double getMonthlyTalkPackageCost() 
	{
		return monthlyTalkPackagesCost;
	}
	/**
	 * gets cell phone 
	 * @return cell phone
	 */
	public String getCellPhones() 	
	{
		return cellPhones;
	}
	/**
	 * gets cost of phone
	 * @return cost of phone
	 */
	public double getCellPhonesCost() 
	{
		return cellPhonesCost;
	}
	/**
	 * gets data plan 
	 * @return monthly data plan
	 */
	public String getMonthlyData() 
	{
		return monthlyData;
	}
	/**
	 * gets cost of monthly data plan
	 * @return cost of monthly data plan
	 */
	public double getMonthlyDataCost()
	{
		return monthlyDataCost;
	}
	/**
	 * gets cost of shipping
	 * @return shipping cost
	 */
	public double getShippingCost() 
	{
		return shippingCost;
	}
	/**
	 * sets the monthly talk package and cost to user selected
	 * @param talkPackage plan chosen
	 * @param talkPackageCost cost of package chosen
	 */
	public void setMonthlyTalkPackage( double talkPackageCost, String talkPackage) 
	{
		if ((talkPackageCost == 29.99)) 
		{
			this.monthlyTalkPackagesCost =talkPackageCost;
			this.monthlyTalkPackages = talkPackage;
		}
		else if (talkPackageCost == 49.99) 
		{
			this.monthlyTalkPackagesCost = talkPackageCost;
			this.monthlyTalkPackages = talkPackage;
		}
		else if (talkPackageCost == 69.99) 
		{
			this.monthlyTalkPackagesCost = talkPackageCost;
			this.monthlyTalkPackages = talkPackage;
		}
	}
	/**
	 * sets cell phone chosen and cost of it
	 * @param cellPhoneCost cost chosen
	 * @param cellPhone cell phone chosen
	 */
	public void setCellPhone(double cellPhoneCost, String cellPhone) 
	{
		if(  cellPhoneCost == 39.95) 
		{
			this.cellPhonesCost = cellPhoneCost;
			this.cellPhones = cellPhone;
		}
		else if ( cellPhoneCost == 49.99) 
		{
			this.cellPhonesCost = cellPhoneCost;
			this.cellPhones = cellPhone;
		}
		else if ( cellPhoneCost == 59.99) 
		{
			this.cellPhonesCost = cellPhoneCost;
			this.cellPhones = cellPhone;
		}
	}
	/**
	 * sets monthly data plan chosen and cost
	 * @param monthlyDataCost cost of plan chosen
	 * @param monthlyData data choice
	 */
	public void setMonthlyData(double monthlyDataCost, String monthlyData) 
	{
		if ( monthlyDataCost == 19.99) 
		{
			this.monthlyDataCost = monthlyDataCost;
			this.monthlyData = monthlyData;
		}
		else if ( monthlyDataCost == 49.99) 
		{
			this.monthlyDataCost = monthlyDataCost;
			this.monthlyData = monthlyData;
		}
		else if ( monthlyDataCost == 69.99) 
		{
			this.monthlyDataCost = monthlyDataCost;
			this.monthlyData = monthlyData;
		}
	}
	/**
	 * sets shipping cost
	 * @param zip  zip code of customer
	 */
	public void setShippingCost(String zip) 
	{
		if ((Double.parseDouble(zip) >= 32500 ) && (Double.parseDouble(zip)<= 32599) ) 
		{
			this.shippingCost =  FREE_SHIPPING;
		}
		else if (((Double.parseDouble(zip) >= 99500 ) && (Double.parseDouble(zip)<= 99999)) || (Double.parseDouble(zip) >= 96700 ) && (Double.parseDouble(zip)<= 96899)  )
		{
			this.shippingCost = THOSE_OTHER_TWO_STATES;
		}
		else 
		{
			this.shippingCost = CONTINENTAL_SHIPPING;
		}
	}
	/**
	 * calculates the start up cost including the four different things that add to the price
	 * @param monthlyTalkPackages monthly minutes chosen
	 * @param cellphonesCost cell phone chosen
	 * @param monthlyDataCost data plan chosen
	 * @param shippingCost shipping cost included
	 * @return the start up cost
	 */
	public double calculateStartupCost (double monthlyTalkPackages, double cellphonesCost , double monthlyDataCost, double shippingCost ) 
	{
		double startUpCost = 0;
		startUpCost = monthlyTalkPackages + cellphonesCost + monthlyDataCost + shippingCost;
		return startUpCost;
	}
	/**
	 * calculates the monthly cost
	 * @param monthlyTalkPackages the minutes cost per month
	 * @param monthlyDataCost data cost per month
	 * @return the monthly cost
	 */
	public double calculateMonthlyCost(double monthlyTalkPackages, double monthlyDataCost)
	{
		double monthlyCost;
		monthlyCost = monthlyTalkPackages + monthlyDataCost;
		return monthlyCost;
	}
}
