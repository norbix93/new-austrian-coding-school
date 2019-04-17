package at.nacs.drhouse_accountancy.communication;

import at.nacs.drhouse_accountancy.dto.PatientDTO;
import at.nacs.drhouse_accountancy.logic.Accountant;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/patients")
public class PatientsEndpoint {

    private final Accountant accountant;

    @PostMapping
    void post(@RequestBody PatientDTO patientDTO) {
        accountant.invoice(patientDTO);
    }
}
