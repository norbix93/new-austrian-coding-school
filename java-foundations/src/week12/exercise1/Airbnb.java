package week12.exercise1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Airbnb {


    protected static Map<String, String[]> getCourseID() {
        Map<String, String[]> courseIds = new HashMap<>();
        courseIds.put("CSC300", new String[]{"CSC100", "CSC200"});
        courseIds.put("CSC200", new String[]{"CSC100"});
        courseIds.put("CSC100", new String[]{});
        return courseIds;
    }

    public static void main(String[] args) {
        System.out.println(sortCourseIDs(getCourseID()));

    }

    public static List<String> sortCourseIDs(Map<String, String[]> courseId) {
        return courseId.entrySet().stream()
                .map(e -> e.getKey())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

}
