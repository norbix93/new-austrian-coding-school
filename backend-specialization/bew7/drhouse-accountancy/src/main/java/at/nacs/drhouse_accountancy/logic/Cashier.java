package at.nacs.drhouse_accountancy.logic;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ConfigurationProperties("dataset")
@RequiredArgsConstructor
public class Cashier {

    @Getter
    @Setter
    private Map<String, Double> prices;

    public Double calculatePrice(String input){
        return prices.get(input);
    }
}
