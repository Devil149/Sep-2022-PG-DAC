import java.util.*;
class Prime
{
   int number;
   
   void Read()
   {
      Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the number :");
	  number = sc.nextInt();
   }   
   
   void checkprime()
   {
     int flag = 0;
     for(int i = 2; i<number;i++)
	 {
	    
		if(number % i == 0)
		{	
	      System.out.println("Number is not prime number");	
	      flag = 1;
	      break;
		}
	 }
	 
	 if(flag==0)
	 System.out.println("Number is  prime number");
	 
   }
}

class PrimeRun
{
  public static void main(String args[])
  {
       Prime p1 = new Prime();
	   p1.Read();
	   p1.checkprime();
  }
}