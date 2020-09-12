import java.io.FileNotFoundException;
import java.util.Scanner;

import Login_Package.Main;
public class Login_Navigate {

	public static void main(String args[]) throws FileNotFoundException {
		System.out.println("\n::MUST LOGIN FIRST TO CONTINUE::");
		System.out.println("\n::REDIRECTING TO LOGIN PAGE::");
		Main obj = new Main();
		obj.main(args);
	}
	
	public void Police_Service()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("\n\nSERVICES FOR POLICE");
		System.out.println("-------------------");
		System.out.println("\t-->[1]CCTNS SEARCH \n\t-->[2]ICJS SEARCH \n\t-->[3]CCTNS REPORTS \n\t-->[4]I-MOT \n\t-->[5]CYTRAIN \n\t-->[6]NDSO \n\t-->[7]ITSSO \n\t-->[8]CRI-MAC");
		
		
	}
	
}
