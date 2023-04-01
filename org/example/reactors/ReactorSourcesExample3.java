package org.example.reactors;

import java.io.IOException;
import java.util.List;

public class ReactorSourcesExample3 {
    public static void main(String[] args) throws IOException {
        List<String> numbers = ReactorSources.getNumbersInFlux().toStream().toList();
        System.out.println("List: " + numbers);
        System.out.println("Size of the List: " + numbers.size());
        System.out.println("Press Any Key to finish the program");
        System.in.read();
    }
}
