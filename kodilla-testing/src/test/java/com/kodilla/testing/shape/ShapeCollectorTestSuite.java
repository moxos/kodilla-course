package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("Test Square")
    class TestsSquare {
        @DisplayName("Test add figure")
        @Test
        void testAddFigure() {

            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(15);
            shapeCollector.addFigure(shape);
            Assertions.assertEquals(1, shapeCollector.getshapeCollection().size());
        }
    }
   @Nested
   class TestCircle {
       @DisplayName("Test removeFigure method")
       @Test
       void testremoveFigure() {
           ShapeCollector shapeCollector = new ShapeCollector();
           Shape shape = new Circle(15);
           shapeCollector.addFigure(shape);
           boolean result = shapeCollector.removeFigure(shape);
           Assertions.assertTrue(result);
           Assertions.assertEquals(0, shapeCollector.getshapeCollection().size());
       }
   }
    @Nested
    @DisplayName("Test triangle")
    class TestTriangle {

        @DisplayName("Test getFigure method")
        @Test
        void testGetFigure() {
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle(12, 10);
            shapeCollector.addFigure(shape);
            Shape shape1;
            shape1 = shapeCollector.getFigure(0);
            Assertions.assertEquals(shape, shape1);
        }
            @DisplayName("Test showFigure")
            @Test
            void testShowFigures() {
                ShapeCollector shapeCollector = new ShapeCollector();
                Shape shape = new Triangle(12,15);
                shapeCollector.addFigure(shape);
                List<Shape> shapess = new ArrayList<>();
                shapess.add(shape);
                shapeCollector.showFigures();
                Assertions.assertEquals(shapess.toString(), shapeCollector.showFigures());
            }
        }
    }



