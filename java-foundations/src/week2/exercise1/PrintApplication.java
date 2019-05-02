package week2.exercise1;


public class PrintApplication {


    public static void main(String[] args) {

        Printer printer = new Printer();
        Article article = new Article("Adib and Norbert - ", "The students who learned Java.");
        printer.print(article);

    }
}
