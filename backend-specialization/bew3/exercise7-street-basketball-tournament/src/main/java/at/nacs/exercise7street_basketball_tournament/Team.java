package at.nacs.exercise7street_basketball_tournament;

import lombok.Data;

import java.util.List;

@Data
public class Team {

    private String name;
    private List<String> players;
}
