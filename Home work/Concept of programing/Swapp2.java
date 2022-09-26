import java.util.Scanner;
class Swapp2
{   
  int a,b;

   void GetData()
   {
     Scanner sc = new Scanner(System.in);
   	  System.out.print("Enter the first number : "); 
	   a = sc.nextInt();
	  System.out.print("Enter the second number : ");
	   b = sc.nextInt();
  }
  
   void swap()
   {
      
	  a = a+b;
	  b = a-b;
	  a = a-b;
   }
   
   void print()
   {
      System.out.println("\na = "+a);
	  System.out.println("\nb = "+b);
   }
  
  
  public static void main(String args[])
  {
     Swapp s1 = new Swapp();
     s1.GetData();
	 System.out.println("\n Numbers before Swapping. ");
     s1.print();
     s1.swap();	 
	 System.out.println("\n Numbers after Swapping. ");
     s1.print();
  }
}