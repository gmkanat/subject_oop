import java.math.BigDecimal;
import java.util.List;

public class PremiumAccount extends Account{
    public PremiumAccount(String number, String status, Client owner, BigDecimal balance) {
        super(number, status, owner, balance);
    }

    @Override
    public void debit(BigDecimal amount) throws IllegalAccessException {
        BigDecimal newBalance = getterBalance().subtract(amount);
        if(newBalance.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalAccessException("NO money!");
        }
        newBalance = newBalance.add(new BigDecimal("150.00"));
        setBalance(newBalance);
        getOperations().add("Debit " + amount.toString() + " and cashback is 150 tenge.");
        setOptIndex(getOptIndex() + 1);
    }
    @Override
    public void paymentForService(){
        BigDecimal newBalance = getterBalance().subtract(new BigDecimal("4000.00"));
        setBalance(newBalance);
        getOperations().add("Payment for service: 4000");
        setOptIndex(getOptIndex() + 1);
    }
    @Override
    public String getBalance() {
        return balanceBuilder();
    }
    protected String balanceBuilder(){
        return "Premuim User " + getOwner().getName() + " has " + getterBalance().toString() + " tenge";
    }
}
