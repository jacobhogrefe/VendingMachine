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

        double price = 0;

        if (snackSelection.equalsIgnoreCase("doritos")) {
            price = doritos.getPrice();
        } else if (snackSelection.equalsIgnoreCase("skittles")) {
            price = skittles.getPrice();
        } else if (snackSelection.equalsIgnoreCase("pop tarts")) {
            price = popTarts.getPrice();
        } else if (snackSelection.equalsIgnoreCase("gatorade")) {
            price = gatorade.getPrice();
        } else if (snackSelection.equalsIgnoreCase("M&Ms")) {
            price = mms.getPrice();
        } else {
            System.out.println("Invalid Selection!");
        }

        System.out.println("Enter the amount of $1 bills you are using for this purchase: ");
        int payment = input.nextInt();
        double change = 0;

        if (payment > price)
        {
            change = payment - price;
        }

        System.out.printf("Change: %.2f", change);
    }
}
