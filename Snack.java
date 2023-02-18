public class Snack 
{
    private String snackName;
    private double snackPrice;
    private String exitMessage;
    
    public Snack(String snackName, double snackPrice, String exitMessage)
    {
        this.snackName = snackName;
        this.snackPrice = snackPrice;
        this.exitMessage = exitMessage;
    }

    public String getName()
    {
        return this.snackName;
    }    

    public double getPrice()
    {
        return this.snackPrice;
    }

    public String getExitMessage()
    {
        return this.exitMessage;
    }
}