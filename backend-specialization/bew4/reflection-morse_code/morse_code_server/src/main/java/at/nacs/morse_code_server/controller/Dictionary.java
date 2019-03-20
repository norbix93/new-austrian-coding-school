package at.nacs.morse_code_server.controller;

import at.nacs.morse_code_server.model.Entry;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@ConfigurationProperties("list")
@Getter
@Setter
public class Dictionary {
    private List<Entry> entry;

    public Map<String, String> createMap() {
        return entry.stream()
                .collect(Collectors.toMap(Entry::getSymbol, Entry::getCode));
    }
}
