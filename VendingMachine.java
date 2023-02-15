import java.util.Scanner;

public class VendingMachine 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Snack doritos = new Snack("Doritos", 1.25);
        Snack skittles = new Snack("Skittles", 1.00);
        Snack popTarts = new Snack("Pop Tarts", 2.00);
        Snack gatorade = new Snack("Gatorade", 3.00);
        Snack mms = new Snack("M&Ms", 1);

        System.out.println("Welcome! Here is our snack selection!");
        System.out.println("Doritos, Skittles, Pop Tarts, Gatorade, M&Ms");
        System.out.println("Which snack would you like to purchase?");
        String snackSelection = input.nextLine();

        if (snackSelection.equalsIgnoreCase("doritos")) {

        } else if (snackSelection.equalsIgnoreCase("skittles")) {

        } else if (snackSelection.equalsIgnoreCase("pop tarts")) {

        } else if (snackSelection.equalsIgnoreCase("gatorade")) {

        } else if (snackSelection.equalsIgnoreCase("M&Ms")) {
            
        } else {
            System.out.println("Invalid Selection!");
        }
    }
}
