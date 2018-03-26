package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String a, PoemDecorator poemDecorator) {
        String text = poemDecorator.decorate(a);
        System.out.println("Beautifull text:" + text);
    }
}