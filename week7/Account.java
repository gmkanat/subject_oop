import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Account {
    private String number;
    private String status;
    private Client owner;
    private BigDecimal balance;
    private List<String> operations;
    int optIndex;

    public Account(String number, String status, Client owner, BigDecimal balance) {
        this.number = number;
        this.status = status;
        this.owner = owner;
        this.balance = balance;
        this.operations = new ArrayList<>();
        this.optIndex = optIndex;
    }

    public String getNumber() {
        return number;
    }

    public List<String> getOperations() {
        return operations;
    }

    public String getStatus() {
        return status;
    }

    public Client getOwner() {
        return owner;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBalance() {
        return balanceBuilder();
    }
    protected String balanceBuilder(){
        return "User "  + getOwner().getName() + " has " + balance.toString() + " tenge";
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
    public BigDecimal getterBalance(){
        return balance;
    }

    public void credit(BigDecimal amount){
        balance = balance.add(amount);
        operations.add("Credit: " + amount.toString());
        optIndex++;
    }
    public void debit(BigDecimal amount) throws IllegalAccessException {
        BigDecimal newBalance = balance.subtract(amount);
        if(newBalance.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalAccessException("NO money!");
        }
        balance = newBalance;
        operations.add("Debit: " + amount.toString());
        optIndex++;
    }
    public void paymentForService(){
        BigDecimal newBalance = balance.subtract(new BigDecimal("2000.00"));
        balance = newBalance;
        operations.add("Payment for service: 2000");
        optIndex++;
    }
    public void getStatement(){
        System.out.println("Account statement: ");
        for(String operation: operations){
            if(operation != null) {
                System.out.println(operation);
            }
        }
        System.out.println("Current balance is " + balance);
    }
}


