package controller;

import lombok.experimental.UtilityClass;
import model.Experiment;

import java.util.List;

@UtilityClass
public class OverallExperiment {

    public List<Experiment> perform(Integer numberOfExperiments) {
        return Scientist.createMultipleExperiments(numberOfExperiments);

    }
}
