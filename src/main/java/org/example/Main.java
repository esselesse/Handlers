package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

  static TextFieldMapper mapper = new TextFieldMapper();

  public static void main(String[] args) throws IOException {
    parseJson();
    System.out.println();
    System.out.println("-------------------------------------------------");
    getAnswers();
  }

  private static void getAnswers() {
    Map<String, String> mapp = Map.of("first_name", "abc", "last_name", "");
    AnswerHandler answerHandler = new AnswerHandler(mapper);
    answerHandler.handle(mapp);
    System.out.println(mapp);
  }

  private static void parseJson() throws IOException {
    System.out.println("-------------------------------------------------");
    String fileName = "src/main/resources/input.json";
    String content = Files.lines(Paths.get(fileName)).reduce("", String::concat);
    System.out.println(content);
    System.out.println("--------------------------");
    mapper.mapJson(content);
  }
}