import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;
import java.io.File;
class event2
{
  public static void main(String[]args)
  {
   event2 obj1=new event2();
   obj1.event2();
   }
   Scanner sc1=new Scanner(System.in);
   public void event2()
   {
    System.out.println("enter username");
	String username=sc1.nextLine();
	System.out.println("enter password");
	int password=sc1.nextInt();
	if(password==23455)
	{
	 System.out.println("............................");
	 System.out.println("College Event Management System");
	 System.out.println("............................");
	 System.out.println("Select:");
	 System.out.println("\t 1.Enter Event name\n\t 2.Enter the events conducted month\n\t 3.display data\n");
	 int ch1=sc1.nextInt();
	 switch(ch1)
	 {
	  case 1:
	      System.out.println("select category");
		  System.out.println("\n\t 1.I2E2\n\t 2.Haptics\n");
		  int ch2=sc1.nextInt();
		   switch(ch2)
		   {
		     case 1:
			 I2E2();
			 break;
			 case 2:
			 Haptics();
			 break;
			 
			 default: 
			   System.out.println("enter correct input");
			   break;
			}
			break;
			case 2:
	          month();
	          break;
			case 3:
			 display();
			  break;
			 default: 
			   System.out.println("enter correct input"); 
			
			  
	             
	}
	}
	else
	{
	  System.out.println("enter correct username and password...........");
	 }
	 }
   
   public void I2E2()
   {
   try
   {
    File f1=new File("ev.txt");
	FileOutputStream fos1=new FileOutputStream(f1,true);
	System.out.println("Enter the  event  name");
	String name1=sc1.next();
	System.out.println("Enter the  date");
	String d1=sc1.next();
	System.out.println("Enter the  time");
	String t1=sc1.next();
	String a="\r\n";
	fos1.write(a.getBytes());
	fos1.write(name1.getBytes());
	String b="\t\t";
	fos1.write(b.getBytes());
	fos1.write(d1.getBytes());
	String c="\t\t";
	fos1.write(c.getBytes());
	fos1.write(t1.getBytes());
	System.out.println("data saved");
	}
	catch(IOException e)
	{
	 e.printStackTrace();
	}
   }
   public void  Haptics()
   {
    try
	{
	File f1=new File("ev.txt");
	FileOutputStream fos1=new FileOutputStream(f1,true);
	System.out.println("Enter the  experiment  name");
	String name2=sc1.next();
	System.out.println("Enter the  date");
	String d2=sc1.next();
	System.out.println("Enter the  time");
	String t2=sc1.next();
	String a="\r\n";
	fos1.write(a.getBytes());
	fos1.write(name2.getBytes());
	String b="\t\t";
	fos1.write(b.getBytes());
	fos1.write(d2.getBytes());
	String c="\t\t";
	fos1.write(c.getBytes());
	fos1.write(t2.getBytes());
	System.out.println("data saved");
	}
	catch(IOException e)
	{
	 e.printStackTrace();
	}
   }
   public void month()
	{
		try
		{
		File f1=new File("ev.txt");
	FileOutputStream fos1=new FileOutputStream(f1,true);
    System.out.println("enter the number of events conducted in this month");
    String name3=sc1.next();
    String b="\t\t";
	fos1.write(b.getBytes());
	fos1.write(name3.getBytes());
	System.out.println("data saved");	
   }
   catch(IOException e)
	{
	 e.printStackTrace();
	}
	}
   public void display()
   {
	   String line=null;
	   try
	   {
    FileReader fr=new FileReader("ev.txt");
	BufferedReader buff=new BufferedReader(fr);
	while((line=buff.readLine())!=null)
	{
	 System.out.println(line);
	}
	buff.close();
	}
	 catch(IOException ex)
	 {
	  System.out.println("error in reading file...............");
	 }
	}
	
}
