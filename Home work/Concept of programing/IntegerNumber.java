/*4.WAP to accept input in int, float, char, String

	- case values : 1,2,3,4,5,6,7
	
	- case values : 1.1, 2.2, 3.3,..7.7
	
	- case values : M,T,W, t, F S,s
	
	- case values : Monday, Tuesday....Sunday*/
import java.util.*;	
class IntegerNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//int ch=0;
		while(true)
		{
				
			System.out.println("Enter 1. for Integer");
			System.out.println("Enter 2. for Float");
			System.out.println("Enter 3. for Character");
			System.out.println("Enter 4. for String");
			System.out.println("Enter 5. for Exit");
			
			System.out.println("Enter Your Choice........");
			int ch=sc.nextInt();
				
			
			switch(ch)
			{
				case 1:
					System.out.println("Enter two Numbers:");
					int a=sc.nextInt();
					int b=sc.nextInt();
					int sum;
					sum=a+b;
					System.out.println("Sum="+sum);
					break;
				
				case 2:
					System.out.println("Enter two Numbers:");
					float p=sc.nextFloat();
					float q=sc.nextFloat();
					float sub;
					sub=p-q;
					System.out.println("Addition="+sub);
					break;
					
				case 3:
					//System.out.println("Enter Character:");
					char c='A';
					int as=c;
					System.out.println("ASCII Value:-"+as);
					break;
					
				case 4:
					System.out.println("Enter two Strings:");
					String str1=sc.next();
					String str2=sc.next();
					String str3=str1+str2;
					System.out.println("String="+str3);
					break;
					
				case 5:
						System.exit(0);
						//break;
				
				default:
					System.out.println("Wrong Choice!!!!!");
					break;
				}
			}
		}
	}	
					
					
					
					
					
					
				
				
	
