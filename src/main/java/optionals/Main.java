package optionals;

import java.util.Optional;

/**
 * Created by suprememajor on the 11/9/21
 */
public class Main {
    public static void main(String[] args) {
        Optional.ofNullable(null)
                .ifPresent(email -> System.out.println("Sendind email to " + email));
    }
}
