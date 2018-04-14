import java.util.Date;

public class Client extends User {

    private String docType;
    private String document;
    private int category;
    private String phone;
    private Date signDate;

    public String getDocType() {
        return docType;
    }
    public void setDocType(String t) {
        this.docType = t;
    }

    public String getDocument() {
        return document;
    }
    public void setDocument(String d) {
        this.document = d;
    }

    public int getCategory() {
        return category;
    }
    public void setCategory(int c) {
        this.category = c;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String p) {
        this.phone = p;
    }

    public Date getSignDate() {
        return signDate;
    }
    public void setSignDate(Date d) {
        this.signDate = d;
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