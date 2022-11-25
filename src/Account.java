import java.math.BigDecimal;

public abstract class Account implements IAccount {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int branch;
    protected int number;
    protected BigDecimal balance = BigDecimal.ZERO;
    protected Client client;

    Account(Client client) {
        this.branch = Account.AGENCIA_PADRAO;
        this.number = SEQUENCIAL++;
        this.client = client;
    }

    @Override
    public void withdraw(BigDecimal value) {
        balance = balance.subtract(value);
    }

    @Override
    public void deposit(BigDecimal value) {
        balance = balance.add(value);
    }

    @Override
    public void transfer(BigDecimal valor, IAccount destination) {
        this.withdraw(valor);
        destination.deposit(valor);
    }

    protected void printAccountInfo() {
        System.out.printf("Owner: %s%n", this.client.name());
        System.out.printf("Branch: %d%n", this.branch);
        System.out.printf("Number: %d%n", this.number);
        System.out.printf("Balance: %.2f%n", this.balance);
    }
}