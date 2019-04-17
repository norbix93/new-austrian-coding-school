package controller.Bean;

import model.Bean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FilterTest {
    @Test

    void checkSize(Integer actual,Integer expected){
        List<Bean> can = new ArrayList<>();
        List<Bean> beans = Generator.fill(can,100);
        Queue<Bean> finalCan = new LinkedList<>(can);
        List<Bean> lastBean = new ArrayList<>();
        lastBean.add(finalCan.poll());
        actual = lastBean.size();
        expected = 1;
        Assertions.assertEquals(actual,expected);
    }
}
