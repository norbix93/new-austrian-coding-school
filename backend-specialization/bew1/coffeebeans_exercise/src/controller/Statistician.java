package controller;

import lombok.experimental.UtilityClass;
import model.Experiment;

import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public class Statistician {

    public Double getPercentage(Double dividend, Double divisor) {
        return (dividend * 100) / divisor;

    }

    public Integer getTotalNumberOfBlackBeans(List<Experiment> experiments) {
        return experiments.stream()
                .collect(Collectors.summingInt(Experiment::getNumberOfBlackBeans));
    }

    public Integer getTotalNumberOfWhiteBeans(List<Experiment> experiments) {
        return experiments.stream()
                .collect(Collectors.summingInt(Experiment::getNumberOfWhiteBeans));
    }

    public Integer getTotalNumberOfBlackAsLast(List<Experiment> experiments) {
        Integer appearanceTimes = 0;
        for (Experiment experiment : experiments) {
            if (experiment.getLastBean().getColour().equals("black")) {
                appearanceTimes = appearanceTimes + 1;
            }

        }
        return appearanceTimes;
    }

    public Integer getTotalNumberOfWhiteAsLast(List<Experiment> experiments) {
        Integer appearanceTimes = 0;
        for (Experiment experiment : experiments) {
            if (experiment.getLastBean().getColour().equals("white")) {
                appearanceTimes = appearanceTimes + 1;
            }

        }
        return appearanceTimes;
    }

}
