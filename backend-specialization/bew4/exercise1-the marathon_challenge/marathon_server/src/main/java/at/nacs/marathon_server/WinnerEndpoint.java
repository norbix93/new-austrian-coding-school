package at.nacs.marathon_server;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/winner")
@RequiredArgsConstructor
public class WinnerEndpoint {

    private final RunnerRepository runnerRepository;

    @GetMapping
    Optional<Runner> getWinner() {
        return runnerRepository.findFastest();
    }
}
