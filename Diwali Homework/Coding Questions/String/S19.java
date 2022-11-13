import java.util.*;
class S19 {
	
	public static String[] sortString(String str) {
		String[] str1=str.split(" "); 
		for(int i=0;i<str1.length;i++) {
			for(int j=i+1;j<str1.length;j++) {
				if(str1[i].length()>str1[j].length()) {
					String temp= str1[i]; 
					str1[i]=str1[j]; 
					str1[j]=temp; 
				} 
			} 
		}
		return str1;
	}
	
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a Sting : ");
			String str=sc.nextLine(); 
			System.out.print(Arrays.toString(sortString(str)));
	} 
}
