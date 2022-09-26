import java.util.Scanner;
class power
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
	  int base = sc.nextInt();
      int power = sc.nextInt();
	  int  temp = base;
	  for(int i=1 ; i<power ; i++)
	  {
	     temp = temp*base;
	  }
	  System.out.println(temp);
   }
}