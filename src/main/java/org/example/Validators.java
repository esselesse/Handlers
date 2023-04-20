package org.example;

public enum Validators {
  STRING_VALIDATOR() {
    @Override
    public void validate(String value) {
      if (value.isBlank())
        throw new RuntimeException();
    }
  },
  EMAIL_VALIDATOR() {
    @Override
    public void validate(String value) {
      if (!value.contains("@"))
        throw new RuntimeException();
    }
  };

  public abstract void validate(String value);

  public static void runValidation(String value, Field field) {
    for (String s : field.getValidators()) {
      Validators.valueOf(s).validate(value);
    }
  }
}
