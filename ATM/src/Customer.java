public class Customer {
    private int id;
    private String name;
    private int Accno;
    private int pin;
    private double balance;

    public Customer(int id, String name, int accno, int pin, double balance) {
        this.id = id;
        this.name = name;
        Accno = accno;
        this.pin = pin;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccno() {
        return Accno;
    }

    public void setAccno(int accno) {
        Accno = accno;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }



    @Override
    public String toString() {
        return "     " +
                 id +
                "        | " + name  +
                "         | " + Accno +
                "          | " + pin +
                "       | " + balance;
    }
}
