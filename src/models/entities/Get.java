package models.entities;

import java.util.Scanner;

public class Get {
    public int getInt(String t){
        Scanner in = new Scanner(System.in);
        System.out.println(t);
        int num = in.nextInt();
        return num;
    }
}
