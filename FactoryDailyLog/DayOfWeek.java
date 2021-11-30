package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

//A class for the day of the week which will contain
//different tasks and events
public class DayOfWeek {

    private LocalDate date;
    private String day;
    private ArrayList <TaskEvent> tasks;
    private ArrayList <Event> events;
    private int taskCount;

    public DayOfWeek(String _day){
        day = _day;
        date = java.time.LocalDate.now();
        tasks = new ArrayList<>();
        events = new ArrayList<>();
        taskCount = 0;
    }

    public String getDay(){
        return day;
    }

    public void addTask(TaskEvent _task){
        tasks.add(_task);
        taskCount++;
    }

    public void addEvent(Event _event){
        events.add(_event);
    }

    public void displayTasks(){
        System.out.println("--Tasks: ");
        for (TaskEvent t:tasks) {
            System.out.print(" * " + t.getTaskName() + " --");
            t.displayPriority();
        }
    }

    public void displayEvents(){
        System.out.println("--Events: ");
        for (Event e: events) {
            System.out.println(e.getEventName());
        }
    }

    public int getTaskCount(){
        return taskCount;
    }

}
