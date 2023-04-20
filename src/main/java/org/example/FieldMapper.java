package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.Getter;

@Getter
public class FieldMapper {

  private final List<Field> fields = new ArrayList<>();

  public void addFields(Field[] newFields) {
    fields.addAll(Arrays.stream(newFields).toList());
  }

  public Field findByName(String name) {
    for(Field field: fields) {
      if (field.getName().equalsIgnoreCase(name)){
        return field;
      }
    }
    return null;
  }
}
