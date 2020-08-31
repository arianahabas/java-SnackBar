package snackBar;

public class Main {

    private static void workWithData() {
        // System.out.println("test");

        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        // String name, int quantity, double cost, int vendingMachineId
        Snack chips = new Snack("Chips", 36, 1.75, food.getId());
        Snack choco = new Snack("Chocolate Bar", 36, 1.00, food.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());
        Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
        Snack water = new Snack("Water", 20, 2.75, drink.getId());

        // PROBLEM 1: Customer 1 (Jane) buys 3 of snack 4 (Soda).
        jane.setCash(jane.buySnacks(3, soda.getCost(), jane.getCash()));
        // Print Customer 1 (Jane) Cash on hand.
        System.out.println("Customer " + jane.getName() + " has $" + jane.getCash() + " cash on hand.");
        // Print quantity of snack 4 (Soda).
        soda.setQuantity(soda.getQuantity()-3);
        System.out.println("Quantity of soda is " + soda.getQuantity());
        System.out.println("");

        //PROBLEM 2: Customer 1 (Jane) buys 1 of snack 3 (Pretzel).
        jane.setCash(jane.buySnacks(1, pretzel.getCost(), jane.getCash()));
        // Print Customer 1 (Jane) Cash on hand.
        System.out.println("Janes new cash is $ " + jane.getCash() + " and should be 35.75");
        // Print quantity of snack 3 (Pretzel).
        pretzel.setQuantity(pretzel.getQuantity() - 1);
        System.out.println("New quantity of pretzel is " + pretzel.getQuantity());
        System.out.println("");

        // PROBLEM 3: Customer 2 (Bob) buys 2 of snack 4 (Soda).
        bob.setCash(bob.buySnacks(2, soda.getCost(), bob.getCash()));
        // Print Customer 2 (Bob) Cash on Hand.
        System.out.println("Customer " + bob.getName() + " has $" + bob.getCash() + " cash on hand. (should be 28.14)");
        // Print quantity of snack 4 (Soda).
        soda.setQuantity(soda.getQuantity()-2);
        System.out.println("Quantity of soda should be 19, and is " + soda.getQuantity());
        System.out.println("");


        // PROBLEM 4: Customer 1 (Jane) finds $10.
        // Print Customer 1 (Jane) Cash on Hand.
        jane.setCash(jane.getCashOnHand(jane.getCash(), 10.00));
        System.out.println("Jane found money and now has $" + jane.getCash());
        System.out.println("");

        // PROBLEM 5: Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar).
        jane.setCash(jane.buySnacks(1, choco.getCost(), jane.getCash()));
        // Print Customer 1 (Jane) Cash on Hand.
        System.out.println("Customer " + jane.getName() + "  now has $" + jane.getCash() + " cash on hand.");
        // Print quantity of snack 2 (Chocolate Bar).
        choco.setQuantity(choco.getQuantity()-1);
        System.out.println("Quantity of choco should be 35, and is " + choco.getQuantity());
        System.out.println("");

        // PROBLEM 6: Add 12 more items to snack 3 (Pretzel).
        pretzel.setQuantity(pretzel.getAdd(pretzel.getQuantity(), 12));
        // Print quantity of snack 3 (Pretzel).
        System.out.println("# of pretzels is " + pretzel.getQuantity());
        System.out.println("");

        // PROBLEM 7: Customer 2 (Bob) buys 3 of snack 3 (Pretzel).
        bob.setCash(bob.buySnacks(3, pretzel.getCost(), bob.getCash()));
        // Print Customer 2 (Bob) Cash on hand.
        System.out.println("Customer " + bob.getName() + " has $" + bob.getCash() + " cash on hand.");
        // Print quantity of snack 3 (Pretzel).
        pretzel.setQuantity(pretzel.getQuantity()-3);
        System.out.println("Quantity of pretzel should be 38, and is " + pretzel.getQuantity());
        System.out.println("");
        
        //STRETCH 1 
        System.out.println(chips);
        System.out.println("");
        System.out.println(choco);
        System.out.println("");
        System.out.println(pretzel);
        System.out.println("");
        System.out.println(soda);
        System.out.println("");
        System.out.println(water);

        //STRETCH 2
        
    }

    public static void main(String[] args) {
        workWithData();
    }

}

// javac snackBar/*.java
// jar cvfe snackBar.jar snackBar.Main snackBar/*.class
// java -jar snackBar.jar
