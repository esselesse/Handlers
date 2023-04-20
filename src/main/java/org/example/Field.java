package org.example;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Field {
    private String name;
    private String label;
    private String widget;
    private Boolean isRequired;
    private Boolean disabled;
    private List<String> validators;
}
