package funtionalinterface;

import java.util.function.Consumer;

/**
 * Created by suprememajor on the 11/9/21
 */
public class _Consumer {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "673578333");
        //Normal Java function
        greetCustomer(maria);

        //Consumer Functional interface
        greetCustomerConsumer.accept(maria);
    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneNumber);
    }

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneNumber);

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
