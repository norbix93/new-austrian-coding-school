package at.nacs.drhousehospitalui.communication;

import at.nacs.drhousehospitalui.view.model.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class AdmissionClient {
    private final RestTemplate restTemplate;

    @Value("${admission.url}")
    private String url;

    public Patient send(Patient patient) {
        return restTemplate.postForObject(url, patient, Patient.class);
    }

}

