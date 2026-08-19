import java.util.Scanner;
class InternetBill{
  public static void Main(String args[]){
  Scanner Sc=new Scanner(System.in);
  int accNo;
  String name,plan;
  double previous,current,usage,bill=0;
  System.out.println("Enter Account Number:");
  accNo=Sc.nextInt();
  Sc.nextLine();
  System.out.println("Enter Account Holder Name:");
  name=Sc.nextLine();
  System.out.println("Enter previous usage:");
  previous=Sc.nextDouble();
  System.out.println("Enter current usage:");
  current=Sc.nextDouble();
  System.out.println("Enter plan type (basic/premium):");
  plan=Sc.next();
  usage=current-previous;
  if(plan.equalsignorecase("basic")){
     if(usage<=50)
          bill = usage*20;
      else
          bill = (50*20)+(usage-50)*30;
      }
      else if (plan.equalsignorecase("premium"));
      {
      if(usage<=100)
          bill = usage*15;
       else
          bill = (100*15)+(usage-100)*25;
          }
  System.out.println("\n Account number:"+accNo);
  System.out.println(" Account holder:"+name);        
  System.out.println("plan type:"+ plan); 
  System.out.println("Data used:"+usage+"GB");
  System.out.println("Monthly Bill:Rs."+ bill);
}
}


