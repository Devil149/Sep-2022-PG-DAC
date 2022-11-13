import java.util.*;
class S3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an String : ");
		String str = sc.next();
		int count[] = new int[256];
	for(int i=0; i<str.length(); i++) {
			count[str.charAt(i)]++;
	}
	for(int i=0; i<256;i++) {
		if(count[i]==1) {
			System.out.println("Non Duplicate Character : "+(char)(i));
		}
	}
	}
}

	
