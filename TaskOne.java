package FactoryDailyLog;

//Task with high priority
public class TaskOne implements TaskEvent {

    private boolean completed;
    private String taskName;
    private String priority;

    public TaskOne(){
        completed = false;
        priority = "High";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void displayPriority() {
        System.out.println("Priority High");
    }


}
