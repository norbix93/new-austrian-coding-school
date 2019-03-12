package at.nacs.reflection.controller;

import at.nacs.reflection.model.Handshake;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@ConfigurationProperties("list")
@Getter
@Setter
public class HandshakeLoader {

    private List<Handshake> handshake;

    public Map<Integer, String> createMapOfHandshakes() {
        return handshake.stream()
                .collect(Collectors.toMap(Handshake::getNumber, Handshake::getMeaning));
    }
}
