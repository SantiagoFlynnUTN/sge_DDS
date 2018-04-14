package lanzallamas.users;

import lanzallamas.users.categories.Category;
import lanzallamas.users.login.LoginInfo;

public class Client extends User {
    private final ClientInfo clientInfo;
    private Category category;

    public Client(UserInfo userInfo, LoginInfo loginInfo, ClientInfo clientInfo, Category category) {
        super(userInfo, loginInfo);
        this.clientInfo = clientInfo;
        this.category = category;
    }

    public boolean hasOnDevices() {

        return true;
    }

    public int numberOnDevices() {

        return 0;
    }

    public int numberOffDevices() {

        return 0;
    }

    public int howManyDevices() {

        return 0;
    }
}