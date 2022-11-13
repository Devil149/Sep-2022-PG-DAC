import java.util.*;
class S20 {
	
	public static boolean palindrome(String str) {
		String temp = str.replaceAll("[^A-Za-z]","");
		temp = temp.replaceAll("[0-9]","");	
		temp = temp.toLowerCase();
		return palindromeHelper(temp, 0, temp.length()-1);
	}
	
	public static boolean palindromeHelper(String temp, int firstIndex, int lastIndex) {
		if(firstIndex>=lastIndex) {
			return true;
		}
		if(temp.charAt(firstIndex)!=temp.charAt(lastIndex)) {
			return false;
		}
		return palindromeHelper(temp, firstIndex+1, lastIndex-1);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		
		boolean b = palindrome(str);
		
		if(b==true) {
			System.out.println("String is a palindrome");
		}
		else {
			System.out.println("String is not a palindrome");
		}
	}
}