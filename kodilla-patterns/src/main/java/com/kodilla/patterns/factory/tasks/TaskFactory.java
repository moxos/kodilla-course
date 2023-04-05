package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";
    public static final String DRIVING = "DRIVING";


    public Task makeTask(String taskClass) {
        return switch (taskClass) {
            case PAINTING -> new PaintingTask("House painting","red", "kitchen");
            case SHOPPING -> new ShoppingTask("Lidl", "Lion", 11);
            case DRIVING -> new DrivingTask("Adventure", "Italy", "Airplane");
            default -> null;
        };
    }
}
