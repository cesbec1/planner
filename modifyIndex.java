package Index;

import java.util.ArrayList;
import java.util.Scanner;

public class modifyIndex {
    private String indexTitle;
    private ArrayList<String> indices = new ArrayList<String>();

    public modifyIndex() {}

    public void addTopic() {
        System.out.print("What topic would you like to add?: ");
        Scanner input = new Scanner (System.in);
        input.nextLine();
        this.indices.add(indexTitle);

    }

    public void removeTopic() {
        System.out.print("What topic would you like to remove?: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        this.indices.remove(x);

    }

    public void selectTopic() {
        System.out.print("What topic would you like to select?: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println(this.indices.get(x));

    }

    public int size() {
        int size = 0;
        if(indices.size() == 0){
            return size;
        }
        
        for(int i = 0; i < indices.size(); i++)
            size++;

        return size;
    }

    public void print() {
        for(int i = 0; i < indices.size(); i++)
            System.out.println(indices.get(i));
    }

    public String toString() {
        String st = "";
        for(int i = 0; i < indices.size(); i++) {
            st += indices.get(i) + "\n";
        }
        return st;
    }


}
