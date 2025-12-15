import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class CustomerHandler {
    private int acc=100;
    private int id=1;

    Scanner sc;
    private ArrayList<Customer> arr=new ArrayList<>();

     CustomerHandler(Scanner sc)
     {
         this.sc=sc;
     }

     public Customer createuser( int id,String name, int Acc,int pin,double balance)
     {
          return new Customer(id,name,Acc,pin,balance);
     }

     public void adduser(Customer c)
     {
         arr.add(c);
     }

    public ArrayList<Customer> getArr() {
        return arr;
    }

    public void newuser()
     {
         System.out.println("Enter Name:");
         String name=sc.nextLine();
         System.out.println("Enter the PIN");
         int pin=sc.nextInt();
         sc.nextLine();
         System.out.println("Enter the Balance to set:");
         double bal= sc.nextDouble();
         sc.nextLine();
         Customer c=createuser(id++,name,acc++,pin,bal);
         adduser(c);
         System.out.println("User Added Succesfully !!!");
     }

     public void getuser(){
         if(arr.size()>0) {
             for (Customer i : arr) {
                 System.out.println(i);
             }
         }
         else {
             System.out.println("NO user had created");
         }
     }

     public void getBalance(Customer user)
     {
         System.out.println("--------------------------");
         System.out.println("Your Balance: "+user.getBalance());
         System.out.println("--------------------------");
     }





}
