package FacadePackage;

import java.util.Scanner;

public class MonthlyFacade {
    private Monthly months;
    private MenuForDisplaying menu = new MenuForDisplaying();
    private Scanner in = new Scanner(System.in);
    public MonthlyFacade(){
        months = new Monthly();
    }
    public void facadeMenu(){
        menu.top();

        String monthToSee = in.nextLine();
        while(!menu.validMonthCheck(monthToSee)){
            System.out.println("Invalid Month! Try Again: ");
            monthToSee = in.nextLine();
        }
        months.setCurrentMonthToWorkWith(monthToSee);
        while(true) {
            months.view();
            menu.commands();
            String nextCommand = in.nextLine();
            while(!menu.validInputCheck(nextCommand)){
                nextCommand = in.nextLine();
            }
            if(nextCommand.equalsIgnoreCase("S")){
                addGoal();
            }else if( nextCommand.equalsIgnoreCase("X")){
                deleteTaskTodo();
            }else if(nextCommand.equalsIgnoreCase("D")){
                deleteGoal();
            }else if(nextCommand.equalsIgnoreCase("A")){
                addTaskToDo();
            }else if(nextCommand.equalsIgnoreCase("R")){
                break;
            }
       }
    }
    private void addTaskToDo() {
        months.addToList();
    }
    private void addGoal(){
        months.add();
    }
    private void deleteGoal(){
        months.delete();
    }
    private void deleteTaskTodo(){
        months.deleteFromList();
    }
}
