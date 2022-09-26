import java.util.*;
class PlanetInfo
{
	double weight;
	
   PlanetInfo()
   {
     	   
   }
   
   
   void Mercury()
   { 
     
     System.out.println("Planet Name \t\t ******Mercury******");
	 System.out.println("Distance from earth to Mercury : 98.762  million Km.");
     System.out.println("Distance from sun to Mercury   : 51.939  million Km.");
	 System.out.println("Weigtht  of  Mercury           : 3.285 x 10^23 Kg.");
	 System.out.println("Gravity on Mercury             : 3.7 m/s square.");
     System.out.println("Mercury takes 59 Earth days to make one full rotation of sun.");
	 System.out.println("Mercury have Zero Moons.");
	 System.out.println("Temprature of Mercury          : 800 degrees Fahrenheit");
	 System.out.println("Radius of the Mercury          : 2439.7 Km");
   }
   
   void Venus()
   {
	   
      System.out.println("Planet Name \t\t ******Venus******");
	 System.out.println("Distance from earth to Venus : 254.57  million Km.");
     System.out.println("Distance from sun to Venus   : 107.59  million Km.");
	 System.out.println("Weigtht  of  Venus           : 4.867 x 10^4 Kg.");
	 System.out.println("Gravity on  Venus            : 8.87 m/s square.");
     System.out.println("Venus takes 225 Earth days to make one full rotation of sun.");
	 System.out.println("Venus have Zero Moons.");
	 System.out.println("Temprature of Venus          : 900 degrees Fahrenheit");
	 System.out.println("Radius of the Venus          : 6051 Km");
   
   }
   
   void Mars()
   {
   System.out.println("Planet Name \t\t ******Mars******");
   System.out.println("Distance from earth to Mars    : 123.7  million Km.");
     System.out.println("Distance from sun to mars    : 216.79  million Km.");
	 System.out.println("Weigtht  of  Mars            : 6.39 x 10^23 Kg.");
	 System.out.println("Gravity on   Mars            : 9.81 m/s square.");
     System.out.println("Mars takes 687 Earth days to make one full rotation of sun.");
	 System.out.println("mars have two Moons.");
	 System.out.println("Temprature of Mars           : -81 degrees Fahrenheit");
	 System.out.println("Radius of the Mars           : 3389.5 Km");
   }
   
   void Earth()
   {
       
    System.out.println("Planet Name \t\t ******Earth******");
	System.out.println("Distance from sun to Earth      : 150  million Km.");
	 System.out.println("Weigtht  of  Earth             :  5.972 x 10^24 Kg.");
	 System.out.println("Gravity on   Earth             : 9.81 m/s square.");
     System.out.println("Mars takes 365 Earth days to make one full rotation of sun.");
	 System.out.println("mars have one Moons.");
	 System.out.println("Temprature of Earth            : 57 degrees Fahrenheit");
	 System.out.println("Radius of the Earth            : 6378 Km");
	
   }
   
   void Jupiter()
   {
	  
     System.out.println("Planet Name \t\t ******jupiter******");
     System.out.println("Distance from sun to jupiter    : 216.79  million Km.");
	 System.out.println("Weigtht  of  jupiter            : 6.39 Kg.");
	 System.out.println("Gravity on   jupiter            : 9.81 m/s square.");
     System.out.println("jupiter takes 687 Earth days to make one full rotation of sun.");
	 System.out.println("jupiter have two Moons.");
	 System.out.println("Temprature of jupiter           : -81 degrees Fahrenheit");
	 System.out.println("Radius of the jupiter           : 3389.5 Km");
   }
   
   void Saturn()
   {
	  
     System.out.println("Planet Name \t\t ******Saturn******");
     System.out.println("Distance from sun to mars    : 216.79  million Km.");
	 System.out.println("Weigtht  of  Mars            : 6.39 Kg.");
	 System.out.println("Gravity on   Mars            : 9.81 m/s square.");
     System.out.println("Mars takes 687 Earth days to make one full rotation of sun.");
	 System.out.println("mars have two Moons.");
	 System.out.println("Temprature of Mars           : -81 degrees Fahrenheit");
	 System.out.println("Radius of the Mars           : 3389.5 Km");
   }
   
   void Uranus()
   {
	   
    System.out.println("Planet Name \t\t ******Uranus******");
    System.out.println("Distance from sun to mars    : 216.79  million Km.");
	 System.out.println("Weigtht  of  Mars            : 6.39 Kg.");
	 System.out.println("Gravity on   Mars            : 9.81 m/s square.");
     System.out.println("Mars takes 687 Earth days to make one full rotation of sun.");
	 System.out.println("mars have two Moons.");
	 System.out.println("Temprature of Mars           : -81 degrees Fahrenheit");
	 System.out.println("Radius of the Mars           : 3389.5 Km");
   }
   
   void Neptune()
   {
	   
    System.out.println("Planet Name \t\t ******Neptune******");
    
   }
   

}





class Planet
{
    public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	PlanetInfo p1 = new PlanetInfo();
	char ch=' ';
	
	do{
	    System.out.println("Select the option : ");
		System.out.println("1 : Mercury");
		System.out.println("2 : Venus");
		System.out.println("3 : Earth");
		System.out.println("4 : Mars");
		System.out.println("5 : Jupiter");
		System.out.println("6 : Saturn");
	    System.out.println("7 : Uranus");
		System.out.println("8 : Neptune");
	    int option = sc.nextInt();
		System.out.println("\nYou have selected for "+option);
        
		switch(option)
       {
	    case 1:
		      p1.Mercury();
			  break;
		case 2:
		      p1.Venus();
			  break;
		case 3:
		      p1.Earth();
			  break;
		case 4:
		      p1.Mars();
			  break;
		case 5:
 		      p1.Jupiter();
			  break;
		case 6:
		      p1.Saturn();
			  break;
		case 7:
		      p1.Uranus();
			  break;
		case 8:
		      p1.Neptune();
			  break;
		default:
		System.out.println("Invalid entry.");
      }
	  System.out.print("\n\nDo you want to continue(Y/N): ");
      ch =  sc.next().charAt(0);	  
	 if(ch=='Y'||ch=='y')
	 {
	  System.out.println("\033[H\033[2j");
      System.out.flush();
	 }
	 }while(ch=='Y'||ch=='y');	   
  }
}
