package Criminal_Data_Entry;

import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Citizen_Details implements Get_Citizen_Details{

	
	public void Get_Details() {
		try 
		{
			FileWriter write = new FileWriter("C:/Users/lenin/Desktop/Login_details/Citizen/Citizen_Store.txt");
			
		}
		catch{
			
		}
		
	}

	@Override
	public void Store_Details() {
		
		
	}
}
