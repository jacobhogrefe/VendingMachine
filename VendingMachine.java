import java.util.Scanner;

public class VendingMachine 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Snack chosenSnack = null;

        System.out.println("Welcome! Here is our snack selection!");
        System.out.println("--------------------------------------------");
        System.out.println("Doritos, Skittles, Pop Tarts, Gatorade, M&Ms");
        System.out.println("--------------------------------------------");
        System.out.println("Which snack would you like to purchase?");
        String snackSelection = input.nextLine();

        if (snackSelection.equalsIgnoreCase("doritos")) {
            chosenSnack = new Snack("Doritos", 1.25, "It's the erfect triangle snack!");
        } else if (snackSelection.equalsIgnoreCase("skittles")) {
            chosenSnack = new Snack("Skittles", 1.00, "Taste the rainbow!");
        } else if (snackSelection.equalsIgnoreCase("pop tarts")) {
            chosenSnack = new Snack("Pop Tarts", 2.00, "The greatest breakfast item!");
        } else if (snackSelection.equalsIgnoreCase("gatorade")) {
            chosenSnack = new Snack("Gatorade", 3.00, "Rehydrate!");
        } else if (snackSelection.equalsIgnoreCase("m&ms")) {
            chosenSnack = new Snack("M&Ms", 1, "Make every day a colorful one!");
        } else {
            System.out.println("Invalid Selection!");
            System.exit(0);
        }

        System.out.println(chosenSnack.getName() + " cost $" + chosenSnack.getPrice() + ".");
        System.out.println("Enter the amount of $1 bills you are using for this purchase: ");
        int payment = input.nextInt();
        double change = 0;
        double price = chosenSnack.getPrice();
        System.out.println("Confirmation: Type \"yes\" to confirm purchase.");
        System.out.println("All other responses will cancel the transaction.");
        //i really have no idea why there has to be a second nextLine() call, but in testing after inputting the amount of money it would just cancel the transaction
        String iHateTheScannerClass = input.nextLine();
        String confirmation = input.nextLine();

        if (iHateTheScannerClass.equalsIgnoreCase("yes")) {
            if (payment > price) {
                change = payment - price;
                System.out.printf("Change: %.2f", change);
            }
            chosenSnack.getExitMessage();
        } else {
            System.out.println("Transaction cancelled and money returned.");
            System.out.println("Have a wonderful day!");
        }

        input.close();
    }
}
