package week9.exercise2;

public class NameApplication {

    public static void main(String[] args) {
        Name name = new Name();
        System.out.println(name.getNamesWithFourCharacters("week9/exercise2/names.txt"));
        System.out.println(name.getNamesWithM("week9/exercise2/names.txt"));
        System.out.println(name.getNamesWithEandR("week9/exercise2/names.txt"));
        System.out.println(name.getNamesWithAandM("week9/exercise2/names.txt"));
    }
}
