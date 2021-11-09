package combinatorpattern;

import java.time.LocalDate;

/**
 * Created by suprememajor on the 11/9/21
 */
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "673872299",
                LocalDate.of(2000, 1, 4)
        );

        //Using combinator pattern
        CustomerRegistrationValidator.ValidationResult result = CustomerRegistrationValidator
                .isEmailValid()
                .and(CustomerRegistrationValidator.isAdult())
                .and(CustomerRegistrationValidator.isPhoneNumberValid())
                .apply(customer);
        System.out.println(result);
    }
}
