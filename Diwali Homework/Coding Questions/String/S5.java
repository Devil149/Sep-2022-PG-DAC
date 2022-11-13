import java.util.*;
class S5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the word to find the duplicate characters : ");
		String str = sc.next();
		int count[] = new int[256];
		for(int i=0; i<str.length(); i++) {
				count[str.charAt(i)]++;
		}
		for(int i=0; i<256;i++) {
			if(count[i]>1) {
				System.out.println("Duplicate character : "+(char)(i));
			}
		}
	}
}