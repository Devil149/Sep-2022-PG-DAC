class Pattern9{
public static void main(String args []){

int i,j;
char ch = 65;

	for (i =1; i<=5; i++)
	{
		for (j=4; j>=i; j--)
		{ 
			System.out.print(" ");
		}
		
		for (j=1; j<=i; j++)
		{
			System.out.print(ch+" ");
			ch++;
		}
		System.out.println();
		ch=65;
	}


}
}

  