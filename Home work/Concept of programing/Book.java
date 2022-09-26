class Book
{
	int b_id;
	String b_name;
	int b_price;
	
	public static void main(String args[])
	{
		Book b1=new Book();
		Book b2=new Book();
		// b3=new Book();
		
		b1.b_id=1;
		b1.b_name="abe";
		b1.b_price=1000;
		
		/*b1.b_id=2;
		b1.b_name="xyz";
		b1.b_price=2000;*/
		
		b2.b_id=2;
		b2.b_name="axyz";
		b2.b_price=2000;
		
		/*b3.b_id=3;
		b3.b_name="pqr";
		b3.b_price=3000;*/
		
		b3=b2;
		
		
		System.out.println("Book id:"+b1.b_id);
		System.out.println("Book Name:"+b1.b_name);
		System.out.println("Book Price:"+b1.b_price);
		
		System.out.println("Book id:"+b2.b_id);
		System.out.println("Book Name:"+b2.b_name);
		System.out.println("Book Price:"+b2.b_price);
		
		/*System.out.println("Book id:"+b3.b_id);
		System.out.println("Book Name:"+b3.b_name);
		System.out.println("Book Price:"+b3.b_price);*/
	
	}
	
}	
		