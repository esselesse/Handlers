package org.example;

import kong.unirest.JsonObjectMapper;

public class TextFieldMapper extends FieldMapper {
  private final JsonObjectMapper mapper = new JsonObjectMapper();

  public void mapJson(String json) {
    this.addFields(mapper.readValue(json, TextField[].class));
  }
}
