class Pattern10{
public static void main(String args[]){


for(int i=1;i<=5;i++)
{

	for (int j=4; j>=i; j--)
	{
		System.out.print(" ");
	}
	
	for (int j=6-i; j<=5; j++)
	{
		System.out.print((char)(j+64)+" ");
		
	}
	
	System.out.println();
}


}
}


/*
          E                   69
		 D E                68  69
		C D E             67  68  69
       B C D E          66  67  68  69
      A B C D E	   
*/