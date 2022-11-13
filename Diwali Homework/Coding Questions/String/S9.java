import java.util.*;
class S9 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		
		String a = str.replaceAll(" ","%20");
		
		System.out.println("Output : "+a);
	}
}