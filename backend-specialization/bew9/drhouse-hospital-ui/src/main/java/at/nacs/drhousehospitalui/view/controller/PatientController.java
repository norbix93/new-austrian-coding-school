package at.nacs.drhousehospitalui.view.controller;

import at.nacs.drhousehospitalui.communication.AdmissionClient;
import at.nacs.drhousehospitalui.view.model.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class PatientController {

    private final AdmissionClient client;

    @ModelAttribute("patient")
    Patient patient() {
        return new Patient();
    }

    @GetMapping
    String page() {
        return "admission";
    }

    @PostMapping
    String post(@Valid Patient patient, BindingResult result) {
        if (result.hasErrors()) {
            return page();
        }
        client.send(patient);
        return "redirect:/";
    }
}
