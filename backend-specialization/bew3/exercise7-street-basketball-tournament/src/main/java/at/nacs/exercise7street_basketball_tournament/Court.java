package at.nacs.exercise7street_basketball_tournament;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@RequiredArgsConstructor
public class Court {

    private final TeamLoader loader;
    private List<Team> getWinner = new ArrayList<>();
    Random random = new Random();

    public void play() {
        Queue<Team> team = loader.getTeam();
        while (team.size() != 1) {
            Team teamOne = team.poll();
            Team teamTwo = team.poll();
            System.out.println(teamOne + " plays vs " + teamTwo);
            getWinner.add(teamOne);
            getWinner.add(teamTwo);
            Team winnerTeam = getWinner.get(random.nextInt(getWinner.size()));
            team.offer(winnerTeam);
        }
        System.out.println("And " + team.poll() + " wins this match!");
    }
}

