import java.util.*;
class S7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String to find the occurrence characters : ");
		String str = sc.next();
		int count[] = new int[256];
		for(int i=0; i<str.length(); i++) {
				count[str.charAt(i)]++;
		}
		for(int i=0; i<256;i++) {
			if(count[i]>1) {
				System.out.println("Occurrence of "+(char)(i)+" is "+count[i]);
			}
		}
	}
}