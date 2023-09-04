package flatMap1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatMapExample {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Alice", Arrays.asList("Reading", "Cooking")),
                new Person("Bob", Arrays.asList("Sports", "Music")),
                new Person("Charlie", Arrays.asList("Painting", "Cooking"))
        );

        List<String> uniqueHobbies = persons.stream()
                .flatMap(person -> person.getHobbies().stream()) // Flattens the list of hobbies
                .distinct() // Removes duplicates
                .collect(Collectors.toList()); // Collects into a list

        System.out.println(uniqueHobbies);
    }
}

