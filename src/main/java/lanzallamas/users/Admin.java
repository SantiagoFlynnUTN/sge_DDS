package lanzallamas.users;

import lanzallamas.users.login.LoginInfo;

import java.time.LocalDate;

public class Admin extends User {

    private final LocalDate signDate;
    private final int idNumber;

    public Admin(UserInfo userInfo, LoginInfo loginInfo, LocalDate signDate, int idNumber) {
        super(userInfo, loginInfo);
        this.signDate = signDate;
        this.idNumber = idNumber;
    }
}
