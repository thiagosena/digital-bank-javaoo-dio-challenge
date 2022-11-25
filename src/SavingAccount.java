public class SavingAccount extends Account {

    public SavingAccount(Client client) {
        super(client);
    }

    @Override
    public void printExtract() {
        System.out.println("=== Saving Account Extract ===");
        super.printAccountInfo();
    }
}