package com.company;
import java.util.Scanner;
public class LAb7z2 {
    public static void main(String[] args) {
        Scanner ferra = new  Scanner(System.in);
        String hhlo = "Enter predloshenie in consol: ";
        System.out.println(hhlo);
        String gh = "Enter predloshenie: ";
        System.out.println(gh);
        String voi = ferra.nextLine();
       int y = 0;
       if (voi.length()!=0){
           y++;
           for (int i = 0; i<voi.length();i++){
               if (voi.charAt(i) == ' '){
                   y++;
               }
           }
       }
        System.out.println("Vi Enter: " + y + "slov");
    }
}
