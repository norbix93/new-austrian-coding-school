package week2.exercise1;


public class Article {

    public Article(){}

    private String title;
    private String text;

    public Article(String title, String text) {
            this.text = text;
            this.title = title;

    }

    public String getTitle(){
        return title;
    }

    public String getText() {
        return text;
    }
}