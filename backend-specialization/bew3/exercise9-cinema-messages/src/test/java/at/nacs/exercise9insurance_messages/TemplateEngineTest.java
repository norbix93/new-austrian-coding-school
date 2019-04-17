//package at.nacs.exercise9insurance_messages;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.Arrays;
//import java.util.List;
//
//@SpringBootTest
//class TemplateEngineTest {
//
//    @Autowired
//    TemplateEngine engine;
//
//    @ParameterizedTest
//    @CsvSource({
//            "Good Day Mr. Molnar, don’t forget our 20% discount on tickets this Friday!",
//            "Dear Ms. Toth, you and your friends will have so much fun at the cinema this Friday with a 20% discount!",
//            "My dearest Mr. Threepwood, your lovely family gives you a 20% discount on tickets this Friday!",
//    })
//    void getMessage(String message) {
//        List<Customer> examples = Arrays.asList(Customer.builder().name("Mr. Molnar").build(),
//                Customer.builder().name("Ms. Toth").build(),
//                Customer.builder().name("Mr. Threepwood").build());
//        Assertions.assertEquals(engine.getMessage(examples),);
//
//
//    }
//}