package at.nacs.drhousebeds.persistence;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Patient {

    private String id;
    private String name;
    private String symptoms;
    private String diagnosis;
    private String treatment;
}
