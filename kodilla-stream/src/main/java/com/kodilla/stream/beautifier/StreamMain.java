package com.kodilla.stream.beautifier;


import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Krasnoludek", a -> "ABC" + a + "ABC");
        poemBeautifier.beautify("Krasnoludek", a -> toUpperCase(a));
        poemBeautifier.beautify("Krasnoludek", a -> "<" + a + "," + a + ">");
        poemBeautifier.beautify("Krasnoludek", a -> "***" + a + "***");
    }
}
