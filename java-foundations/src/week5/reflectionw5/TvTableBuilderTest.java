package week5.reflectionw5;

import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;


class TvTableBuilderTest {

    TvTableBuilder tvTableBuilder = new TvTableBuilder();

    @org.junit.jupiter.api.Test
    void build() {
        List<String> building = tvTableBuilder.build();
        List listOfParts = Arrays.asList("leg", "leg", "leg", "leg", "shelf", "top");
        Assertions.assertEquals(building, listOfParts);

    }
}