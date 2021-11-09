package funtionalinterface;

import java.util.function.Predicate;

/**
 * Created by suprememajor on the 11/9/21
 */
public class _Predicate {
    public static void main(String[] args) {
        System.out.println("Without predicate");
        System.out.println(isPhoneNumberValid("673339288"));
        System.out.println(isPhoneNumberValid("273339288"));
        System.out.println(isPhoneNumberValid("6733392898"));

        System.out.println("With predicate");
        System.out.println(isPhoneNumberValidPredicate.test("673339288"));
        System.out.println(isPhoneNumberValidPredicate.test("273339288"));
        System.out.println(isPhoneNumberValidPredicate.test("6733392898"));
        System.out.println();
        System.out.println();
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("673339288"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("273339288"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("674449288"));
        System.out.println(isPhoneNumberValidPredicate.or(containsNumber3).test("273339288"));
        System.out.println(isPhoneNumberValidPredicate.or(containsNumber3).test("674449288"));
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("6") && phoneNumber.length() == 9;

    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("6") && phoneNumber.length() == 9;
    }
}
