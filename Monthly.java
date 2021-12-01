package FacadePackage;

import java.time.Month;
import java.util.Scanner;

public class Monthly {
    private Scanner in = new Scanner(System.in);
    private MonthlyTask current;

    MonthlyTask[] months = {new MonthlyTask(Month.JANUARY.name(), Month.JANUARY.length(false),5),
            new MonthlyTask(Month.FEBRUARY.name(), Month.FEBRUARY.length(false),1),
            new MonthlyTask(Month.MARCH.name(), Month.MARCH.length(false),1),
            new MonthlyTask(Month.APRIL.name(), Month.APRIL.length(false),4),
            new MonthlyTask(Month.MAY.name(), Month.MAY.length(false),6),
            new MonthlyTask(Month.JUNE.name(), Month.JUNE.length(false),2),
            new MonthlyTask(Month.JULY.name(), Month.JULY.length(false),4),
            new MonthlyTask(Month.AUGUST.name(), Month.AUGUST.length(false),7),
            new MonthlyTask(Month.SEPTEMBER.name(), Month.SEPTEMBER.length(false),3),
            new MonthlyTask(Month.OCTOBER.name(), Month.OCTOBER.length(false),5),
            new MonthlyTask(Month.NOVEMBER.name(), Month.NOVEMBER.length(false),1),
            new MonthlyTask(Month.DECEMBER.name(), Month.DECEMBER.length(false),3)};


    public void view() {
        current.showView();
    }


    public void add() {
        System.out.print("Set Daily goal : ");
        String taskToAdd = in.nextLine();
        System.out.println("What day of the month?");
        int day = in.nextInt() - 1;
        while(!validDayCheck(day)){
            System.out.println("Invalid Day! Try Again: ");
            day = in.nextInt() - 1;
        }
        current.addDailyGoal(taskToAdd, day);

    }

    private boolean validDayCheck(int day) {
        return day >= 0 && day <= current.getDays();
    }

    public void delete() {
        System.out.println("Delete goal for which day of the month?");
        int day = Integer.parseInt(in.nextLine())-1;
        while(!validDayCheck(day)){
            System.out.println("Invalid Day! Try Again: ");
            day = Integer.parseInt(in.nextLine())-1;
        }
        current.deleteGoal(day);


    }

    public void addToList() {
        System.out.println("What would you like to add to the list? :");
        String taskToAdd = in.nextLine();
        current.addToTheToDoList(taskToAdd);
    }

    public void deleteFromList(){
        System.out.println("What entry would you like to delete? :");
        int entry = Integer.parseInt(in.nextLine())-1;
        current.deleteTaskFromTodo(entry);
    }

    public void setCurrentMonthToWorkWith(String month){
        for (MonthlyTask in : months) {
            if (in.getMonthName().equalsIgnoreCase(month)) {
                current = in;
            }
        }
    }


}