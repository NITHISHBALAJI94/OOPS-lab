import java.util.Scanner;
abstract class LibraryMember{
   int memberId;
   String name,email,phone;
   LibraryMember(int memberId,String name,String email,String phone){
   this.memberId=memberId;
   this.name=name;
   this.phone=phone;
   }
   void display(){
   System.out.println("member id:"+memberId);
   System.out.println("name:"+name);
   System.out.println("email:"+email);
    System.out.println("phone:"+phone);
    }
    abstract void generateSummary();
    }
    class StudentMember extends LibraryMember{
    StudentMember(int id,String name,String email,String phone){
    super(id,name,email,phone);
    }
    void generateSummary(){
     System.out.println("\n-----student member----");
     display();
      System.out.println("borrowing limit:5 Books");
       System.out.println("penalty per day :Rs.2");
        System.out.println("annual membership fee:Rs.200");
        }
        }
        class FacultyMember extends LibraryMember{
    FacultyMember(int id,String name,String email,String phone){
    super(id,name,email,phone);
    }
    void generateSummary(){
     System.out.println("\n-----Faculty member----");
     display();
      System.out.println("borrowing limit:10 Books");
       System.out.println("penalty per day :Rs.3");
        System.out.println("annual membership fee:Rs.500");
        }
        }
        class ExternalMember extends LibraryMember{
    ExternalMember(int id,String name,String email,String phone){
    super(id,name,email,phone);
    }
    void generateSummary(){
     System.out.println("\n-----External member----");
     display();
      System.out.println("borrowing limit:3 Books");
       System.out.println("penalty per day :Rs.5");
        System.out.println("annual membership fee:Rs.1000");
        }
        }
        public class Main{
             public static void main(String[] args){
             
             Scanner sc =new Scanner(System.in);
            System.out.print("enter member id:");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.print("enter name");
               String name=sc.nextLine();
               System.out.print("enter email:");
               String email=sc.nextLine();
               System.out.print("enter phone:");
               String phone=sc.nextLine();
               System.out.print("\nselect member type");
               System.out.print("1.student");
               System.out.print("2.faculty");
               System.out.print("3.external");
               System.out.print("enter choice:");
               int choice=sc.nextInt();
               switch(choice){
               case 1:
               StudentMember s=new StudentMember(id,name,email,phone);
               s.generateSummary();
               break;
               case 2:
               FacultyMember f=new FacultyMember(id,name,email,phone);
               f.generateSummary();
               break;
               case 3:
               ExternalMember e=new ExternalMember(id,name,email,phone);
               e.generateSummary();
               break;
               default:
               System.out.print("ivalid choice");
               }
               sc.close();
               }
               }
               
               
               
            
