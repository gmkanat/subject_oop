public class Client {
    private String name;
    private String phone;
    private String ID;

    public Client(String name, String phone, String ID) {
        this.name = name;
        this.phone = phone;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
