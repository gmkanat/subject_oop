import java.math.BigDecimal;
import java.util.List;

public class PremiumAccount extends Account{
    public PremiumAccount(String number, String status, Client owner, BigDecimal balance) {
        super(number, status, owner, balance);
    }

    @Override
    public void debit(BigDecimal amount) throws IllegalAccessException {
        BigDecimal newBalance = balance.subtract(amount);
        if(newBalance.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalAccessException("NO money!");
        }
        newBalance = newBalance.add(new BigDecimal("150.00"));
        balance = newBalance;
        operations.add("Debit " + amount.toString() + " and cashback is 150 tenge.");
        optIndex++;
    }
    @Override
    public void paymentForService(){
        BigDecimal newBalance = balance.subtract(new BigDecimal("4000.00"));
        balance = newBalance;
        operations.add("Payment for service: 4000");
        optIndex++;
    }
    @Override
    public String getBalance() {
        return balanceBuilder();
    }
    protected String balanceBuilder(){
        return "Premuim User " + getOwner().getName() + " has " + balance.toString() + " tenge";
    }
}
