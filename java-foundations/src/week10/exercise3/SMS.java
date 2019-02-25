package week10.exercise3;

public class SMS {

    private String sender;
    private String text;

    public SMS(String sender, String text) {
        this.sender = sender;
        this.text = text;
    }

    public String getSender() {
        return sender;
    }

    public String getText() {
        return text;
    }
}
