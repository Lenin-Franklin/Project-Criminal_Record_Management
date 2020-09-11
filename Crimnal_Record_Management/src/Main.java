import java.util.*;

public class Main {

	public static void main(String[] args) 
	{
		Home obj = new Home();
		System.out.println("CRIMINAL RECORD MANAGEMENT");
		System.out.println("--------------------------\n\n");
		obj.Intro();
		}

	
	public void Choice()
	{
		System.out.println("\nSelect City:");
		System.out.println("\t1)Metropolitan Cities \n \t2)State Capitals \n\t3)Other Major Cities\n");
		System.out.println("\t-->Enter Your Choice");
		Scanner obj = new Scanner (System.in);
		int choice = obj.nextInt();
		switch(choice)
		{
		case 1: new Main().city_Metro();break;
		case 2: new Main().city_Capital();break;
		case 3: new Main().city_Other();break;
		default: System.out.println("Invalid Input!!");
		}
		
	}
	
	public void city_Metro()
	{
		System.out.println("Here is a list of Metropolitan Cities::");
		String[] city = {"Bangalore(Karnataka)","Delhi","Mumbai(Maharastra)","Chennai(Tamil Nadu)","Kolkata(Westy Bengal)","Hyderabad(Telengana)","Ahmedabad(Gujarat)","Pune(Maharastra)","Amaravati(Andhra Pradesh)","Visakhapatnam(Andhra Pradesh)","Surat(Gujarat)","Jaipur(Rajasthan)","Nagpur(Maharastra)"};
		int count=1;
		for(String var : city) 
		{
			System.out.println("\t--> ("+count+") "+var);
			count++;
			}
		Scanner obj = new Scanner (System.in);
		System.out.println("\nIf the city you are searching is here\n\tEnter the respective number \n\tELSE enter any other number to go to previous menu");
		int choice = obj.nextInt();
		
		switch(choice)
		{
		case 1: System.out.println("Selected City::Bangalore::Contact:080 **** ****");break;
		case 2: System.out.println("Selected City::Delhi::Contact:011 **** ****");break;
		case 3: System.out.println("Selected City::Mumbai::Contact:022 **** ****");break;
		case 4: System.out.println("Selected City::Chennai::Contact:044 **** ****");break;
		case 5: System.out.println("Selected City::Kolkata::Contact:033 **** ****");break;
		case 6: System.out.println("Selected City::Hyderabad::Contact:040 **** ****");break;
		case 7: System.out.println("Selected City::Ahmedabad::Contact:079 **** ****");break;
		case 8: System.out.println("Selected City::Pune::Contact:020 **** ****");break;
		case 9: System.out.println("Selected City::Amaravathi::Contact:**** ****");break;
		case 10: System.out.println("Selected City::Vishakapatnam::Contact:**** ****");break;
		case 11: System.out.println("Selected City::Surat::Contact:**** ****");break;
		case 12: System.out.println("Selected City::Jaipur::Contact:**** ****");break;
		case 13: System.out.println("Selected City::Nagpur::Contact:**** ****");break;
		default: Choice();
		}
		new Main().Service_Select();
	}
	
	public void city_Capital()
	{
		System.out.println("Here is a list Of Capital Cities::");
		String city[] = {"Itanagar(Arunachal Pradesh)","Dispur(Assam)","Patna(Bihar)","Raipur(Chhattisgarh)","Panaji(Goa)","Gandhinagar(Gujarat)","Chandigarh(Haryana)","Shimla(Himachal Pradesh)","Ranchi(Jharkhand)","Thiruvananthapuram(Kerala)","Bhopal(Madhya Pradesh)","Imphal(Manipur)","Shillong(Meghalaya)","Aizawl(Mizoram)","Kohima(Nagaland)","Bhubaneshwar(Odisha)","Chandigarh(Punjab)","Gangtok(Sikkim)","Agartala(Tripura)","Lucknow(Uttar Pradesh)","Uttarakhand(Dehradun)"};
		int count=1;
		for(String var : city) 
		{
			System.out.println("\t--> ("+count+") "+var);
			count++;
			}
		Scanner obj = new Scanner (System.in);
		int choice = obj.nextInt();
		switch(choice)
		{
		case 1: System.out.println("Selected City::Itanagar::Contact:360 **** ****");break;
		case 2: System.out.println("Selected City::Dispur::Contact:361**** ****");break;
		case 3: System.out.println("Selected City::Patna::Contact:612 **** ****");break;
		case 4: System.out.println("Selected City::Raipur::Contact:771 **** ****");break;
		case 5: System.out.println("Selected City::Panaji::Contact:832**** ****");break;
		case 6: System.out.println("Selected City::Gandhinagar::Contact:079**** ****");break;
		case 7: System.out.println("Selected City::Chandigarh::Contact:172 **** ****");break;
		case 8: System.out.println("Selected City::Shimla::Contact:177 **** ****");break;
		case 9: System.out.println("Selected City::Ranchi::Contact:651 **** ****");break;
		case 10: System.out.println("Selected City::Thiruvanthapuram::Contact:471 **** ****");break;
		case 11: System.out.println("Selected City::Bhopal::Contact:755 **** ****");break;
		case 12: System.out.println("Selected City::Imphal::Contact:385 **** ****");break;
		case 13: System.out.println("Selected City::Shillong::Contact:364**** ****");break;
		case 14: System.out.println("Selected City::Aizawl::Contact:389 **** ****");break;
		case 15: System.out.println("Selected City::Kohima::Contact:370 **** ****");break;
		case 16: System.out.println("Selected City::Bhubaneswar::Contact:674 **** ****");break;
		case 17: System.out.println("Selected City::Chandigarh::Contact:172 **** ****");break;
		case 18: System.out.println("Selected City::Gangtok::Contact:3592 **** ****");break;
		case 19: System.out.println("Selected City::Agartala::Contact:381 **** ****");break;
		case 20: System.out.println("Selected City::Lucknow::Contact:522 **** ****");break;
		case 21: System.out.println("Selected City::Dehradun::Contact:135 **** ****");break;
		default: Choice();
		}
		new Main().Service_Select();
		
	}
	
	public void city_Other()
	{
		System.out.println("For Other cities:: Contact Toll Free Number:: 18** *** ***");
		new Main().Service_Select();
		
	}
	
	public void Service_Select()
	{
		Scanner obj = new Scanner (System.in);
		System.out.println("\n\n::SERVICES PROVIDED::");
		System.out.println("-->[1]About");
		System.out.println("-->[2]Citizen Services");
		System.out.println("-->[3]Police Services");
		System.out.println("-->[4]Exit");
		System.out.println("\tEnter the number:");
		try {
			int choice = obj.nextInt();
			String[] args = null;
			if(choice == 1)
				new Home().About();
			else if (choice == 2)
				new Crime_Report_Navigate().main(args);
			else if (choice == 3)
				new Login_Navigate().main(args);
			else if(choice == 4)
				System.out.println("\nPROCESS TERMINATED!!");
		}
		catch(InputMismatchException e)
		{
			System.out.println("\tWRONG INPUT!!");
		}
		
	}
	

}
