import java.util.Scanner;

public class AtmHandler {
    Scanner sc;
    private Double ATM_BAL=0.0;
    AtmHandler(Scanner sc)
    {
        this.sc=sc;
    }

    public void setATM_BAL(Double ATM_BAL) {
        this.ATM_BAL = ATM_BAL;
    }

    public Double getATM_BAL() {
        return ATM_BAL;
    }

    public void  addwallet(Double amount)
    {
        amount*=100000;
        ATM_BAL+=amount;
    }



    public void addmoney(){
        System.out.println("Enter the amount :");
        Double n=sc.nextDouble();
        sc.nextLine();
        if(n>0)
        {
            addwallet(n);
            System.out.println("Added Successfully !!!");
            denominations(n);
            System.out.println("CHECK BALANCE :(Y/N)");
            char op=sc.next().charAt(0);
            sc.nextLine();
            if(op=='Y'||op=='y')
            {
                System.out.println("---------------------------");
                System.out.println("ATM BALANCE :"+getATM_BAL());
                System.out.println("---------------------------");
            }
        }
        else
            System.out.println("Invalid amount");

    }

    public int denominations(double n)
    {
        System.out.println("100   -> "+n*300+" ("+n*30000+")");
        System.out.println("500   -> "+n*100 +" ("+n*50000+")" );
        System.out.println("1000 -> "+n*20+" ("+n*20000+")");
        return 0;
    }


}
