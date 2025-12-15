import java.util.Scanner;

public class AtmManager {
    Scanner sc;
    AtmHandler at;
    CustomerHandler c;

    public AtmManager(Scanner sc,CustomerHandler c) {
        this.sc = sc;
        this.at=new AtmHandler(sc);
        this.c=c;
    }


    public void AtmFunction()
    {
        while (true)
        {
            System.out.println("1.Add User");
            System.out.println("2.Add Money on atm");
            System.out.println("3.Display Users");
            int o=sc.nextInt();
            sc.nextLine();
            switch (o)
            {
                case 1->c.newuser();
                case 2->at.addmoney();
                case 3->c.getuser();
                case 4-> {
                    System.out.println("<<<<<EXITING>>>>");
                return;
            }
                default -> {
                    System.out.println("Invalid Key");
            }

            }
        }
    }
}
