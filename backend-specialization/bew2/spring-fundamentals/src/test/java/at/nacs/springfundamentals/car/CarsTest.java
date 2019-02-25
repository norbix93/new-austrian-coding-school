package at.nacs.springfundamentals.car;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CarsTest {

    @Autowired
    Car car;

    @Autowired
    Ashkan ashkan;

    @Autowired
    Hosam hosam;

    @Test
    void testHaveTheSameCar() {
        // as a singleton car

//        String expected = car.getColor();
//
//        assertEquals(expected, ashkan.getCarColor());
//        assertEquals(expected, hosam.getCarColor());
//
//        System.out.println("Car color: " + car.getColor());
//
//        ashkan.setCarColor("Red");
//        expected = "Red";
//        assertEquals(expected, ashkan.getCarColor());
//        assertEquals(expected, hosam.getCarColor());
//
//        expected = "Black";
//        hosam.setCarColor(expected);
//        assertEquals(expected, ashkan.getCarColor());
//        assertEquals(expected, hosam.getCarColor());

        // as a prototype car

        System.out.println("Test's car: " + car.getColor());
        System.out.println("Ashkan's car: " + ashkan.getCarColor());
        System.out.println("Hosam's car: " + hosam.getCarColor());

        System.out.println(hosam.getClass().getSimpleName());
    }

}