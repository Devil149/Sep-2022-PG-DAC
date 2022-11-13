import java.util.*;
class S14 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String to find the occurrence characters : ");
		String str = sc.next();
			int count[] = new int[256];
			for(int i=0; i<str.length(); i++) {
					count[str.charAt(i)]++;
			}
		
			 int a = 0;
			 char b = '0';
		
			for(int i=0; i<str.length(); i++) {
				if(a<count[str.charAt(i)]) {
					a=count[str.charAt(i)];
					b = str.charAt(i);
				}
		}
			System.out.println("Most occurred character is "+b);
	}
}