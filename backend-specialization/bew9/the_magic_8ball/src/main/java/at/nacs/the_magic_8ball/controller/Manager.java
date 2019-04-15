package at.nacs.the_magic_8ball.controller;

import at.nacs.the_magic_8ball.model.Message;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
@ConfigurationProperties("list")
public class Manager {

    @Setter
    private List<Message> messages;

    public Message display() {
        Random random = new Random();
        int size = messages.size();
        int randomValue = random.nextInt(size);
        return messages.get(randomValue);
    }
}