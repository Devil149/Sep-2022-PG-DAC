import java.util.*;
class marksSwitch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Marks:");
		int m=sc.nextInt();
		
		
		
		char a=((m>=85)? 'A':(85>m&&m>=60)?'B':(60>m&&m>=50)?'C':(50>m&&m>=40)?'D':'E');
		
		switch(a)
		{
			case 'A':System.out.println("Distinction");
				break;
			case 'B': System.out.println("First Class");
				break;
				
			case 'C': System.out.println("Second Class");
				break;
				
			case 'D':System.out.println("Third Class");
				break;
				
			case 'E':System.out.println("Fail");
				break;
			
		//case 5: label="Fail";
			default:System.out.println("Error");
		}
		
		/*switch(label)
		{
			case 1: label="Distinction";
			case 2: labe2="First Class";
			case 3: labe3="Second Class";
			case 4: labe4="Third Class";
		//case 5: label="Fail";
			default:"Error";
		}*/
			
	}
}	
			
		