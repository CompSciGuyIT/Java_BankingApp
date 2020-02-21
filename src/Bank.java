import java.util.ArrayList;

public class Bank {
    // Fields
    private ArrayList<Branch> branches;

    // Constructors
    public Bank() {
        branches = new ArrayList<>();
    }

    // Getters & Setters
    public ArrayList<Branch> getBranches() {
        return branches;
    }

    // Methods
    public void addBranch(Branch branch) {
        branches.add(branch);
    }

    public void addCustomer(Branch branch, Customer customer, double transaction) {

    }

    public void addTransaction(Branch branch, Customer customer, Double transaction) {
        if (branches.contains(branch)) {
            for (Branch b : branches) {
                if (b.getBranchName().equals(branch.getBranchName())) {
                    branch.addTransaction(customer, transaction);

                    return;
                }
            }
        }

        System.out.println("Branch not found!");
    }

    public void displayCustomers(Branch branch) {

    }

    public void displayTransactions(Branch branch, Customer customer) {

    }
}
