package at.nacs.exercise9insurance_messages;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TextMessageSender {
    private final TemplateEngine engine;

    public void display() {
        System.out.println(engine.createTemplate());
    }
}
