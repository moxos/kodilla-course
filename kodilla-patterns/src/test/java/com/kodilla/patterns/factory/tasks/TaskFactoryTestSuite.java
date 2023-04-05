package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryPaintingTask() {
        TaskFactory taskFactory = new TaskFactory();
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING);
        String result = paintingTask.executeTask();
        Assertions.assertEquals("Painting task finished", result);
        Assertions.assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    void testFactoryShoppingTask() {
        TaskFactory taskFactory = new TaskFactory();
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);
        String result = shoppingTask.executeTask();
        Assertions.assertEquals("Shopping Task finished", result);
        Assertions.assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask() {
        TaskFactory taskFactory = new TaskFactory();
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING);
        String result = drivingTask.executeTask();
        Assertions.assertEquals("Driving Task finished", result);
        Assertions.assertTrue(drivingTask.isTaskExecuted());
    }
}
