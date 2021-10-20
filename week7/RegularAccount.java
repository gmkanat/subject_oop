import java.math.BigDecimal;
import java.util.List;

public class RegularAccount extends Account {
    public RegularAccount(String number, String status, Client owner, BigDecimal balance) {
        super(number, status, owner, balance);
    }

    @Override
    public void debit(BigDecimal amount) throws IllegalAccessException {
        BigDecimal newBalance = getterBalance().subtract(amount);
        if(newBalance.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalAccessException("NO money!");
        }
        newBalance = newBalance.subtract(new BigDecimal("30.00"));
        setBalance(newBalance);
        getOperations().add("Debit " + amount.toString() + " and commission is 30 tenge.");
        optIndex++;
    }
}