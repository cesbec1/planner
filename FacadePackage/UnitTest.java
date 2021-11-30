package FacadePackage;

import static org.junit.jupiter.api.Assertions.assertTrue;

class UnitTest {

    @org.junit.jupiter.api.Test
    void getTaskToDoTest() {
        Task test = new Task("A task");
        assertTrue(test.getTaskToDo().equalsIgnoreCase("A task"));
    }

    @org.junit.jupiter.api.Test
    void addToDoTest(){
        MonthlyTask month = new MonthlyTask("janaury",31,7);
        month.addToTheToDoList("do this task");
        assertTrue(!month.taskList.isEmpty());
    }
}