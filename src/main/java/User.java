import java.util.Date;

public class User {

    private String name;
    private String lastName;
    private String userName;
    private String password;
    private Date signDate;

    public String getName() {
        return name;
    }
    public void setName(String n) {
        this.name = n;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String l) {
        this.lastName = l;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String u) {
        this.userName = u;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String p) {
        this.password = p;
    }

    public String getSignDate() {
        return userName;
    }
    public void setSignDate(Date d) {
        this.signDate = d;
    }

    private void signIn() {}

}