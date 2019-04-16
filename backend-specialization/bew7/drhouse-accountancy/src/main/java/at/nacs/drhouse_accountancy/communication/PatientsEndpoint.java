package at.nacs.drhouse_accountancy.communication;

import at.nacs.drhouse_accountancy.dto.PatientDTO;
import at.nacs.drhouse_accountancy.logic.Accountant;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/patients")
public class PatientsEndpoint {

    private final Accountant accountant;

    @PostMapping
    void post(@RequestBody PatientDTO patientDTO) {
        accountant.save(patientDTO);
        accountant.createInvoice(patientDTO);
    }
}
