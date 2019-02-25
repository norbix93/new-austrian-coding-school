package controller;

import controller.Bean.Counter;
import controller.Bean.Filter;
import controller.Bean.Generator;
import lombok.experimental.UtilityClass;
import model.Bean;
import model.Experiment;

import java.util.*;

@UtilityClass
public class Scientist {


    public Experiment createExperiment(int amountOfBeans) {
        List<Bean> can = new LinkedList<>();
        List<Bean> filledCan = Generator.fill(can, amountOfBeans);
        Queue<Bean> filledCanCopy = new LinkedList<>(filledCan);
        Integer numberOfWhiteBeans = Counter.getNumberOfWhiteBeans(filledCan);
        Double ratioOfWhiteBeans = Statistician.getPercentage
                (Double.valueOf(Counter.getNumberOfWhiteBeans(filledCan)), Double.valueOf(filledCan.size()));
        Integer numberOfBlackBeans = Counter.getNumberOfBlackBeans(filledCan);
        Double ratioOfBlackBeans = Statistician.getPercentage
                (Double.valueOf(Counter.getNumberOfBlackBeans(filledCan)), Double.valueOf(filledCan.size()));
        Bean lastBean = Filter.getLastBean(filledCanCopy);
        return Experiment.builder().numberOfWhiteBeans(numberOfWhiteBeans)
                .ratioOfWhiteBeans(ratioOfWhiteBeans)
                .numberOfBlackBeans(numberOfBlackBeans)
                .ratioOfBlackBeans(ratioOfBlackBeans)
                .lastBean(lastBean).build();
    }

    public List<Experiment> createMultipleExperiments(Integer amount) {
        Random random = new Random();
        Integer numberOfBeans = random.nextInt(1000);
        List<Experiment> finalList = new ArrayList<>();
        while (finalList.size() != amount) {
            finalList.add(createExperiment(numberOfBeans));
        }
        return finalList;
    }
}
