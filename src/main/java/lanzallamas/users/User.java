package lanzallamas.users;

import lanzallamas.users.login.LoginInfo;

public class User {
    private final UserInfo userInfo;
    private final LoginInfo loginInfo;

    public User(UserInfo userInfo, LoginInfo loginInfo){
        this.userInfo = userInfo;
        this.loginInfo = loginInfo;
    }

    private void signIn() {}

}
