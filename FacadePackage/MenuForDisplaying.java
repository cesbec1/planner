package FacadePackage;

public class MenuForDisplaying {
    String[] checkThis = {"S","D","A","X","R"};
    String[] checkThisForMonths= { "January", "February" , "March" , "April", "May", "June",
                                    "July", "August", "September" , "October", "November", "December"};
    public void top(){
        System.out.println("Choose a Month");
        System.out.printf("%-30.30s %-30.30s %-30.30s %-30.30s%n", "January", "February", "March", "April");
        System.out.printf("%-30.30s %-30.30s %-30.30s %-30.30s%n", "May", "June", "July", "August");
        System.out.printf("%-30.30s %-30.30s %-30.30s %-30.30s%n", "September", "October", "November", "December");


    }

    public void commands(){
        System.out.println("              COMMANDS                  ");
        System.out.println("         Set    Daily Goal   S          ");
        System.out.println("         Delete Daily Goal   D          ");
        System.out.println("         Add         To Do   A          ");
        System.out.println("         Delete from To Do   X          ");
        System.out.println("         Return to main menu R          ");
        System.out.print("Waiting for input: ");
    }

    public boolean validInputCheck(String s){
        for (String in: checkThis){
            if (s.equalsIgnoreCase(in)){
                return true;
            }
        }
        return false;
    }

    public boolean validMonthCheck(String monthToSee) {
        for(String in: checkThisForMonths){
            if(monthToSee.equalsIgnoreCase(in)){
                return true;
            }
        }
        return false;
    }
}
