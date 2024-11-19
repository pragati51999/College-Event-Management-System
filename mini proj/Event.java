public class Event
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
    public Event(String eventName,String eventDate,String eventDetails)
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
      }