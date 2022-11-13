import java.util.*;
class S15{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		System.out.print("Enter a character to remove : ");
		String ch = sc.next();
		
		str = str.replace(ch,"");
		System.out.println("After removing character : "+str);
	}
}