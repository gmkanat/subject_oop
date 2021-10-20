import java.util.List;

public class Bank {
    private List<Client> clients;
    private List<BankAccount> accounts;
    private String name;

    public Bank(List<Client> clients, List<BankAccount> accounts, String name) {
        this.clients = clients;
        this.accounts = accounts;
        this.name = name;
    }
    public void createAccount(BankAccount account){
        accounts.add(account);
    }
    public void createClient(Client client){
        clients.add(client);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private int countClient(){
        return clients.size();
    }
    private int countAccounts(){
        return accounts.size();
    }
    public String makeReport(){
        for(BankAccount account: accounts){
            for(Client client: clients){
                if(account.getOwner().getName().equals(client.getName())){
                    System.out.println(client.getName() + " has " + account.getNumber());
                }
            }
        }
        return "Report done";
    }
    public void Count(){
        System.out.println("Count of clients " + countClient());
        System.out.println("Count of accounts " + countAccounts());
    }
}
