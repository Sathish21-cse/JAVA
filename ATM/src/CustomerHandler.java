import java.util.*;
import java.util.Scanner;


public class CustomerHandler {
    private int acc=100;
    private int id=1;
    private int transID=1;

    Scanner sc;
    AtmHandler ah;
    private ArrayList<Customer> arr=new ArrayList<>();
    private ArrayList<Transactions> tarr=new ArrayList<>();


    CustomerHandler(Scanner sc,AtmHandler ah)
     {
         this.sc=sc;
         this.ah=ah;
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
// Funtion to create new users
    public void newuser()
     {

                 System.out.println("Enter Name:");
                 String name = sc.nextLine();
                 System.out.println("Enter the PIN");
                 int pin = sc.nextInt();
                 sc.nextLine();
                 System.out.println("Enter the Balance to set:");
                 double bal = sc.nextDouble();
                 sc.nextLine();
                 Customer c = createuser(id++, name, acc++, pin, bal);
                 adduser(c);
                 System.out.println("User Added Succesfully !!!");
                 optionToCreateUser();


     }

     public void optionToCreateUser() {
         System.out.println("------------------------");
         System.out.println("Need to add new users (Y/N)");
         char op = sc.next().charAt(0);
         sc.nextLine();
         if (op =='Y' || op == 'y') {
             newuser();
         }
     }

// <--------------- Display users starts here ---------------------->
     public void getuser(){

         if(arr.size()>0) {
             System.out.println("Customer id  | Customer name  | Acc No.  | Pin Number   |  Balance");
             for (Customer i : arr) {
                 System.out.println(i);
             }
             optionToCreateUser();
         }
         else {
             System.out.println("NO user had created");
             optionToCreateUser();

         }
     }
 // <--------------- Display users ends here ---------------------->


// <---------------- WithDraw function starts here ------------------->
     public void withdraw(Customer user)
     {
         System.out.println("Enter the amount to be withdraw:");
         int amount=sc.nextInt();

         if(ah.getATM_BAL()<amount*100)
         {
             System.out.println("Insufficient Money in ATM");
         }
         else {
             if(amount>user.getBalance())
             {
                 System.out.println("Insufficient amount in your account");
             }
             else if(amount>100)
             {
                 System.out.println("the maximum amount that can be withdrawn is 10,000");
             }
             else {
                 double currentBAL=user.getBalance();
                 user.setBalance(currentBAL-amount*100);
                 ah.setATM_BAL(ah.getATM_BAL()-amount*100);
                 Transactions t= createtransaction(amount,user);
                 tarr.add(t);
                 System.out.println("Withdraw Done Successfully");
                 System.out.println("------------------------------");
//                 DenominationRule(amount);
                 System.out.println("-------------------------------");
             }
         }
     }


//     public int DenominationRule(int amount){
//         if(amount>=5)
//         {
//             System.out.println("");
//         }

     public Transactions createtransaction(int amount,Customer user)
     {
         return new Transactions(transID++,"Withdraw from ATM","Debit",amount*100,user.getId());
     }


    //<-------------->WithDraw function ends here ------------------->

    public void TransferMoney(Customer user)
    {
        System.out.println("Enter the Account no to send money:");
        int receiverAcc=sc.nextInt();
        Customer receiver=userPresent(receiverAcc);
        if(receiver == null)
        {
            System.out.println(receiverAcc+"is not found");
        }
        else {
            System.out.println("Enter the amount to send :");
            int amount= sc.nextInt();
            if(amount>100)
            {
                System.out.println("Sorry ! Maximum Transaction amount is 10000");
            }
            else if(amount>user.getBalance()){
                System.out.println("Insufficient Balance");
            } else if (amount> ah.getATM_BAL()) {
                System.out.println("Insufficient Balance in Account");
            }
            else {
                Double userBAl=user.getBalance()-amount*100;
                Double receiverBAL=receiver.getBalance()+amount*100;
                user.setBalance(userBAl);
                receiver.setBalance(receiverBAL);
                System.out.println("Transfered Successfully !!!!!");
                Transactions send= createSendTransaction(amount,user,receiver);
                Transactions recive= createreciveTransaction(amount,user,receiver);
                tarr.add(send);
                tarr.add(recive);

            }
        }

    }

    public Customer userPresent(int receiver)
    {
        for(Customer i:arr)
        {
            if(i.getAccno()==receiver)
            {
                return i;
            }
        }
        return null;
    }

    public Transactions createSendTransaction(int amount,Customer user,Customer receiver){
        String message="Sent to Acc "+receiver.getAccno();
        return new Transactions(transID++,message,"Debit",amount*100,user.getId());
    }

    public Transactions createreciveTransaction(int amount,Customer user,Customer receiver){
        String message=" Received from Acc  "+user.getAccno();
        return new Transactions(transID++,message,"Credit ",amount*100,receiver.getId());
    }






    public void getMinStatement(Customer user) {
        System.out.println("    Trans_id       |       Trans_Description   |      Type    |       Amount");
        for(Transactions i:tarr) {
            if (user.getId() == i.getUserID()) {
                System.out.println("-------------------------------------------------");
                System.out.println(i);
            }
        }
    }



}


