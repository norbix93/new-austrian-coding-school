package week1;

import java.util.ArrayList;
import java.util.List;

public class PleaseNoAdvertisement {

    public static void main(String[] arg) {


        List<String> words = new ArrayList();
        words.add("PLEASE");
        words.add("NO");
        words.add("ADVERTISEMENT");
        words.replaceAll(String::toLowerCase);
        System.out.println(words);

    }
}
