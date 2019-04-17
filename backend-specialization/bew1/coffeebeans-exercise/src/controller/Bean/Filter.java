package controller.Bean;

import lombok.experimental.UtilityClass;
import model.Bean;

import java.util.Queue;

@UtilityClass
public class Filter {

    public Bean getLastBean(Queue<Bean>can) {
        while (can.size() > 1) {
            Bean bean1 = can.poll();
            Bean bean2 = can.poll();
            String bean1Color = bean1.getColour();
            String bean2Color = bean2.getColour();
            if (!(bean1Color).equals(bean2Color)) {
                Bean newWhiteBean = Bean.builder().colour("white").build();
                can.offer(newWhiteBean);
            } else {
                Bean newBlackBean = Bean.builder().colour("black").build();
                can.offer(newBlackBean);
            }
        }
        return can.poll();
    }
}
