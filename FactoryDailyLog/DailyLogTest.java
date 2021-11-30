package com.company;

import static org.junit.jupiter.api.Assertions.*;

class DailyLogTest {

    //JUnit test that checks whether the correct day was created
    @org.junit.jupiter.api.Test
    void displayAllDays() {
        DayOfWeek dw = new DayOfWeek("Tuesday");
        assertTrue(dw.getDay().equalsIgnoreCase("tuesday"));
    }

    //JUnit test which checks how many tasks were created in the process
    @org.junit.jupiter.api.Test
    void displayTasks() {
        DayOfWeek d = new DayOfWeek("Thursday");
        TaskEvent t1 = new TaskEventFactory().getTaskEvent("Low");
        t1.setTaskName("Pay bills");
        d.addTask(t1);


        TaskEvent t2 = new TaskEventFactory().getTaskEvent("Medium");
        t2.setTaskName("Task 2");
        d.addTask(t2);

        assertTrue(d.getTaskCount() == 2);

    }
}