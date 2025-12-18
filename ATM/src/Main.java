import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        AtmHandler ah=new AtmHandler(sc);
        CustomerHandler c=new CustomerHandler(sc,ah);
        CustomerManager cm=new CustomerManager(sc,c);


        while (true)
        {
            System.out.println("1.Load Cash");
            System.out.println("2.Show Customers");
            System.out.println("3.Show Operations");
            int op=sc.nextInt();
            sc.nextLine();
            switch (op){
                case 1->ah.addmoney();
                case 2->c.getuser();
                case 3->cm.CustomerOptions();
                default -> {
                    System.out.println("Enter a Valid Options");
                }
            }



        }
    }
}