package snackBar;

public class Snack {
    //fields
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId; 

    //constructor
    public Snack(String name, int quantity, double cost, int vendingMachineId){
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }
 

    //getters
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getCost(){
        return cost;
    }
    public int getVendingMachineId(){
        return vendingMachineId;
    }
    public int getQuantity(){
        return quantity;
    }
  

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
    public void setVendingMachineId(int vendingMachineId){
        this.vendingMachineId = vendingMachineId;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    //methods

    //add quantity when given how many to add
    public int getAdd( int quant, int add){
        return quant + add;
    }
    //buy snack when given how many to buy
    public int getSnack(int howMany, double cost){
        return(int) cost * howMany;
    }
    //get total cost given a quantity
    public double getTotal(double cost, int quant){
        return  (double) cost * quant;
    }

    @Override
    public String toString(){
        String rtnStr = 
        "Snack: " + name + "\n" + 
        "Vending Machine:" + vendingMachineId + "\n" + 
        "Quantity:" + quantity + "\n" + 
        "Total Cost: $" + getTotal(getCost(), getQuantity());
  
        return rtnStr;
    }

    
}