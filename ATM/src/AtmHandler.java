import java.util.Scanner;

public class AtmHandler {
    Scanner sc;
    private Double ATM_BAL=0.0;
    AtmHandler(Scanner sc)
    {
        this.sc=sc;
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
            System.out.println(getATM_BAL());
        }
        else
            System.out.println("Invalid amount");

    }
}
