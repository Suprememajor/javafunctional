package streams;

import java.util.List;

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

        boolean allFemale = people.stream()
                .noneMatch(person -> NON_BINARY.equals(person.gender));
                //.allMatch(person -> FEMALE.equals(person.gender));
        System.out.println(allFemale);
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
