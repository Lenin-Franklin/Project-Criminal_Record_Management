package Criminal_Data;

import java.util.*;
import java.io.*;

import Criminal_Data_Entry.Get_Information;

import java.io.*;
import java.util.*;

public class Police_Service {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("\n\nSERVICES FOR POLICE");
		System.out.println("-------------------");
		new Police_Service().List_Form();
	}
	
	public void Service(LinkedList<Criminal> list)
	{
		Scanner obj = new Scanner (System.in);
		System.out.println("-->(1)Enter Crime");
		System.out.println("-->(2)View Criminal DataBase");
		System.out.println("-->(3)Update Criminal DataBase");
		System.out.println("-->(4)Remove Criminal Data");
		int choice = obj.nextInt();
		switch(choice)
		{
		case 1: new Police_Service().Crime_Enter(list);break;
		case 2: new Police_Service().View_DataBase(list);break;
		case 3: new Police_Service().Update_DataBase(list);break;
		case 4: new Police_Service().Remove_Data(list);break;
		}
	}
	
	public void List_Form()
	{
		LinkedList<Criminal> list =new LinkedList<Criminal>();
		list.add(new Criminal("AAZ",24,1,"24-09-2003","open"));
		list.add(new Criminal("AAB",20,2,"04-12-2005","closed"));
		list.add(new Criminal("AAC",45,1,"01-01-2001","closed"));
		list.add(new Criminal("BBA",60,2,"30-06-2019","open"));
		list.add(new Criminal("BBC",30,3,"12-08-1998","closed"));
		list.add(new Criminal("CCA",12,3,"13-09-2017","opne"));
		list.add(new Criminal("CCB",32,1,"09-09-2009","closed"));
		list.add(new Criminal("ZZA",40,1,"09-08-2017","open"));
		list.add(new Criminal("ZZB",28,1,"21-05-2015","closed"));
		list.add(new Criminal("ZZC",45,2,"05-08-2015","open"));
		list.add(new Criminal("ZZD",50,3,"20-04-2011","closed"));
		list.add(new Criminal("ZZE",20,1,"20-12-2020","open"));
		new Police_Service().Service(list);
		
	}
	
	public void Crime_Enter(LinkedList<Criminal> list)
	{
		Scanner obj = new Scanner (System.in);
		System.out.println("-->Enter name:");
		String name = obj.nextLine();
		System.out.println("-->Enter Age:");
		int age = obj.nextInt();
		System.out.println("-->Enter Crime Level\n*For Level 1 Give 1\n*Level 2 Give 2...\n");
		int level =obj.nextInt();
		obj.nextLine();
		System.out.println("-->Enter Date *(Eg: 29-09-2019):");
		String date = obj.nextLine();
		System.out.println("-->Enter Case Condition *(Eg: open or closed)");
		String state = obj.nextLine();
		list.add(new Criminal(name,age,level,date,state));
		new Police_Service().View_DataBase(list);
	}
	
	public void View_DataBase(LinkedList<Criminal> list)
	{
		int count=1;
		System.out.println("\tNAME\tAGE\tCRIME LEVEL\tDATE\t\tCONDITION");
		for(Criminal c: list)
		{
			System.out.println(count+"\t"+c.name+"\t"+c.age+"\t"+c.crime_level+"\t\t"+c.date+"\t"+c.state);
			count++;
		}
		System.out.println("\n::ENTER 1 TO GO TO PREVIOUS MENU (OR) PRESS ANY OTHER NUMBER TO TERMINATE PROCESS::");
		Scanner obj = new Scanner (System.in);
		int choice = obj.nextInt();
		if(choice == 1)
			new Police_Service().Service(list);
		else
			System.out.println("\n:::PROCESS TERMINATED:::");
			
	}
	
	public void Update_DataBase(LinkedList<Criminal> list)
	{
		Scanner obj = new Scanner (System.in);
		System.out.println("-->Enter name:");
		String name = obj.nextLine();
		System.out.println("-->Enter Age:");
		int age = obj.nextInt();
		System.out.println("-->Enter Crime Level\n\t*For Level 1 Give 1\t*Level 2 Give 2...\n");
		int level =obj.nextInt();
		obj.nextLine();
		System.out.println("-->Enter Date *(Eg: 29-09-2019):");
		String date = obj.nextLine();
		System.out.println("-->Enter Case Condition *(Eg: open or closed)");
		String state = obj.nextLine();
		Criminal obj1 = new Criminal(name,age,level,date,state);
		System.out.println("Enter the Line number of the data you want to update");
		int n = obj.nextInt();
		list.remove(n-1);
		list.add(n-1,obj1);
		new Police_Service().View_DataBase(list);
	}
	
	public void Remove_Data(LinkedList<Criminal> list)
	{
		System.out.println("Enter the Line number of the data you want to remove:");
		Scanner obj = new Scanner (System.in);
		int n = obj.nextInt();
		list.remove(n-1);
		new Police_Service().View_DataBase(list);
	}

}
