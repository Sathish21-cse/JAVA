import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CustomerHandler c=new CustomerHandler(sc);
        AtmManager at=new AtmManager(sc,c);
        CustomerManager cm=new CustomerManager(sc,c);


        while (true)
        {
            System.out.println("1.ATM Manager");
            System.out.println("2.Customer");
            int op=sc.nextInt();
            sc.nextLine();
            switch (op){
                case 1->at.AtmFunction();
                case 2->cm.CustomerFunction();
                default -> {
                    System.out.println("Enter a Valid Options");
                }
            }



        }
    }
}