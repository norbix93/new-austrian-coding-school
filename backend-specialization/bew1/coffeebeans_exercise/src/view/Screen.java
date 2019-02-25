package view;

import controller.OverallExperiment;
import controller.Statistician;
import lombok.experimental.UtilityClass;
import model.Experiment;

import java.util.List;


@UtilityClass
public class Screen {

    public static void display() {
        Integer numberOfExperiments = 5;
        List<Experiment> experiments = OverallExperiment.perform(numberOfExperiments);
        experiments.stream()
                .forEach(experiment -> System.out.println(experiment));

        System.out.println("Total number of black beans: " +
                Statistician.getTotalNumberOfBlackBeans(experiments));
        System.out.println("Total number of white beans: " +
                Statistician.getTotalNumberOfWhiteBeans(experiments));
        System.out.println("Total number of black beans as last: " +
                Statistician.getTotalNumberOfBlackAsLast(experiments));
        System.out.println("Total number of white beans as last: " +
                Statistician.getTotalNumberOfWhiteAsLast(experiments));
        System.out.println("Total number of experiments: " + numberOfExperiments);
    }
}
