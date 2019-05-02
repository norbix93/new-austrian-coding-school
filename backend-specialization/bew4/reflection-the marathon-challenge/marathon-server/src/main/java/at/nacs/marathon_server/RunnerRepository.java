package at.nacs.marathon_server;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class RunnerRepository {

    private Set<Runner> runners = new HashSet<>();

    public void add(Runner runner) {
        runners.add(runner);
    }

    public List<Runner> findAll() {
        return new ArrayList<>(runners);
    }

    public Optional<Runner> findFastest() {
        return runners.stream()
                .min(Comparator.comparing(Runner::getTime));
    }
}
