package Login_Package;

import java.io.File; 
import java.io.FileNotFoundException;  
import java.util.Scanner; 


public class Validate_Login extends Login_Lock {
	
	boolean validateName(String Name)
	{
		int q =0;
		try {
			File obj1 = new File("C:/Users/lenin/Desktop/Login_details/Name.txt");
			Scanner reader =new Scanner(obj1);
			while(reader.hasNextLine())
			{
				String data = reader.nextLine();
				if(data.equals(Name)) {
					q=1;
					break;
					}
			}
			reader.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("An Error has Occured.\nPlease try after some time.");
			e.printStackTrace();
		}
		if(q==1)
			return true;
		else 
			return false;
	}
	
	boolean validateDesg(String Desg)
	{
		int q=0;
		try {
			File obj1 = new File("C:/Users/lenin/Desktop/Login_details/Designation.txt");
			Scanner reader =new Scanner(obj1);
			while(reader.hasNextLine())
			{
				String data = reader.nextLine();
				if(data.equals(Desg)) {
				q=1;
				break;
				}
			}
			reader.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("An Error has Occured.\nPlease try after some time.");
			e.printStackTrace();
		}
		if(q==1)
			return true;
		else 
			return false;
		
	}
	
	boolean validatePassword(String Password)
	{
		int q =0;
		try {
			File obj1 = new File("C:/Users/lenin/Desktop/Login_details/Password.txt");
			Scanner reader =new Scanner(obj1);
			while(reader.hasNextLine())
			{
				String data = reader.nextLine();
				if(data.equals(Password))
				{
					q=1;
					break;
					}
				else 
					q=0;
			}
			reader.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("An Error has Occured.\nPlease try after some time.");
			e.printStackTrace();
		}
		if(q==1)
			return true;
		else 
			return false;
	}

}
