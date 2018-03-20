package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeColllector {

    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        Shape result = shapes.get(n);
        return result;
    }

    public String showFigures() {
        String names = "";
        for (int i = 0; i < shapes.size(); i++) {
            Shape figure = shapes.get(i);
            String name = figure.getShapeName();
            names = names + name + " ";
        }
        return names;
    }
}
