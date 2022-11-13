import java.util.*;
class S16 {
	
	public static void remove(String str, char ch) {
		int j, count = 0, n = str.length();
		char arr[] = str.toCharArray();
		for (int i=0, j=0; i < n; i++)
		{
			if (arr[i] != ch)
			arr[j++] = arr[i];
			else
				count++;
		}
		 
		while(count > 0)
		{
			arr[j++] = '\0';
			count--;
		}
     
		System.out.println(arr);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		System.out.print("Enter the character to remove : ");
		char ch = sc.next().charAt(0);
		
		remove(str,ch);
	}
}