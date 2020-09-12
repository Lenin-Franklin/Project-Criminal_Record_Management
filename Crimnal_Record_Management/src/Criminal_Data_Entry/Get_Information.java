package Criminal_Data_Entry;

import java.io.*;
import java.util.*;
import Login_Package.Main;

public class Get_Information {
	
	

	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		Scanner obj = new Scanner (System.in);
		System.out.println("\n::CRIME REPORT::");
		System.out.println("----------------");
		System.out.println("Enter your name:");
		String data = obj.nextLine();
		list.add("Name::"+data);
		System.out.println("Enter your phone number:");
		data = obj.nextLine();
		list.add("Phone Number::"+data);
		System.out.println("Enter your city:");
		data = obj.nextLine();
		list.add("City::"+data);
		System.out.println("Select type of crime:\n-->(1)Known Person\n-->(2)Unknown person");
		int choice = obj.nextInt();
		obj.nextLine();
		if(choice == 1)
		{
			System.out.println("Enter name of criminal:");
			data = obj.nextLine();
			list.add("Criminal Name::"+data);
		}
		else
			list.add("Criminal Name::???");
		System.out.println("Enter Date of Crime:");
		data =  obj.nextLine();
		list.add("Date of Crime::"+data);
		System.out.println("Enter Crime Descrition:(enter within 20 characters)");
		data = obj.nextLine();
		list.add("Crime Description::"+data);
		
//		Iterator<String> it = list.iterator();
//        while(it.hasNext())
//        {
//            System.out.println(it.next());
//        }
        
        System.out.println("\n\n::TICKET GENERATED::");
        System.out.println("-->Press 1 To Terminate Process");
        System.out.println("-->Press 2 To go to Police Login Page");
        int choice1=obj.nextInt();
        switch(choice1)
        {
        case 1 : System.out.println("::PROCESS TERMINATED::");break;
        case 2 : System.out.println("::REDIRECTING TO POLICE LOGIN PAGE::");new Main().main(args);break;
        default:System.out.println("::INVALID INPUT PROCESS TERMINATED::");
        }
	}

	
	}
	


