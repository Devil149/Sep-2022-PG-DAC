import java.util.Scanner;
class Operator1
{   static int i,j,k,l;
public static void main(String args[])
{

Scanner s=new Scanner(System.in);


System.out.println("for unary operator press 1\nfor arithmatic operator press 2\nfor Logical operator press 3\nfor Assignment operator 4\nfor relational operator press 5\nfor Bitwise operator press 6\nfor ternary operator press 7");
int choice=s.nextInt();

switch(choice)
{
	case 1:System.out.println("Enter the number");
			 i=s.nextInt();
			 j=s.nextInt();
	System.out.println("Unary operator");
			System.out.println("i++ = "+(i++));
			System.out.println("++i = "+(++i));
			break;
	case 2:System.out.println("Enter the number");
			 i=s.nextInt();
			 j=s.nextInt();
			System.out.println("Arithmatic operator");
			System.out.println("i+j = "+(i+j));
			System.out.println("i-j = "+(i-j));
			System.out.println("i*j ="+(i*j));
			System.out.println("i/j ="+(i/j));
			System.out.println("i%j ="+(i%j));
			break;
	case 3:System.out.println("Enter the number");
			 i=s.nextInt();
			 j=s.nextInt();
			k=s.nextInt();
	        if(((i>j)&&(i>k))||(i++>++j)&&(k++<i--));
				System.out.println("Condition is true");
			break;
	case 4:System.out.println("Enter the number");
			 i=s.nextInt();
			 j=s.nextInt();
			 k=s.nextInt();
	        System.out.println("i+=1 result "+(i+=1));
			System.out.println("j-=2 result "+(j-=2));
			System.out.println("k*=3 result "+(k*=3));
			System.out.println("i/=2 result "+(i/=2));
			System.out.println("j%=3 result "+(j%=3));
			i=j;
			System.out.println("i=j result "+i);
			break;	
	case 5:System.out.println("Relational operator");
			System.out.println("Enter the number");
			i=s.nextInt();
			j=s.nextInt();
			k=s.nextInt();
			System.out.println("i==j: "+(i==j));
			System.out.println("i!=j: "+(i!=j));
			System.out.println("i<=j: "+(i<=j));
			System.out.println("i>=k: "+(i>=k));
			System.out.println("i>j: "+(i>j));
			System.out.println("i<k: "+(i<k));
              break;
	case 6:System.out.println("Bitwise operator");
			System.out.println("Enter the number");
			i=s.nextInt();
			j=s.nextInt();
			k=s.nextInt();
			l=s.nextInt();
			System.out.println("i>>2: "+(i>>2));
			System.out.println("j<<4: "+(j<<4));
			System.out.println("k>>>2: "+(k>>>2));
			//System.out.println("l<<<1: "+(l<<<1)); this <<<(unsigned left sift operator) not present in 
			break;
	case 7:System.out.println("Ternary operator");
			System.out.println("Enter the number");
			i=s.nextInt();
			j=s.nextInt();
			k=((i>j)?i:j);
			if(k==i)
				System.out.println(i+" is greater");
			else
				System.out.println(j+" is greater");
			break;
			
				
}


}
}