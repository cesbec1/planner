package Index;

import java.util.Scanner;

public class IndexMenu {
    modifyIndex m = new modifyIndex();


    public void menu()
    {
        boolean val = true;
        while(val) {
        System.out.println("Hello and welcome to the index menu!");
        if(m.size() == 0)
            System.out.println("There are no indices on the system.");
        else
        {
            System.out.println("Here are some of the indices on the system: ");
            m.print();
        }
        System.out.println("-------------Commands-------------------");
        System.out.println("Add Some Topic - enter A");
        System.out.println("Add Delete Topic - enter D");
        System.out.println("Select some Topic - enter M\n");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.nextLine();

        switch(input)
        {
            case "A":
            case "a":
            m.addTopic();
            break;
            case "D":
            case "d":
            m.removeTopic();
            break;
            case "M":
            case "m":
            m.selectTopic();

        }

    }
}
}
