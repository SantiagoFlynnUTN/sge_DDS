import java.util.Date;

public class Admin extends User {

    private Date signDate;
    private int idNumber;

    public Date getSignDate() {
        return signDate;
    }
    public void setSignDate(Date d) {
        this.signDate = d;
    }

    public int getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(int id) { this.idNumber = id; }
}
