package lanzallamas.users;

public class UserInfo {
    private final String name;
    private final String lastName;
    private String address;

    public UserInfo(String name, String lastName, String address){
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

}
