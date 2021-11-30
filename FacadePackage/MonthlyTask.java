package FacadePackage;

import java.util.ArrayList;

public class MonthlyTask {
    private String monthName;
    private int days;
    private int first;
    Task[] arrOfGoals;
    ArrayList<Task> taskList;
    String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


    public MonthlyTask(String name, int daysInTheMonth,int firstWeekDay){
        monthName = name;
        days = daysInTheMonth;
        first = firstWeekDay - 1;
        arrOfGoals = new Task[daysInTheMonth];
        taskList = new ArrayList<>();

    }



    public void showView() {
        System.out.println(monthName);
        System.out.printf("%-70s  %-100s%n", "Daily Goals", "To Do This Month ");
        System.out.println(" ");
        String s ;
        int i = 0;
        while (i < days ) {
            if (arrOfGoals[i] == null) {
                try {
                    s = (i+1)+ ": "+ taskList.get(i).toString();
                } catch (IndexOutOfBoundsException e) {
                    s = "";
                }
                System.out.printf("%-70s  %-100s%n", (i + 1) + " " + daysOfWeek[(i+first) % 7] + " Goal : ", s);
            } else if (arrOfGoals[i] != null) {
                try {
                    s =(i+1)+": "+ taskList.get(i).toString();
                } catch (IndexOutOfBoundsException e) {
                    s="";
                }
                System.out.printf("%-70s  %-100s%n", (i + 1) + " " + daysOfWeek[(i+first) % 7] + " Goal : " + arrOfGoals[i].toString(),
                        s);
            }
            i++;
        }
    }


    public String getMonthName() {
        return monthName;
    }

    public void addDailyGoal(String t, int day) {
        Task a = new Task(t);
        arrOfGoals[day] = a;
    }


    public void deleteGoal(int day) {
        arrOfGoals[day] = null;
    }

    public int getDays() {
        return days;
    }

    public void addToTheToDoList(String taskToAdd) {
        taskList.add(new Task(taskToAdd));
    }

    public void deleteTaskFromTodo(int entry) {
        try{
            taskList.remove(entry);
        }catch(IndexOutOfBoundsException e){
            System.out.println("No Entry found");
        }
    }
}
