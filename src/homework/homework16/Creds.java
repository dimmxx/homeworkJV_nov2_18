package homework.homework16;

public class Creds {

    private String login;
    private String password;
    private String address;

    public Creds(){

    }

    public Creds(String login, String password, String address) {
        this.login = login;
        this.password = password;
        this.address = address;

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
