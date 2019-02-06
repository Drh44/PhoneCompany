import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.regex.*;

public class PhonesPlansTester 
{
	public static void main(String[] args) throws IOException 
	{
		//variables to put information from file into
		String monthlyTalkPackages = null;
		double monthlyTalkPackagesCost = 0;
		String thousandMinutePlan;
		String thousandMinutePlanCost;
		String fiveThousandMinutePlanCost;
		String fiveThousandMinutePlan;
		String unlimitedPlan;
		String unlimitedPlanCost;
		String cellphone = null;
		double cellphoneCost = 0;
		String model100;
		String model200;
		String model300;
		String model100Cost;
		String model200Cost;
		String model300Cost;
		String dataPlans = null;
		double dataPlansCost = 0;
		String threeGBPlan;
		String threeGBPlanCost;
		String sixGBPlan;
		String sixGBPlanCost;
		String unlimitedData;
		String unlimitedDataCost;
		double shippingCost = 0;
		String name = null;
		String zip = null;
		String city = null;
		String street = null;
		String state = null;
		String phoneNumber = null;
		String regex;
		int customerID = 0;
		Customer newCustomer = new Customer(name, street, city, state , zip, phoneNumber );
		
		BufferedReader inputStream = 
	               new BufferedReader(new FileReader(args[0]));
		File file = new File("CustomerOutput.txt");
		RandomAccessFile raf = new RandomAccessFile(file,"rw");
		FileWriter writer = new FileWriter(file);
		Scanner keyboard = new Scanner(System.in);
		
		// array to get the information from the file and split into the different variables
		String line = inputStream.readLine();
		String [] lineArray = line.split(",");
		thousandMinutePlan = lineArray[0];
		thousandMinutePlanCost = lineArray[1];
		fiveThousandMinutePlan = lineArray[2];
		fiveThousandMinutePlanCost = lineArray[3];
		unlimitedPlan = lineArray[4];
		unlimitedPlanCost = lineArray[5];
		line = inputStream.readLine();
		
		String [] lineArray1 = line.split(",");
		model100 = lineArray1[0];
		model100Cost = lineArray1[1];
		model200 = lineArray1[2];
		model200Cost = lineArray1[3];
		model300 = lineArray1[4];
		model300Cost = lineArray1[5];
	
		line = inputStream.readLine();
		String[] lineArray2 = line.split(",");
		threeGBPlan = lineArray2[0];
		threeGBPlanCost = lineArray2[1];
		sixGBPlan = lineArray2[2];
		sixGBPlanCost = lineArray2[3];
		unlimitedData = lineArray2[4];
		unlimitedDataCost = lineArray2[5];
		
		
		System.out.println("Hello, welcome to the phone transaction portal. We will go through and help you in getting the perfect phone plan together");
		PhonePlans phonePlan = new PhonePlans (monthlyTalkPackages, monthlyTalkPackagesCost, cellphone,  cellphoneCost, dataPlans,  dataPlansCost, shippingCost);
		//switch statement that responds to user input to display different options
		int menuItem;
		do
		{
			menuItem = 0;
			System.out.println("Please select one of the following options");
			System.out.println("1.Select a Talk Package \n2.Select a phone\n3.Select a dataPlan\n4.Enter user Information and Calculate shipping \n5.See Starting Cost and Monthly Cost\n6.Search transaction file\n7.Quit");
			menuItem = Integer.parseInt(keyboard.nextLine());
			 
			switch (menuItem)
			{
			case 1:
				int planChoice;
				System.out.print("Here are the three plans available\n1.Thousand Minutes per month\n2.Five Thousand Minutes per month\n3.Unlimited per month\n");
				System.out.print("Please select one of the three choices");
				planChoice = Integer.parseInt(keyboard.nextLine());
				//sets monthly plan based on input
				if (planChoice == 1) 
				{
					monthlyTalkPackages = thousandMinutePlan;
					monthlyTalkPackagesCost = Double.parseDouble(thousandMinutePlanCost);
					phonePlan.setMonthlyTalkPackage(monthlyTalkPackagesCost, monthlyTalkPackages);
				}
				
				else if (planChoice == 2) 
				{
					monthlyTalkPackages = fiveThousandMinutePlan;
					monthlyTalkPackagesCost = Double.parseDouble(fiveThousandMinutePlanCost);
					phonePlan.setMonthlyTalkPackage(monthlyTalkPackagesCost, monthlyTalkPackages);
				}
				else if (planChoice == 3) 
				{
					monthlyTalkPackages = unlimitedPlan;
					monthlyTalkPackagesCost = Double.parseDouble(unlimitedPlanCost);
					phonePlan.setMonthlyTalkPackage(monthlyTalkPackagesCost, monthlyTalkPackages);
				}
				
				System.out.println("Here is the plan you chose: " + phonePlan.getMonthlyTalkPackage() + " and the price of the plan: " + phonePlan.getMonthlyTalkPackageCost() );
				break;
				
			case 2: 
				int phoneChoice;
				System.out.print("Here are the three phones available\n1.Model 100\n2.Model 200\n3.Model 300\n");
				System.out.println("Please select one of the three phones");
				phoneChoice = Integer.parseInt(keyboard.nextLine());
				//sets phone choice based on user input
				if (phoneChoice == 1)
				{
					cellphone = model100;
					cellphoneCost = Double.parseDouble(model100Cost);
					phonePlan.setCellPhone(cellphoneCost, cellphone);
				}
				else if ( phoneChoice == 2)
				{
					cellphone = model200;
					cellphoneCost = Double.parseDouble(model200Cost);
					phonePlan.setCellPhone(cellphoneCost, cellphone);
				}
				else if ( phoneChoice == 3) 
				{
					cellphone = model300;
					cellphoneCost = Double.parseDouble(model300Cost);
					phonePlan.setCellPhone(cellphoneCost, cellphone);
				}
				
				System.out.println("Here is the phone you chose: " + phonePlan.getCellPhones() + " and the price of the phone: " + phonePlan.getCellPhonesCost());
				break;
				
			case 3:
				int dataChoice;
				System.out.print("Here are the three data plans available\n1.3 GB\n2.6 GB\n3.Unlimited Data\n");
				System.out.println("Please select one of the three data plans");
				dataChoice = Integer.parseInt(keyboard.nextLine());
				//sets the monthly data based on user input
				if (dataChoice == 1) 
				{
					dataPlans = threeGBPlan;
					dataPlansCost = Double.parseDouble(threeGBPlanCost);
					phonePlan.setMonthlyData(dataPlansCost, dataPlans);
				}
				else if (dataChoice == 2) 
				{
					dataPlans = sixGBPlan;
					dataPlansCost = Double.parseDouble(sixGBPlanCost);
					phonePlan.setMonthlyData(dataPlansCost, dataPlans);
				}
				else if ( dataChoice == 3)
				{
					dataPlans = unlimitedData;
					dataPlansCost = Double.parseDouble(unlimitedDataCost);
					phonePlan.setMonthlyData(dataPlansCost, dataPlans);
				}
				System.out.println("Here is the data plan you chose: " + phonePlan.getMonthlyData() + " and the price of the data per month: " + phonePlan.getMonthlyDataCost());
				break;
				
			case 4:
				newCustomer.setIDNum(customerID);
				customerID++;
				System.out.println("Please enter your name ");
				name = keyboard.nextLine();
				newCustomer.setName(name);
				System.out.println("Please enter your street");
				street = keyboard.nextLine();
				newCustomer.setStreet(street);
				System.out.println("Please enter your city");
				city = keyboard.nextLine();
				newCustomer.setCity(city);
				System.out.println("Please enter your state");
				state = keyboard.nextLine();
				newCustomer.setState(state);
				boolean correctFormat = false;
				do 
				{
					System.out.println("Please enter your zip code");
					zip = keyboard.nextLine();
					regex = "[0-9]{5}";
				
					try 
					{
						if (Pattern.matches(regex, zip) == true) 
							{
								newCustomer.setZip(zip);
								newCustomer.setAddress(street, city, state, zip);
								System.out.println("The address you entered is " + newCustomer.getAddress());
								phonePlan.setShippingCost(zip);
								correctFormat = true;
							}
						else 
							{
								throw new IncorrectFormat(zip);
							}
					}
				catch(IncorrectFormat e)
					{
						System.out.println(e);
						System.out.println("Please try entering user information again with a correct zip code");
					}
				}
				while(correctFormat != true);
				correctFormat = false;
				 do 
				 	{
					 	System.out.println("Please insert phone number in form (xxx)xxx-xxxx");
					 	phoneNumber = keyboard.nextLine();
					 	regex ="((\\(\\d{3}\\) ?)|(\\d{3}-))?\\d{3}-\\d{4}";
					 	try 
					 	{
					 		if (Pattern.matches(regex, phoneNumber))
					 		{
					 			newCustomer.setPhoneNumber(phoneNumber);
					 			System.out.println("You entered your phone number as: " + newCustomer.getPhoneNumber());
					 			correctFormat = true;
					 		}
					 		else 
					 		{
					 			throw new IncorrectFormat(phoneNumber);	
					 		}
					 	}
					 	catch(IncorrectFormat e) 
					 	{
					 		System.out.println(e);
					 		System.out.println("Phone number not in correct format, please reenter user information");
					 	}
				 	}
				 while (correctFormat != true);
				 System.out.println("Your shipping cost is " + phonePlan.getShippingCost());
				 break;
			case 5: 
				
				String startUpCost = " start up cost:  " + phonePlan.calculateStartupCost(phonePlan.getMonthlyTalkPackageCost(), phonePlan.getCellPhonesCost(), phonePlan.getMonthlyDataCost(), phonePlan.getShippingCost());
				String monthlyCost = " monthly cost:  " + phonePlan.calculateMonthlyCost(phonePlan.getMonthlyTalkPackageCost(),phonePlan.getMonthlyDataCost()) + "\n";
				String transactionInformation =  newCustomer.getName() + startUpCost + monthlyCost;
				System.out.println(transactionInformation);
				System.out.println("The customer ID is " + customerID);
				writer.write(customerID + " " + transactionInformation);
				writer.flush();
				
				break;
				
			case 6:
				System.out.println("Which customer would you like to see transaction information for? Please use customer ID");
				int customerChoice;
				customerChoice = Integer.parseInt(keyboard.nextLine());
				raf.seek(0);
				String b = null;
				
				while (( b = raf.readLine()) != null)
				{
					if (Character.getNumericValue(b.charAt(0)) == customerChoice) 
					{
						System.out.println(b);	
					}
				}
				b = null;
				break;
			case 7:
				System.out.println("You chose to quit the program, have a good day!");
			}
		}
		while (menuItem != 7);
	}
}
