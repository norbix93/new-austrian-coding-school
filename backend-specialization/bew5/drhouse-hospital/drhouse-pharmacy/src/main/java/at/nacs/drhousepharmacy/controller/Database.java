package at.nacs.drhousepharmacy.controller;

import at.nacs.drhousepharmacy.configuration.PharmacyConfiguration;
import at.nacs.drhousepharmacy.persistence.Disease;
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
    private final PharmacyConfiguration configuration;

    public Map<String, String> loadContent() {
        return configuration.getDiseases().stream()
                .collect(Collectors.toMap(Disease::getCondition, Disease::getTreatment));
    }
}
