package com.company;
public class LAb7z1 {
    public static void main(String[] args) {
        String[] key = new String[7];
        key[0]  = "Hello!";
        key[2] = "what?";
        key[4] = "Okey";
        for (int i = 0;i< key.length;i++){
            System.out.println(key[i]);
        }
        System.out.println();
        int k = key.length;
        String array;
        for (int b = 0; b<k/2;b++){
            array = key[k-b-1];
            key[k-b-1] = key[b];
        }
        for (int u = 0;u< key.length;u++){
            System.out.println(key[u]);
        }


    }
}
