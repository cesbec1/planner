package FactoryDailyLog;

//Interface used for a Factory design pattern
//Classes that are used in the pattern will implement it
public interface TaskEvent {
    void displayPriority();
    void setTaskName(String taskName);
    String getTaskName();
    //void updatePriority();
}
