class Pattern16{

public static void main(String args[]){
int n=1;
	for(int i=1;i<=5;i++)
	{
		for (int j=5; j>=6-i;j--)
		{
			//n++;
			System.out.print(j+" ");
		}
		System.out.println();
	}

}
}