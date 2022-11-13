import java.util.*;
class S17 {
	
	public static String longestPalindrome(String str) {
		int n = str.length();
		int start = 0;
		int end = 0;
		int low , high;
		
		for(int i = 0; i < n; i++) {
			low = i;
			high = i+1;
			
			while(low>=0 && high<n && str.charAt(low) == str.charAt(high)) {
				if((end - start)<(high-low)) {
					start = low;
					end = high;
				}
				low--;
				high++;
			}
			
			low = i;
			high = i+2;
			
			while(low>=0 && high<n && str.charAt(low) == str.charAt(high)) {
				if((end - start)<(high-low)) {
					start = low;
					end = high;
				}
				low--;
				high++;
		}
		
	}
				return str.substring(start,end+1);
}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		
		System.out.print("Longest Palindrome : "+longestPalindrome(str));
		
	}
}