import java.util.*;
class S4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		try
		{
			Integer a = Integer.parseInt(str);
			System.out.println("The string contain only digit ");
		}
		catch(Exception e)
		{
			System.out.println("The string did not contain only digit");
		}
	}
}