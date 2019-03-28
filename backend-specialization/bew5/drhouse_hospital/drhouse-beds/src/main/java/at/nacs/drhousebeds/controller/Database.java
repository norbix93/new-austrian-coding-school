package at.nacs.drhousebeds.controller;

import at.nacs.drhousebeds.persistence.Disease;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@ConfigurationProperties("dataset")
@Getter
@Setter
public class Database {
    private List<Disease> diseases;

    public Map<String, String> loadContent() {
        return diseases.stream()
                .collect(Collectors.toMap(Disease::getCondition, Disease::getTreatment));
    }
}
