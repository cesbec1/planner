package FacadePackage;

public class Task {
    private String taskToDo;
    public Task(String task){
        taskToDo = task;
    }

    public String getTaskToDo() {
        return taskToDo;
    }

    public void setTaskToDo(String taskToDo) {
        this.taskToDo = taskToDo;
    }

    @Override
    public String toString() {
        return taskToDo;
    }
}
