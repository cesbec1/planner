//Yevgeniy Sumaryev
package FactoryDailyLog;

public class TaskEventFactory {

    //A Factory class that returns a Task based
    //on it's priority level
    public TaskEvent getTaskEvent(String taskType){

        if (taskType == null){
            return null;
        }
        if(taskType.equalsIgnoreCase("High")){
            return new TaskOne();
        }
        else if (taskType.equalsIgnoreCase("Medium")){
            return new TaskTwo();
        }
        else if (taskType.equalsIgnoreCase("Low")){
            return new TaskThree();
        }
        return null;
    }
}
