import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        HandlerClass handle=new HandlerClass(sc);
        while(true)
        {
            System.out.println("1.Add Student");
            System.out.println("2.Show Students");
            System.out.println("3.Remove Student");
            System.out.println("4.Update Student");
            System.out.println("5.Exit");
            int n=sc.nextInt();
            sc.nextLine();
            switch(n)
            {
                case 1->handle.Register();
                case 2->handle.showStudents();
                case 3->handle.removeById();
                case 4->handle.updateById();
                case 5->{
                    System.out.println("Exiting....");
                    return;
                }
            }
        }
    }
}