import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) throws IllegalAccessException {

        Client client = new Client("Kanat", "8777 111 1213", "1");
        Client client1 = new Client("Almas", "8777 222 1213", "2");
        Client client2 = new Client("Zhandos", "8777 333 1213", "3");
        Client client3 = new Client("Erzhan", "8777 444 1213", "4");
        List<Client> clients = new ArrayList<>();
        List<Account> accounts = new ArrayList<>();
        Bank bank = new Bank(clients, accounts, "Kaspi KZ");

        // Simple user
        Account acc = new Account("111", "active", client, new BigDecimal("10000"));
        System.out.println(acc.balanceBuilder());
        acc.paymentForService();
        acc.debit(new BigDecimal("1000"));
        acc.getStatement();
        System.out.println();


        // Regular user
        Account reg = new RegularAccount("222", "active", client1, new BigDecimal("15000"));
        System.out.println(reg.balanceBuilder());
        reg.paymentForService();
        reg.debit(new BigDecimal("1000"));
        reg.getStatement();
        System.out.println();


        // Premium user
        Account prem_1 = new PremiumAccount("333", "active", client2, new BigDecimal("20000"));
        System.out.println(prem_1.balanceBuilder());
        prem_1.paymentForService();
        prem_1.debit(new BigDecimal("1000"));
        prem_1.getStatement();
        System.out.println();


        // Golden user
        Account gold_1 = new GoldenAccount("444", "active", client3, new BigDecimal("20000"));
        System.out.println(gold_1.balanceBuilder());
        gold_1.paymentForService();
        gold_1.debit(new BigDecimal("1000"));
        gold_1.debit(new BigDecimal("2000"));
        gold_1.debit(new BigDecimal("3000"));
        gold_1.credit(new BigDecimal("3000"));
        gold_1.getStatement();


    }
}

