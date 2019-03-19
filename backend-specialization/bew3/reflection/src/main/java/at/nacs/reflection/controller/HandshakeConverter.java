package at.nacs.reflection.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
@RequiredArgsConstructor
public class HandshakeConverter {

    private final HandshakeLoader loader;

    public List<String> convert(Integer input) {
        Map<Integer, String> handshakes = loader.createMapOfHandshakes();
        return Stream.of(String.valueOf(input).split(""))
                .map(Integer::valueOf)
                .filter(handshakes::containsKey)
                .map(handshakes::get)
                .collect(Collectors.toList());
    }
}

