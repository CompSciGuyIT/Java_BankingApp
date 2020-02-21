import java.util.ArrayList;

public class Branch {

    // Fields
    private String branchName;
    private ArrayList<Customer> customers;

    // Constructors
    public Branch(String branchName) {
        this.branchName = branchName;
        customers = new ArrayList<>();
    }

    // Getters & Setters
    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getBranchName() {
        return branchName;
    }

    // Methods
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addTransaction(Customer customer, Double transaction) {
        if (customers.contains(customer)) {
            for (Customer c : customers) {
                if (c.getName().equals(customer.getName())) {
                    c.addTransaction(transaction);

                    return;
                }
            }
        }

        System.out.println("Customer not found!");
    }
}
