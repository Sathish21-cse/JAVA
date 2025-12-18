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



   public boolean CustomerFunction()
   {
       System.out.println("Enter Acc no");
       int Acc=sc.nextInt();
       System.out.println("Enter the pin");
       int pin=sc.nextInt();
       if(auth(Acc,pin))
       {
           System.out.println("--------------------------");
           System.out.println("Welcome "+user.getName());
           System.out.println("--------------------------");
             return true;
       }
       else
        {
            System.out.println("Try Again");
             return false;
        }
   }

   public boolean auth(int acc,int pin)
   {

       ArrayList<Customer> arr=ch.getArr();
       for(Customer i:arr)
       {

           if(i.getPin()==pin && i.getAccno()==acc)
           {
               user=i;
               return true;
           }

       }
       return false;
   }


   public void CustomerOptions()
   {
       if(CustomerFunction()) {
           while (true) {
               System.out.println("1. Check Balance");
               System.out.println("2. WithDraw Money");
               System.out.println("3. Transfer Money");
               System.out.println("4. Mini Statement");
               System.out.println("5. Logout");
               System.out.println("Enter a Option");
               int o = sc.nextInt();
               switch (o) {
                   case 1 -> {
                       getBalance();
                       return ;
                   }
                   case 2-> {
                       ch.withdraw(user);
                       return;
                   }
                   case 3->{
                       ch.TransferMoney(user);
                       return;
                   }
                   case 4->{
                       ch.getMinStatement(user);
                       return;
                   }
                   case 5-> {
                       return ;
                   }
               }
           }
       }


   }


    public void getBalance()
    {

            System.out.println("--------------------------");
            System.out.println("Your Balance: " + user.getBalance());
            System.out.println("--------------------------");

    }

//    public void withdraw()
//    {
//
//    }



   
}
