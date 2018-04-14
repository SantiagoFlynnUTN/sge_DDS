package lanzallamas.users.documents;

public class Document {
    private final String number;
    private final DocumentType type;

    public Document(String number, DocumentType type){
        this.number = number;
        this.type = type;
    }
}
