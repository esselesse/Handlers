package org.example;

import java.util.Map;
import java.util.Map.Entry;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AnswerHandler {
  private final FieldMapper fieldMapper;

  public void handle(Map<String, String> answer) {

    for (Entry entry: answer.entrySet()) {
      String value = (String) entry.getValue();
      Validators.runValidation(value, fieldMapper.findByName((String)entry.getKey()));
      //...
    }
  }
}
