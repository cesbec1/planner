package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class DailyLog {
    DayOfWeek d;
    TaskEventFactory tef;
    ArrayList<DayOfWeek> dow;

    public void dailyLogMenu(){
        //declare day, TaskFactory and days array
        dow = new ArrayList<>();
        tef = new TaskEventFactory();
        d = new DayOfWeek("Monday");

        //populate journal with data
        populateData();

        //display all the days and tasks
        displayDays();

        Scanner userInput = new Scanner(System.in);
        boolean go = true;
        while(go){

            //get users choice
            //depending on choice call function for next display
            String input = userInput.nextLine();
            if (input.equalsIgnoreCase("A")) {
                addNewDay();
            }
            else if (input.equalsIgnoreCase("D")){
                System.out.println("Select a day");
                input = userInput.nextLine();
                switch (input){
                    case "monday":
                        System.out.println("You picked Monday");
                        break;
                    case "tuesday":
                        System.out.println("You picked Tuesday");
                        break;
                    case "wednesday":
                        System.out.println("You picked Wednesday");
                        break;
                    case "thursday":
                        System.out.println("You picked Thursday");
                        break;
                    case "friday":
                        System.out.println("You picked Friday");
                        break;

                }
            }
            else if (input.equalsIgnoreCase("X")){
                displayDays();
            }
            else
                go = false;
        }


    }

    //function to display all days and tasks/events
    public void displayDays(){
        for (DayOfWeek dw: dow) {
            System.out.println(dw.getDay());
            dw.displayTasks();
            dw.displayEvents();
            System.out.println(" ");
        }
        System.out.println("Please choose a day:");
        System.out.println("------Commands-------");
        System.out.println("A-Add entry X-finish entry D-Delete an entry \n E-Exit");



    }

    //function to add new day and new tasks/events
    public void addNewDay(){
        boolean go = true;
        Scanner userInput = new Scanner(System.in);
        //Add current day as day
        String day = LocalDate.now().getDayOfWeek().name();
        DayOfWeek newDay = new DayOfWeek(day);
        String input;
        while(go){

            System.out.println("Please enter a task priority(High/Medium/Low):");
            input = userInput.nextLine();
            TaskEvent t1 = tef.getTaskEvent(input);
            System.out.println("Please enter a task description: ");
            input = userInput.nextLine();
            t1.setTaskName(input);
            newDay.addTask(t1);
            System.out.println("Add another task?(Y/N): ");
            input = userInput.nextLine();
            if (input.equalsIgnoreCase("N"))
                go = false;
        }

        dow.add(newDay);
        displayDays();

    }

    //a helper method to populate daily log with random data
    public void populateData(){
        TaskEvent t1 = tef.getTaskEvent("Medium");
        t1.setTaskName("do laundry");
        d.addTask(t1);

        TaskEvent t2 = tef.getTaskEvent("Medium");
        t2.setTaskName("wash dishes");
        d.addTask(t2);
        dow.add(d);

        d = new DayOfWeek("Tuesday");
        t1 = tef.getTaskEvent("Low");
        t1.setTaskName("paint house");
        d.addTask(t1);
        dow.add(d);

        d = new DayOfWeek("Wednesday");
        t1 = tef.getTaskEvent("High");
        t1.setTaskName("Walk the dog");
        d.addTask(t1);
        dow.add(d);

        d = new DayOfWeek("Thursday");
        t1 = tef.getTaskEvent("Low");
        t1.setTaskName("Pay bills");
        d.addTask(t1);


        t2 = tef.getTaskEvent("Medium");
        t2.setTaskName("Task 2");
        d.addTask(t2);

        Event event = new Event("Party","New Year Party");
        d.addEvent(event);
        dow.add(d);

        d = new DayOfWeek("Friday");
        t1 = tef.getTaskEvent("Low");
        t1.setTaskName("Task 1");
        d.addTask(t1);

        event = new Event("Dinner","Dinner with colleagues");
        d.addEvent(event);
        dow.add(d);

    }

}
