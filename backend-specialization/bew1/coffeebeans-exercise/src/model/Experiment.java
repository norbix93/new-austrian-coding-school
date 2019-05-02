package model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Experiment {

    private Integer numberOfWhiteBeans;
    private Double ratioOfWhiteBeans;
    private Integer numberOfBlackBeans;
    private Double ratioOfBlackBeans;
    private Bean lastBean;

}
