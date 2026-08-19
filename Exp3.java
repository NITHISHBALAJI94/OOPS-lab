import java.util.Scanner;
class vehicle{
   String vehicleNumber;
   String model;
   String manufacturer;
   double price;
   vehicle(String vehicleNumber,String model,String manufacturer,double price){
     this .vehicleNumber = vehicleNumber;
     this.model = model;
     this.manufacturer = manufacturer;
     this.price = price;
   }
   void display(){
     System.out.println("vehicle Number:"+vehicleNumber);
     System.out.println("Model:"+model);
     System.out.println("Manufacturer:"+manufacturer);
     System.out.println("Price:"+price);
     }
 }
 class Car extends vehicle{
   Car(String v,String m,String man,double p){
     super(v,m,man,p);
    }
    void bill(){
     double tax = price*0.05;
     double insurance = 10000;
     double total = price+tax+insurance;
     
     System.out.println("\n*****CAR BILL*****");
     display();
     System.out.println("Road tax:"+tax);
     System.out.println("Insurance:"+insurance);
     System.out.println("Total Cost:"+total);
    }
 }
 class Bike extends vehicle{
   Bike(String v,String m,String man,double p){
    super(v,m,man,p);
   }
   void bill(){
    double tax = price*0.03;
    double insurance = 3000;
    double total = price+tax+insurance;
    
    System.out.println("\n*****BIKE BILL*****");
    display();
    System.out.println("Road tax:"+tax);
    System.out.println("Insurance:"+insurance);
    System.out.println("Total cost:"+total);
  }
 }
 
 class Truck extends vehicle{
   Truck(String v,String m,String man,double p){
     super(v,m,man,p);
    }
    void bill(){
      double tax = price*0.10;
      double insurance = 15000;
      double total = price+tax+insurance;
      
      System.out.println("\n*****TRUCK BILL*****");
      display();
      System.out.println("Road tax:"+tax);
      System.out.println("Insurance:"+insurance); 
      System.out.println("Total cost:"+total);
    }
}
public class main{
  public static void main(String[]args){
  
  Scanner sc = new Scanner(System.in);
  
  System.out.print("Enter vehicle number :");
  String number = sc.nextLine();
  
  System.out.print("Enter model:");
  String model = sc.nextLine();
  
  System.out.print("Enter manufacturer:");
  String manufacturer = sc.nextLine();      
  
  System.out.print("Enter vehicle price:");
  double price = sc.nextDouble(); 
  
  System.out.println("\n1.Car");
  System.out.println("2.Bike");
  System.out.println("3.Truck");
  System.out.println("Enter choice:");
  int choice = sc.nextInt();
  
  switch(choice){
    case 1:
       Car c = new Car(number,model,manufacturer,price);
       c.bill();
       break;
       
      case 2:
      Bike b = new Bike(number,model,manufacturer,price);
      b.bill();
      break;
      
      case 3:
      Truck t = new Truck(number,model,manufacturer,price);
      t.bill();
      break;
      
      default:
      System.out.println("Invalid choice");
      }
      
      sc.close();
    }  
  }  
