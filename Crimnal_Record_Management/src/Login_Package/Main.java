package Login_Package;

import java.io.FileNotFoundException;
import java.util.*;
import Criminal_Data_Entry.Get_Information;
import Criminal_Data.Police_Service;

public class Main {

	public void main(String[] args) throws FileNotFoundException {
		System.out.println("\n\nOFFICER'S LOGIN PAGE");
		System.out.println("--------------------");
		new Main().input();
	}
	
	public void input() throws FileNotFoundException
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("-->Enter name::");
		String name = obj.next();
		System.out.println("-->Enter Designation::");
		String dsg = obj.next();
		System.out.println("-->Enter Password::");
		String password = obj.next();
		new Main().SendingData(name,dsg, password);
	}
	
	public void SendingData(String Name, String DSG,String Password) throws FileNotFoundException
	{
		StringBuilder designation = new StringBuilder(Name);
		designation.append(DSG);
		String Final_designation = designation.toString();
		StringBuilder passWord = new StringBuilder(Name);
		passWord.append(Password);
		String Final_password  = passWord.toString();
		Login_Lock check = new Validate_Login();
		if(check.validateName(Name)) 
		{
			System.out.println("-->Name✔");
			if(check.validateDesg(Final_designation))
			{
				System.out.println("-->Designation✔");
				if(check.validatePassword(Final_password))
				{
					System.out.println("-->PassWord✔");
					String[] args = null;
					new Police_Service().main(args);;
				}
				else
					System.out.println("Incorrect Credentials❌");
			}
			else
				System.out.println("Incorrect Credentials❌");
			
			}
		else
			System.out.println("Incorrect Credentials❌");
		
	}
	
	
	public void Further()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("\t-->[1]CCTNS SEARCH \n\t-->[2]ICJS SEARCH \n\t-->[3]CCTNS REPORTS \n\t-->[4]I-MOT \n\t-->[5]CYTRAIN \n\t-->[6]NDSO \n\t-->[7]ITSSO \n\t-->[8]CRI-MAC");
		int N = obj.nextInt();
		String services[] = {"CCTNS","ICJS","CCTNS REPORTS","I-MOT","CYTRAIN","NDSO","ITSSO","CRI-MAC"};
		String service=services[N+1];
		System.out.println("::REDIRECTING TO "+service+"PAGE::");
	}

}
