package controller.Bean;

import lombok.experimental.UtilityClass;
import model.Bean;

import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public class Counter {

    public Integer getNumberOfWhiteBeans(List<Bean> can) {
        return can.stream()
                .filter(bean -> bean.getColour().equals("white"))
                .collect(Collectors.toList()).size();
    }

    public Integer getNumberOfBlackBeans(List<Bean> can) {
        return can.stream()
                .filter(bean -> bean.getColour().equals("black"))
                .collect(Collectors.toList()).size();
    }
}
