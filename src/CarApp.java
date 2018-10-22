import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarApp {

	private static List<Car> listc = new ArrayList<>();
	private static Scanner scr = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Grand Circus Motors admin console!");
	    
		addNewCars();
		addOldCars();
		
		doList();
		String c="";
	 do
	 {
		System.out.println("Which car would you like ?");
		int choice = scr.nextInt();
		
		System.out.println(listc.get(choice-1).toString());
		System.out.println("Would you like to buy this car ?");
		 c = scr.next();
		 if(c.equals("y"))
			{
		 
			 System.out.println("Excellent ! Our Finance department will be in touch shortly");
			 break;
			 }
		 else {
			 System.out.println("Have a great day");}
	}while(c.equals("y"));
	 
	 System.out.println("Do you want to add another car");
	 String d = scr.next();
		 
	 if(d.equals("y"))
	 {
		 System.out.println("Enter Car #"+" Make");
			String make = scr.next();
			
			System.out.println("Enter Car #"+ " Model");
			String model = scr.next();
			
			System.out.println("Enter Car #"+ " Year");
			int year = scr.nextInt();
			
			System.out.println("Enter Car #"+ " Price");
			double price = scr.nextDouble();
	 
		 listc.add(new Car(make,model,year,price));
	 
	 }
	 doList();
	 
	 System.out.println("Do you want to delete any car?  enter the number?");
	 int number = scr.nextInt();
	 listc.remove(number);
	 
	 System.out.println("Do you want to look up any car?");
	 int number1= scr.nextInt();
	 System.out.println(listc.get(number1));
	 doList();
	 
			
	}
	private static void doList()
	{
		System.out.println("Current Inventory: ");
		for(int i =0,j=1;i<6 &&j<=6;i++,j++)
		{			
		System.out.print(j +"."+listc.get(i).toString());
		System.out.println();
		
		}
		System.out.println();
	}
	private static void addNewCars()
	{
		for(int i =1;i<= 3;i++) {
			System.out.println("Enter Car #"+i+" Make");
			String make = scr.next();
			
			System.out.println("Enter Car #"+i+ " Model");
			String model = scr.next();
			
			System.out.println("Enter Car #"+i+ " Year");
			int year = scr.nextInt();
			
			System.out.println("Enter Car #"+i+ " Price");
			double price = scr.nextDouble();
			
			listc.add(new Car(make,model,year,price));
		
			
		      }
	}
	private static void addOldCars()
	{
		for(int i =1;i<= 3;i++) {
			System.out.println("Enter Car #"+i+" Make");
			String make = scr.next();
			
			System.out.println("Enter Car #"+i+ " Model");
			String model = scr.next();
			
			System.out.println("Enter Car #"+i+ " Year");
			int year = scr.nextInt();
			
			System.out.println("Enter Car #"+i+ " Price");
			double price = scr.nextDouble();
			
			System.out.println("Enter Mileage" +i + " Milage");
			double mileage = scr.nextDouble (); 
			
			listc.add(new UsedCar(make,model,year,price,mileage));
		}
	}
}

