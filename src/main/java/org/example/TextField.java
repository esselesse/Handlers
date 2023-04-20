package org.example;

import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TextField extends Field {
    public TextField() {
        super("",
            "",
            "textField",
            true,
            false,
            new ArrayList<>() // validators
            );
    }
}
