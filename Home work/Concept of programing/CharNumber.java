/*4.WAP to accept input in int, float, char, String

	- case values : 1,2,3,4,5,6,7
	
	- case values : 1.1, 2.2, 3.3,..7.7
	
	- case values : M,T,W, t, F S,s
	
	- case values : Monday, Tuesday....Sunday*/
import java.util.*;	
class CharNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character:");
		char c=sc.next().charAt(0);
				
			switch(c)
			{
				case 'M':
						System.out.println("I am Monday");
					break;
				
				case 'T':
						System.out.println("I am Tuesday");
					break;
					
				case 'W':
						System.out.println("I am Wednesday");
					break;
					
				case 't':
						System.out.println("I am Thursday");
					break;
					
				case 'F':
						System.out.println("I am Friday");
					break;	
					
				case 'S':
						System.out.println("I am Saturday");
					break;

				case 's':
						System.out.println("I am Sunday");
					break;			
					
				
				default:
					System.out.println("Wrong Choice!!!!!");
					break;
				}
			
		}
	}	
	