package streams;

import java.util.List;
import java.util.stream.Stream;

import static streams._Stream.Gender.*;

/**
 * Created by suprememajor on the 11/9/21
 */
public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Judy", NON_BINARY),
                new Person("Alice", FEMALE)
        );
//        people.stream()
                //.map(person -> person.gender)
//                .map(person -> person.name)
//                .mapToInt(String::length)
                //.collect(Collectors.toSet())
//                .forEach(System.out::println);

//        boolean allFemale = people.stream()//               .noneMatch(person -> NON_BINARY.equals(person.gender));
                //.allMatch(person -> FEMALE.equals(person.gender));
//        System.out.println(allFemale);

        //1. Integer Stream
        /*
        IntStream
                .range(1, 10)
                .forEach(System.out::println);
         */

        //2. Integer Stream with skip
        /*IntStream
                .range(1, 10)
                .skip(5)
                .forEach(System.out::print);
         */

        //3. Integer Stream with sum
        /*int sum = IntStream
                .range(1, 10)
                .sum();
        System.out.println(sum);?
         */

        //4. Stream of, sorted, findFirst
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;
        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE, NON_BINARY
    }
}
