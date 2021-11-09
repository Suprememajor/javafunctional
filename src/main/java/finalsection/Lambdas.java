package finalsection;

import java.util.function.Function;

/**
 * Created by suprememajor on the 11/9/21
 */
public class Lambdas {
    public static void main(String[] args) {
        Function<String, String> upperCaseName = name -> name.toUpperCase();
        Function<String, String> upperCaseName2 = String::toUpperCase;
        Function<String, String> upperCaseName3 = name -> {
            if (name.isBlank()) throw new IllegalArgumentException("");
            return name.toUpperCase();
        };
    }
}
