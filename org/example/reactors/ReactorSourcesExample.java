package org.example.reactors;

import java.io.IOException;

public class ReactorSourcesExample {
    public static void main(String [] args) throws IOException
        {
        ReactorSources.getNumbersInFlux().subscribe(e -> System.out.println(e));
        System.out.println("Press a key to end the program");
        System.in.read();
    }
}
