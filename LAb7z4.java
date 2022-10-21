package com.company;
public class LAb7z4 {
    public static void main(String[] args) {
int[] pi = new int[12];
int max = 0;
int IDEX = 0;
for (int i = 0; i< 12;i++) {
    pi[i] = (int) Math.floor(Math.random() * 31) - 15;
    System.out.println(pi[i] + " ");
}
    for (int i = 0; i<12;i++){
        if (pi[i] > pi[i-1]&& i ! = -1){
            max = pi[i];
            IDEX = i;
        }
    }
    System.out.println("Samoe bolshoe: " + max);


    }
}
