package Criminal_Data_Entry;

import java.util.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner obj = new Scanner (System.in);
		System.out.println("\n\nSERVICES FOR CITIZEN");
		System.out.println("--------------------");
		System.out.println("\t-->[1]REPORT A CYBER CRIME \n\t-->[2]CENTRAL CITIZEN SERVICES \n\t-->[3]SERVIES PROVIDED BY STATE POLICE CITIZEN PORTALS");
		System.out.println("Enter the respective number::");
		int choice = obj.nextInt();
		switch(choice)
		{
		case 1: Report1();new Get_Information().main(args);break;
		case 2: Report2();new Get_Information().main(args);break;
		case 3: Report3();new Get_Information().main(args);break;
		default: {
			System.out.println("invalid");
		}
		}

	}
	
		
	
	public static void Report1()
	{
		System.out.println("\n::REPORT A CYBER CRIME::");
		System.out.println("\tThis portal is an initiative of Government of India to facilitate victims/complainants to report\n\tcyber crime complaints online. This portal caters to complaints pertaining to cyber crimes only\n\twith special focus on cyber crimes against women and children. Complaints reported on this\n\tportal are dealt by law enforcement agencies/ police based on the information available in the\n\tcomplaints. It is imperative to provide correct and accurate details while filing complaint for prompt action.");
		System.out.println("\n\tPlease contact local police in case of an emergency or for reporting crimes other than cyber\n\tcrimes. National police helpline number is 100. National women helpline number is 181.");
	}
	
	public static void Report2()
	{
		System.out.println("\n::CENTRAL CITIZEN SERVICES::");
		System.out.println("\t1.Missing Person Search.");
		System.out.println("\t2.Generate Vehicle NOC.");
		System.out.println("\t3. Proclaimed Offenders Information.\r\n" + 
				"");
	}
	
	public static void Report3()
	{
		System.out.println("\n::SERVICES PROVIDED BY STATE POLICE CITIZEN PORTALS::");
		System.out.println("-->1. Filing of Complaints to the concerned Police Station.");
		System.out.println("-->2. Obtaining the status of the complaints.");
		System.out.println("-->3. Obtaining the copies of FIRs.");
		System.out.println("-->4. Details of arrested persons/wanted criminals.");
		System.out.println("-->5. Details of missing/kidnapped persons and their matching with arrested,");
		System.out.println("-->6. Details of stolen/recovered vehicles, arms and other properties.");
		System.out.println("-->7. Submission of requests for issue/renewal of various NOCs.");
		System.out.println("-->8. Verification requests for servants, employment, passport, senior citizen registrations etc.");
		System.out.println("-->9. Portal for sharing information and enabling citizens to download required forms.");
		
	}

}
