package FactoryDailyLog;

//Task with high priority
public class TaskThree implements TaskEvent{

    private boolean completed;
    private String taskName;
    private String priority;

    public TaskThree(){
        completed = false;
        priority = "Low";
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void displayPriority() {
        System.out.println("Priority Low");
    }
}
