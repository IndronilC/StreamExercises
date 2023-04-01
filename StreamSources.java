import org.indronil.example.User;

import java.util.stream.Stream;

public class StreamSources {

    public static Stream<String> streamOfNumberSources() {
        return Stream.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
    }

    public static Stream<Integer> initStreamOfNumbers() {
        return Stream.iterate(0, i-> i+2).limit(30);
    }

    public static Stream<User> streamOfUsers() {
        return Stream.of(
                new User(1, "Lionel Messi", "Argentina", "Football"),
                new User(2,"Virat Kohli", "Bharat", "Cricket"),
                new User(3, "Neymer", "Brazil", "Football"),
                new User(4, "Tiger Woods", "U.S.A", "Golf"),
                new User (5, "Sania Mirza", "Bharat", "Tennis")

        );
    }
}
