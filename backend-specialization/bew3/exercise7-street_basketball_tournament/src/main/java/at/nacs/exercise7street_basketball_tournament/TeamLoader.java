package at.nacs.exercise7street_basketball_tournament;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Queue;

@Component
@ConfigurationProperties("stadion")
@Getter
@Setter
public class TeamLoader {

    private LinkedList<Team> team;
}
