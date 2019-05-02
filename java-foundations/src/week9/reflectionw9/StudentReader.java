package week9.reflectionw9;

import week9.exercise2.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class StudentReader {

    private FileReader reader = new FileReader();

    public List<Student> getStudents(String filePath) {
        return reader.asStream("week9/reflectionw9/students-performance.csv")
                .skip(1)
                .map(line -> line.split(";"))
                .map(columns -> new Student(columns[0], columns[1],
                        Integer.valueOf(columns[2]), Integer.valueOf(columns[3]), Integer.valueOf(columns[4])))
                .collect(Collectors.toList());
    }
}
