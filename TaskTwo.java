package FactoryDailyLog;

//Task with medium priority
public class TaskTwo implements TaskEvent {

    private boolean completed;
    private String taskName;
    private String priority;

    public TaskTwo(){
        completed = false;
        priority = "Medium";
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void displayPriority() {
        System.out.println("Priority Medium");
    }
}
