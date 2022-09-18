class sample{
public static void main(String args []){

int n =10;
for(int i=1;i<=10;i++)
{
	
	for (int j=9; j>=i; j--)
	{
		System.out.print(" ");
	}
	
	for (int j=1; j<=i; j++)
	{
		System.out.print(n+" ");
		
	}
	n--;
	System.out.println();
}


}
}
