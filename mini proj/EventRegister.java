import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
class Start
{
        Scanner s=new Scanner(System.in);
        Scanner s1=new Scanner(System.in);
        String name,college_name,e_mail,gender,gaurdian,event,address,dob;
        int contact;
	public void Start_EventRegister()
	{
		System.out.println("\t\tSTUDENT REGISTERATYION");
		System.out.println("ENTER THE NAME");
		name=s.nextLine();
		System.out.println("ENTER THE COLLEGE NAME");
		college_name=s.nextLine();
		System.out.println("ENTER THE E-MAIL");
		e_mail=s.nextLine();
		System.out.println("ENTER THE ADDRESS");
		address=s.nextLine();
		System.out.println("ENTER THE EVENT");
		event=s1.nextLine();
		Duplicate();
		System.out.println("ENTER THE GENDER");
		gender=s.nextLine();
		System.out.println("ENTER THE DOB");
		dob=s.nextLine();
		System.out.println("ENTER THE CONTACT NUMBER");
		contact=s.nextInt();
		System.out.println("ENTER THE GAURDIAN");
		gaurdian=s1.nextLine();
		
                 }
                  public void Write()
	             {
		try
		{
 	                String info=name;;
		String info1=college_name;
		String info2=address;
		String info4=e_mail;
		String info5=event;
		FileWriter fw=new FileWriter("event.txt",true);
		fw.write(info+"\t");
		fw.write(info1+"\t");
		fw.write(info2+"\t");
		fw.write(info4+"\t");
                                fw.write(info5+"\t");
		fw.write(System.lineSeparator());
		fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
                public void Display()
	{
		String line;
		System.out.println("------------------------------------------------------------------------------");
		try
		{
			FileReader fr=new FileReader("event.txt");
			BufferedReader br=new BufferedReader(fr);
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
			}
			br.close();
		}
		catch(Exception e)
		{
			System.out.println("error reading file name"+e);
		}
	}
	public void Duplicate()
	{
		 String line,ch="";
		try
		{
			FileReader fr=new FileReader("event.txt");
			BufferedReader br = new BufferedReader(fr);
			while((line=br.readLine())!=null)
			{
				ch+=line;
			}
			br.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		boolean check=ch.contains(college_name);
		if(check)
		{
				System.out.println("College Exists");
		}
		else
		{
			Write();
		
		}
	}
}
public class EventRegister
{
	public static void main(String args[])
	{
		System.out.println("\t\t\tMY PROJECT");
		System.out.println("\tRegistration for Events Conducted in our College\n");
		System.out.println("\tThe main intention of this project is to register and \n store the details of the student who are participating in\n the events conducted by our college\n"); 
		Start s=new Start();
                                System.out.println("\n");
		s. Start_EventRegister();
		s.Display();
	}
}   
