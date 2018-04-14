package lanzallamas.users.login;

public class LoginInfo {
    private final String userName;
    private String password;

    public LoginInfo(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
}
