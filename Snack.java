public class Snack 
{
    private String snackName;
    private double snackPrice;
    
    public Snack(String snackName, double snackPrice)
    {
        this.snackName = snackName;
        this.snackPrice = snackPrice;
    }

    public String getName()
    {
        return snackName;
    }    

    public double getPrice()
    {
        return snackPrice;
    }
}