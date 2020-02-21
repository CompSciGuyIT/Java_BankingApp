import java.util.ArrayList;

public class Customer {
    // Fields
    private String name;
    private double funds;
    private ArrayList<Double> transactions;

    // Constructors
    public Customer(String name, double transaction) {
        this.name = name;
        this.transactions = new ArrayList<>();
        this.transactions.add(transaction);
        funds = transaction;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    // Methods
    public void addTransaction(Double transaction) {
        if (transaction <= funds) {
            transactions.add(transaction);
            funds += transaction;
        } else {
            System.out.println("Insufficient funds!\nTransaction cancelled.");
        }
    }


}
