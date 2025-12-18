public class Transactions {
    private int TransID;
    private String TransDescription;
    private String Type;
    private int Amount;
    private int userID;

    public Transactions(int TransID, String TransDescription, String Type, int Amount,int userID) {
        this.TransID = TransID;
        this.TransDescription = TransDescription;
        this.Type = Type;
        this.Amount = Amount;
        this.userID=userID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getTransID() {
        return TransID;
    }

    public void setTransID(int transID) {
        TransID = transID;
    }

    public String getTransDescription() {
        return TransDescription;
    }

    public void setTransDescription(String transDescription) {
        TransDescription = transDescription;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    @Override
    public String toString() {
        return
                "  " + TransID +
                "   |  " + TransDescription +
                "   |  " + Type +
                "   |  " + Amount ;
    }
}
