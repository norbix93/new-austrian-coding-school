package at.nacs.drhousehospitalui.view.model;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Patient {

    @NotEmpty
    private String name;

    @NotEmpty
    private String symptoms;

}