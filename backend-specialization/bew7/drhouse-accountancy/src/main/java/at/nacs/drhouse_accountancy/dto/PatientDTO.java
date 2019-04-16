package at.nacs.drhouse_accountancy.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PatientDTO {

    private String id;
    private String name;
    private String symptoms;
    private String diagnosis;
    private String treatment;
    private String medicine;
}
