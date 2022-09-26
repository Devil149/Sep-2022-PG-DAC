
class Upc
{
   
   
   
   void Int()
     {
	   byte b =127;
	   short sh ;
	   int i;
	   long l;
	   float f ;
	   char ch; 
	   
	   System.out.println("this is upcasting of ( byte-->short) : "+(sh=b));
	   System.out.println("this is upcasting of ( short-->int) : "+(i=sh+5124));
	   System.out.println("this is upcasting of ( int-->long) : "+(l=i+21364));
	   System.out.println("this is upcasting of ( byte-->float) : "+(f=b+6231f));
	   System.out.println("this is upcasting of ( int-->float) : "+(f=i));
	   System.out.println("this is upcasting of ( long-->float) : "+(f=l));
	   System.out.println("\n\n");
	   ch = 'a';
	   System.out.println("this upcasting is for ( char-->int): "+(i=ch));
	   System.out.println("this upcasting is not possible  ( byte-->char)");
	   System.out.println("this upcasting is not possible  ( char-->short)");
	  }
     
	 void flt()
     {
		 System.out.println("\n\n");
	   float f = 678.789f;
       double d ;    
	   System.out.println("this is upcasting of ( float-->double) : "+(d=f));
     }
	
	
}


class Down
{
	  void Narrow()
	  {
		  int i;
		  long l;
		  short sh;
		  byte b;
		  System.out.println("\n\n");
		     sh = 327;b=0;
		  System.out.println("Downcasting of short-->byte : "+(b=(byte)sh));
		     i = 894;
		  System.out.println("Downcasting of int-->byte : "+(b=(byte)i));
		     l = 995l;
		  System.out.println("Downcasting of long-->byte : "+(b=(byte)l));
		         
		  System.out.println("Downcasting of int-->short : "+(sh=(short)i));
		   
		  System.out.println("Downcasting of long-->short : "+(sh=(short)l));
		  
		  System.out.println("Downcasting of long-->int : "+(i=(int)l));
	      
	  }
	  
	  void flt()
	  {
		  float f = 0.0f;
		  double d=3434344.544;
		  System.out.println("\n\n");
		  System.out.println("Downcasting of double-->flt : "+(f=(float)d));
	  }
	  
	  void miscle()
	  {
		  byte b=65;
		  char ch=' ';
		  short s=0;
		  System.out.println("\n\n");
		  System.out.println("this downcasting is for ( byte-->char): "+(ch=(char)b));
		  System.out.println("this downcasting is for ( char-->short): "+(s=(short)ch));
		  
	  }
	  
	  
}

class Casting
{
    public static void main(String args[] )
	{
	   Upc u1 = new Upc();
           u1.Int();
           u1.flt();
        
		   
		   Down d1 = new Down();
	         d1.Narrow();
			 d1.flt();
			 d1.miscle();
	}   
}