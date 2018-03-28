package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void addFigure() {
        //Given
        ShapeColllector shapeCollector = new ShapeColllector();

        Shape circle = new Circle();
        Shape squere = new Square();
        Shape triangle = new Triangle();
        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(squere);
        shapeCollector.addFigure(triangle);
        //Then
        Assert.assertEquals(circle, shapeCollector.getFigure(0));
        Assert.assertEquals(squere, shapeCollector.getFigure(1));
        Assert.assertEquals(triangle, shapeCollector.getFigure(2));
    }

    @Test
    public void removeFigure() {
        //Given
        ShapeColllector shapeCollector = new ShapeColllector();
        Shape circle = new Circle();
        Shape squere = new Square();
        Shape triangle = new Triangle();
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(squere);
        shapeCollector.addFigure(triangle);

        //When
        shapeCollector.removeFigure(circle);

        //Then
        Assert.assertEquals(null, shapeCollector.getFigure(3));
    }

    @Test
    public void getFigure() {
        //Given
        ShapeColllector shapeColllector = new ShapeColllector();
        Shape circle = new Circle();
        shapeColllector.addFigure(circle);

        //When
        Shape result = shapeColllector.getFigure(0);

        //Then
        Assert.assertEquals(circle, result);

    }

    @Test
    public void showFigures() {
        //Given
        ShapeColllector shapeColllector = new ShapeColllector();
        Shape circle = new Circle();
        Shape squere = new Square();
        Shape triangle = new Triangle();
        shapeColllector.addFigure(circle);
        shapeColllector.addFigure(squere);
        shapeColllector.addFigure(triangle);

        //When
       String result = shapeColllector.showFigures();

        //Then
        Assert.assertEquals("Circle Square Triangle ", result) ;
    }
}
