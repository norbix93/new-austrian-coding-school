package at.nacs.marathon_server;

import lombok.Data;

import java.time.Duration;

@Data
public class Runner {
    private String name;
    private Duration time;

}
