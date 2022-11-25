import javax.swing.*;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Client client = new Client("John Doe");

        Account ca = new CheckingAccount(client);
        Account sa = new SavingAccount(client);

        BigDecimal depositOp = new BigDecimal(JOptionPane.showInputDialog("How much do you want to deposit? "));
        BigDecimal transferOp = new BigDecimal(JOptionPane.showInputDialog("How much do you want to transfer? "));
        BigDecimal withDrawOp = new BigDecimal(JOptionPane.showInputDialog("How much do you want to withdraw? "));

        ca.deposit(depositOp);
        ca.transfer(transferOp, sa);
        sa.withdraw(withDrawOp);

        ca.printExtract();
        sa.printExtract();
    }

}