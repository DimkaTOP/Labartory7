package com.company;
public class LAb7z3 {
    public static void main(String[] args) {
        int yew = 3;
        int[][] jdk = new int[yew][yew];
        for (int i = 0; i < yew; i++) {
            for (int k = 0; k < yew; k++) {
                jdk[i][k] = yew * i + k;
            }
        }
        System.out.println("Hachalynaya matrica: ");
        System.out.println("------");
        for (int k = 0; k < yew; k++) {
            for (int i = 0; i < yew; i++) {
                System.out.printf("%4d", jdk[k][i]);
            }
            System.out.println();
        }
        for (int k = 0; k<yew; k++){
            for (int i = 0; i<yew;i++){
                int tew = jdk[k][i];
                jdk[k][i]= jdk[k][i];
                jdk[k][i] = tew;
            }
        }
        System.out.println();
        System.out.println("Naw matrica");
        System.out.println("------");
        for (int k = 0; k<yew;k++){
            for (int i = 0; i<yew;i++){
                System.out.printf("%3d", jdk[k][i]);
            }
            System.out.println();
        }
    }
}
