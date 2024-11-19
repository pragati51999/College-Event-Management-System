import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class EventManager
{
 String eventName;
 String eventDate;
 String eventDetails;
   
  public String getEventName()
  {
   return eventName;
   }
   public  void setEventName(String eventName)
   {
    this.eventName=eventName;
    }
    public String getEventDate()
    {
     return eventDate;
    }
    public  void setEventDate(String eventDate)
   {
    this.eventDate=eventDate;
    }
     
    public String getEventDetails()
    {
    return eventDetails;
    }
    public  void setEventDetails(String eventDetails)
   {
    this.eventDetails=eventDetails;
    } 
    public EventManager(String eventName,String eventDate,String eventDetails)
    {
     super();
     this.eventName=eventName;
     this.eventDate=eventDate;
     this.eventDetails=eventDetails;
     }
     public String toString()
     {
      return "eventName="+eventName+ ",eventDate="+eventDate + ", eventDetails="
       +eventDetails;
       }
   public static void main(String[]args)
               {
                EventManager event=readUserInput();
                if(null!=event)
                {
                  writeToFile(event);
                }
                else
                {
                   System.out.println("..Error Creating event...");
                 }
                }
      private static void writeToFile(EventManager event)
      {
        try
        {
          File file=new File("event-details.txt");
          BufferedWriter out=null;
          if(file.exists())
          {
           out=new BufferedWriter(new FileWriter(file,true));
           out.write(System.lineSeparator());
           out.write(event.toString());
           }
           else
           {
            out=new BufferedWriter(new FileWriter(file));
            out.write(event.toString());
            }
            out.close();
            }
            catch(IOException e)
            {
             System.out.println("exception occurred"+e);
             }
             }
             private static EventManager readUserInput()
             {
              String eventName=null,eventDate=null,eventDetails=null;
			  Scanner scanner=new Scanner(System.in);
              System.out.println("...........................");
              System.out.println(".....Welcome to EventManager...");
              System.out.println("............................");
			  System.out.println("Create an event:: Enter below details..");
              System.out.println(".......Enter  Event Name.....");
              eventName=scanner.nextLine();
              System.out.println("...Enter Event Date in DD/MM/yyy");
			 
              
        try {
			SimpleDateFormat dateformat3 = new SimpleDateFormat("dd/MM/yyyy");
		    System.out.println("enter the date");
			eventDate=scanner.nextLine();
			
		    
		}
		catch(Exception e)
              {
               System.out.println("Date should be in DD/MM/yyy");
               
              }
			 System.out.println(".....Enter Event Details....");
               eventDetails=scanner.nextLine();
               System.out.println("thanks for the information..");
               System.out.println("....Event Created and stored....");
               return new EventManager(eventName,eventDate,eventDetails);
               }
               }
			  