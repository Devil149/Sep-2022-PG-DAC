import java.util.*;
class S2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first string : ");
		String str1 = sc.nextLine();
		System.out.print("Enter second string : ");
		String str2 = sc.nextLine();
		
		str1 = str1.replaceAll(" ","");
		str2 = str2.replaceAll(" ","");
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		boolean result = Arrays.equals(arr1,arr2);
		
		if(result == true) {
			System.out.print("Strings are anagram");
		}
		else {
			System.out.print("Strings are not anagram");
		}
	}
}