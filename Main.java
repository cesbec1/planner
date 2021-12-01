package Planner.src;

import FacadePackage.MonthlyFacade;
import FactoryDailyLog.DailyLog;
import Index.IndexMenu;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        MonthlyFacade monthly = new MonthlyFacade();
        DailyLog daily = new DailyLog();
        IndexMenu index = new IndexMenu();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Bujo Juju!");
        
        while(true){
            System.out.println("Choose a page to work with:");
            System.out.println("See Index: I");
            System.out.println("See Monthly: M");
            System.out.println("See Daily: D");
            String in = input.nextLine();
            if(in.equalsIgnoreCase("I")){
                index.menu();
            }else if(in.equalsIgnoreCase("M")){
                monthly.facadeMenu();
            }else if(in.equalsIgnoreCase("D")){
                daily.dailyLogMenu();
            }else{
                break;
            }

        }

        System.out.println("See you next time!!!:)");
        
        
    }
}
