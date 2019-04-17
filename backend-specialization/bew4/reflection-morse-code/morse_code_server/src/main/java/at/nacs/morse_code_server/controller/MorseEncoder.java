package at.nacs.morse_code_server.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class MorseEncoder {

    private final Dictionary dictionary;

    public String translate(String message) {
        Map<String, String> entries = dictionary.createMap();
        return Stream.of(message.split(""))
                .filter(e -> !e.equals(" "))
                .filter(entries::containsKey)
                .map(e -> e.toLowerCase())
                .map(entries::get)
                .collect(Collectors.joining());
    }
}
