import java.util.*;

class BankInfo
{
	static String name;
	static String number;
	static String id;
	static String address;
	static long balance = 1000;
	long acno;
	
	BankInfo()
	{
		System.out.println("MINIMUM BALANCE FOR SAVING ACCOUNT\t : Rs. 1000");
		System.out.println("MINIMUM BALANCE FOR CURRENT ACCOUNT\t : Rs. 1000");
		
	}
	
		
	void NewAccount(int i)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("ENTER NAME :");
		name = sc.nextLine();
		
		System.out.print("ENTER CONTACT NUMBER :");
		number = sc.nextLine();
		
		System.out.print("ID PROOF AND ITS NUMBER");
		id = sc.nextLine();
		
		System.out.print("ADDRESS");
		address = sc.nextLine();
		
		acno = 100+i;
		
		
	}
	
	void GetDetails()
	{
		
		System.out.println("Account holder's Name : "+name);
		System.out.println("Account holder's Contact Number : "+number);
		System.out.println("Account Balance : RS"+ balance);
		
		System.out.println("Account Number : RS"+ acno);
		
		
	}
	
	void Deposit()
	{
		int dep;
		System.out.println("ENTER AMOUNT : ");
		Scanner sc =new Scanner (System.in);
		dep = sc.nextInt();
		balance = balance + dep;
		System.out.println("UPDATED BALANCE : RS"+balance);
		
		
	}
	
	void Withdraw()
	{
		int wit;
		System.out.println("ENTER AMOUNT : ");
		Scanner sc =new Scanner (System.in);
		wit = sc.nextInt();
		balance = balance - wit;
		System.out.println("UPDATED BALANCE : RS"+balance);
		
		
	}
	
	
}











class Bank3
{
  public static void main(String [] args)
  {
	char ch=' ';
	do
	{
		
	System.out.println("\t\t *******Welcome to CITY BANK*******");
	
	System.out.print("\nSELECT OPTIONS : ");
	System.out.println("1. CREATE NEW ACCOUNT");
	System.out.println("2. GET ACCOUNT DETAILS");
	System.out.println("3. MONEY DEPOSIT");
	System.out.println("4. MONEY WITHDRAW");
	
	
	BankInfo b1 = new BankInfo();
	
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	

		switch (a)
			{
				case 1 : int i = 1;
				System.out.println("ACCOUNT CREATION PROCESS");
				b1.NewAccount(i++);
				break;
		
				case 2 : System.out.println("GET ACCOUNT DETAILS");
				b1.GetDetails();
				break;
		
				case 3 : System.out.println("MONEY DEPOSIT");
				b1.Deposit();
				break;
		
				case 4 : System.out.println("MONEY WITHDRAW");
				b1.Withdraw();
				break;
				
			}
	
	System.out.println("Do you want to continue ???");
	System.out.println("Press 'Y' for continue, Press 'N' for exit");
	
	ch = sc.next().charAt(0);
	
	} while ( ch == 'Y' || ch == 'y');
	
	
	
  }
	
}