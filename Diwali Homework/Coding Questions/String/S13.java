import java.util.*;
class S13 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first String : ");
		String str1 = sc.nextLine();
		System.out.print("Enter the second String : ");
		String str2 = sc.nextLine();
		
		String str3 = str1+str2;
		System.out.print("Enter the String to see the shuffle : ");
		String str4 = sc.nextLine();
		
		char a[] = str3.toCharArray();
		char b[] = str4.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean c = Arrays.equals(a,b);
		
		if(c == true) {
			System.out.println("Vaild shuffle");
		}
		else {
			System.out.println("Invaild shuffle");
		}
		
	}
	
}