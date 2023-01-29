package me.parker;

import org.junit.jupiter.api.Test;

public class SwitchExpressionTest {
    enum Food {
        KIMCHI, BUL_GOGI, BIBIMBAP,
        SUSHI, RAMEN,
        PAD_THAI, NASI_GORENG
    }

    @Test
    void old_style() {
        Food food = Food.BUL_GOGI;
        switch (food) {
            case KIMCHI, BUL_GOGI, BIBIMBAP:
                System.out.println("Korea Food");
                break;
            case SUSHI, RAMEN:
                System.out.println("Japan Food");
                break;
            case PAD_THAI, NASI_GORENG:
                System.out.println("Thailand Food");
                break;
            default:
                System.out.println("I don't know");
        }
    }

    @Test
    void new_style() {
        Food food = Food.BUL_GOGI;
        switch (food) {
            case KIMCHI, BUL_GOGI, BIBIMBAP -> System.out.println("Korea Food");
            case SUSHI, RAMEN -> System.out.println("Japan Food");
            case PAD_THAI, NASI_GORENG -> System.out.println("Thailand Food");
            default -> System.out.println("I don't know");
        }
    }

    @Test
    void new_style_return() {
        Food food = Food.BUL_GOGI;
        String result = switch (food) {
            case KIMCHI, BUL_GOGI, BIBIMBAP -> "Korea Food";
            case SUSHI, RAMEN -> "Japan Food";
            case PAD_THAI, NASI_GORENG -> "Thailand Food";
            default -> "I don't know";
        };
        System.out.println(result);
    }

    @Test
    void new_style_multiple_login_in_case() {
        Food food = Food.BUL_GOGI;
        String result = switch (food) {
            case KIMCHI, BUL_GOGI, BIBIMBAP -> {
                System.out.println("current food: " + food);
                yield "Korea Food";
            }
            case SUSHI, RAMEN -> {
                System.out.println("current food: " + food);
                yield "Japan Food";
            }
            case PAD_THAI, NASI_GORENG -> {
                System.out.println("current food: " + food);
                yield "Thailand Food";
            }
            default -> {
                System.out.println("invalid food: " + food);
                yield "I don't know";
            }
        };
        System.out.println(result);
    }

    @Test
    void new_style_only_using_yield() {
        Food food = Food.BUL_GOGI;
        String result = switch (food) {
            case KIMCHI, BUL_GOGI, BIBIMBAP:
                yield "Korea Food";
            case SUSHI, RAMEN:
                yield "Japan Food";
            case PAD_THAI, NASI_GORENG:
                yield "Thailand Food";
            default:
                yield "I don't know";
        };
        System.out.println(result);
    }
}
