package at.nacs.drhouseaccountant.communication;

import at.nacs.drhouseaccountant.dto.PatientDTO;
import at.nacs.drhouseaccountant.logic.Accountant;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/patients")
public class PatientsEndpoint {

    Accountant accountant;

    @PostMapping
    void post(@RequestBody PatientDTO patientDTO){
        accountant.save(patientDTO);
        accountant.calculateCost(patientDTO);
        accountant.createInvoice(patientDTO);
    }
}
