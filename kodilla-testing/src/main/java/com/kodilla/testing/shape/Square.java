package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private static String name = "Square";
    private double sideLenght;

    public Square(double sideLenght) {
        this.sideLenght = sideLenght;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.sideLenght, sideLenght) == 0 && name.equals(square.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sideLenght);
    }

    @Override
    public String getShapeName() {
        return name;

    }

    @Override
    public double getField() {
        return sideLenght * sideLenght;
    }
}
