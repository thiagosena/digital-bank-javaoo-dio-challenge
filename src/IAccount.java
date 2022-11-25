import java.math.BigDecimal;

public interface IAccount {

    void withdraw(BigDecimal value);

    void deposit(BigDecimal value);

    void transfer(BigDecimal value, IAccount destination);

    void printExtract();
}