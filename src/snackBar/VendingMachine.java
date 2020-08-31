package snackBar;

public class VendingMachine {
    //fields
    private static int maxId = 0;
    private int id;
    private String name;

    //constructor
    public VendingMachine(String name){
        maxId++;
        id = maxId;

        this.name = name;
    }

    //methods
    //getters
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    //setters
    public void setName(String name){
        this.name = name;
    }
    
}