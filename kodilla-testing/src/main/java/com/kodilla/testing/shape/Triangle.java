package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape{
    private static String  name = "Triangle";
    private double height;
    private double a;

    public Triangle(double height, double a) {
        this.height = height;
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.height, height) == 0 && Double.compare(triangle.a, a) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, a);
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {

        return 0.5 * height +a;
    }
}
