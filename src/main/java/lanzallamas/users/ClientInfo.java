package lanzallamas.users;

import lanzallamas.users.documents.Document;

import java.time.LocalDate;

public class ClientInfo {
    private final Document document;
    private String phone;
    private final LocalDate signDate;

    public ClientInfo(Document document, String phone, LocalDate signDate){
        this.document = document;
        this.phone = phone;
        this.signDate = signDate;
    }
}
