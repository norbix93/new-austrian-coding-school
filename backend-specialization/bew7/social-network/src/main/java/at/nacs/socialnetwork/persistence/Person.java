package at.nacs.socialnetwork.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Entity
@EqualsAndHashCode(exclude = "friends")
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String name;

    @ManyToMany(fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Person> friends = new ArrayList<>();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", friends=" +
                friends.stream()
                        .map(e -> e.getName() + "," + e.getId())
                        .collect(Collectors.joining(","))
                + '}';
    }
}
