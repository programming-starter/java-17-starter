package me.parker;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TextBlocksTest {

/*
{
  "name": "parker",
  "age": 30,
  "job": "Programmer"
}
 */

    @Test
    void old_style() {
        var json = "{\n" +
                "  \"name\": \"parker\",\n" +
                "  \"age\": 30,\n" +
                "  \"job\": \"Programmer\"\n" +
                "}";

        System.out.println(json);
    }

    @Test
    void new_style() {
        var json =
                """
                {
                  "name": "parker",
                  "age": 30,
                  "job": "Programmer"
                }
                """;
        System.out.println(json);
    }

    @DisplayName("아래 쌍따옴표 3개의 끝 위치 차이에 따라 공백이 결정된다. 아래 코드 실행 결과를 보면 바로 이해할 수 있음.")
    @Test
    void new_style_how_to_make_space() {
        var json =
                    """
                {
                  "name": "parker",
                  "age": 30,
                  "job": "Programmer"
                }
                """;
        System.out.print(json);
        System.out.println("공백");
    }
}
