import java.util.*;
 enum Days {
    monday,
    tuesday,
    wednesday,
    thursday,
    friday,
    saturday,
    sunday;
}

class WeekDays {
 
    // Driver method
    public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of ENum:");
		String s=sc.nextLine();
        Days x = (Days.valueOf(s.toLowerCase()));
		switch(x)
		{
			case monday:
				System.out.println("You Choose Monday");
				break;
			
			case tuesday:
				System.out.println("You Choose tuesday");
				break;
				
			case wednesday:
				System.out.println("You Choose wednesday");
				break;	
				
			case thursday:
				System.out.println("You Choose thursday");
				break;	
				
			case friday:
				System.out.println("You Choose FRIDAY");
				break;	
					
			case saturday:
				System.out.println("You Choose saturday");
				break;			

			case sunday:
				System.out.println("You Choose sunday");
				break;			
				
			default:
				System.out.println("Invalid Case");
				break;
				
		}	
        
    }
}