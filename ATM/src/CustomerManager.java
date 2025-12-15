import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManager {
    Scanner sc;
    CustomerHandler ch;
    Customer user;
    CustomerManager(Scanner sc,CustomerHandler c)
    {
        this.sc=sc;
        this.ch=c;
    }



   public void CustomerFunction()
   {
       System.out.println("Enter Acc no");
       int Acc=sc.nextInt();
       System.out.println("Enter the pin");
       int pin=sc.nextInt();
       auth(Acc,pin);
   }

   public void auth(int acc,int pin)
   {

       ArrayList<Customer> arr=ch.getArr();
       for(Customer i:arr)
       {

           if(i.getPin()==pin && i.getAccno()==acc)
           {
               user=i;
               System.out.println("Welcome "+i.getName());
               System.out.println("--------------------------");
               CustomerOptions(user);
           }
           else {
               System.out.println("Try Again");
               CustomerFunction();
           }
       }

   }

   public void CustomerOptions(Customer user)
   {
       while(true)
       {
           System.out.println("1.Check Balance");
           System.out.println("2.WithDraw Money");
           System.out.println("3.Transfer Money");
           System.out.println("4.Mini Statement");
           System.out.println("Enter a Option");
           int o=sc.nextInt();
           switch (o)
           {
               case 1->ch.getBalance(user);
               
           }
       }
   }

   
}
