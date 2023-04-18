package com.kodilla.kodillahibernate.tasklist.dao;


import com.kodilla.kodillahibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private final String LISTNAME = "TODO";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, "TO DO items");
        taskListDao.save(taskList);
        //When
        List<TaskList> taskListRead = taskListDao.findByListName("TODO");
        //Then
        assertEquals(1, taskListRead.size());
        //Cleanup
        taskListDao.deleteById(taskListRead.get(0).getId());
    }

}
