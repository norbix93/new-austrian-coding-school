package at.nacs.drhousebeds.controller;

import at.nacs.drhousebeds.configuration.BedsConfiguration;
import at.nacs.drhousebeds.persistence.Disease;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.stream.Collectors;

@Component
@Getter
@Setter
@RequiredArgsConstructor
public class Database {
    private final BedsConfiguration configuration;

    public Map<String, String> loadContent() {
        return configuration.getDiseases().stream()
                .collect(Collectors.toMap(Disease::getCondition, Disease::getTreatment));
    }
}
