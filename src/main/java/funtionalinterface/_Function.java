package funtionalinterface;

import java.util.function.Function;

/**
 * Created by suprememajor on the 11/9/21
 */
public class _Function {
    public static void main(String[] args) {
        int increment = increment(0);
        System.out.println(increment);
        Integer integer = incrementByOneFunction.apply(3);
        System.out.println(integer);
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static int increment(int number) {
        return number + 1;
    }
}
