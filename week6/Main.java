import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        Client client_1 = new Client("Kanat", "8705 111 2322", "001");
        Client client_2 = new Client("Erzhan", "9234 222 2332", "002");
        Client client_3 = new Client("Almas", "9234 333 2332", "003");
        Client client_4 = new Client("Zhandos", "9234 444 2332", "004");

        BankAccount account_1 = new BankAccount("11", "active", client_1);
        BankAccount account_2 = new BankAccount("22", "active", client_1);
        BankAccount account_3 = new BankAccount("33", "active", client_2);
        BankAccount account_4 = new BankAccount("44", "active", client_2);
        BankAccount account_5 = new BankAccount("55", "active", client_3);
        BankAccount account_6 = new BankAccount("66", "active", client_4);
        BankAccount account_7 = new BankAccount("77", "active", client_4);

        List<Client> clients = new ArrayList<>();
        List<BankAccount> accounts = new ArrayList<>();
        Bank bank = new Bank(clients, accounts, "Kanat company");

        bank.createClient(client_1);
        bank.createClient(client_2);
        bank.createClient(client_3);
        bank.createClient(client_4);

        bank.createAccount(account_1);
        bank.createAccount(account_2);
        bank.createAccount(account_3);
        bank.createAccount(account_4);
        bank.createAccount(account_5);
        bank.createAccount(account_6);
        bank.createAccount(account_7);

        bank.Count();
        System.out.println(bank.makeReport());
    }
}