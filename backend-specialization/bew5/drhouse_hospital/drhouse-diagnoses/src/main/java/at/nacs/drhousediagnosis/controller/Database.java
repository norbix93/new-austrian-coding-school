package at.nacs.drhousediagnosis.controller;

import at.nacs.drhousediagnosis.model.Disease;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@ConfigurationProperties("database")
@Getter
@Setter
public class Database {

    private List<Disease> disease;

    public Map<String, String> loadContent() {
        return disease.stream()
                .collect(Collectors.toMap(Disease::getSymptoms, Disease::getCondition));
    }
}
