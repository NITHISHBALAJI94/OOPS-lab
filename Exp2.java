import java.util.Scanner;
import sqm.Squaremeter;
public class AreaConverter{
   public static void main(string[]args){
     Scanner Sc=new scanner(system.in);
     SquareMeter sm =new SquareMeter();
     System.out.println("Area Converter");
     System.out.println("1.square meter to square feet");
     System.out.println("2.square meter to acres");
     System.out.println("3.square meter to hectares");
     System.out.println("Enter your choice:");
     int choice=Sc.nextInt();
     System.out.println("Enter area in squaremeters:");
     double area=Sc.nextDouble();
     switch(choice){
       case 1:
        System.out.println("squareFeet="+sm.tosquareFeet(area));
        break;
       case 2:
        System.out.println("Acres="+sm.toAcres(area));
        break;
       case 3:
        System.out.println("Hectares="+sm.toHectares(area));
        break;
       default:
        System.out.println("Invalid choice");
        }
        Sc.close();
        }
        }
     
   
