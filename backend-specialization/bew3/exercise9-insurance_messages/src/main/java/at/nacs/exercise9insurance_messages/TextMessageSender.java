package at.nacs.exercise9insurance_messages;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TextMessageSender {
    private final TemplateEngine engine;

    public void display() {
        System.out.println("\n Man template \n");
        engine.createManTemplate();

        System.out.println("\n Woman template \n");
        engine.createFemaleTemplate();

        System.out.println("\n Privileged template \n");
        engine.createPrivilegedTemplate();

        System.out.println("\n Default template \n");
        engine.createDefaultTemplate();
    }
}
