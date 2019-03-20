package at.nacs.drhouseadmission.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Patient {
    private String id;
    private String name;
    private String symptoms;
}
