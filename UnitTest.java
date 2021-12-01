package FacadePackage;

import static org.junit.jupiter.api.Assertions.assertTrue;

class UnitTest {

    @org.junit.jupiter.api.Test
    void getTaskToDoTest() {
        FacadePackage.Task test = new FacadePackage.Task("A task");
        assertTrue(test.getTaskToDo().equalsIgnoreCase("A task"));
    }

    @org.junit.jupiter.api.Test
    void addToDoTest(){
        FacadePackage.MonthlyTask month = new FacadePackage.MonthlyTask("janaury",31,7);
        month.addToTheToDoList("do this task");
        assertTrue(!month.taskList.isEmpty());
    }
}