package snackBar;

public class Customer {
    //fields
    private static int maxId = 0;
    private int id;
    private String name;
    private double cash;
    //constructor
    public Customer(String name, double cash){
        maxId++;
        id=maxId;

        this.name = name;
        this.cash = cash;
    }
    
    //getters
    public String getName(){
        return name;
    }
    public double getCash(){
        return cash;
    }
    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setCash(double cash){
        this.cash = cash;
    }

     //methods
     //add cash to cash on hand
     public double getCashOnHand(double cash, double newCash){
         return cash + newCash;
     }
     //buy snacks.Given the total cost of the snacks to be purchased, reduce the cash on hand by that amount
     public double buySnacks(int quantity, double purchaseCost, double cash ){
        return cash - (purchaseCost * quantity);
     }
     
     @Override
     public String toString(){
         String rtnStr = "Customer name:" + " " + name + " has $" + cash;
         return rtnStr;
     }
}