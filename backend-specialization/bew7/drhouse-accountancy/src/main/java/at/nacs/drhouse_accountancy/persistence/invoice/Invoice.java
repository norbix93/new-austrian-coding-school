package at.nacs.drhouse_accountancy.persistence.invoice;

import at.nacs.drhouse_accountancy.persistence.Kind;
import at.nacs.drhouse_accountancy.persistence.patient.Patient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;

import javax.persistence.*;
import java.time.LocalDateTime;

import static org.hibernate.annotations.NotFoundAction.IGNORE;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @NotFound(action = IGNORE)
    private Patient patient;

    @Enumerated(EnumType.STRING)
    private Kind kind;

    private String symptoms;

    private String diagnosis;

    private String provided;

    private double cost;

    private boolean paid;

    private LocalDateTime timestamp;
}

