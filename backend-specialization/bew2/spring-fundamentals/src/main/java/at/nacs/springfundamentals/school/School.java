package at.nacs.springfundamentals.school;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class School {

    private final List<Child> children;

    public School(List<Child> children) {
        this.children = children;
    }

    public List<Child> getChildren() {
        return children;
    }

}
