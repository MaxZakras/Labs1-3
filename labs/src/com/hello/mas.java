package com.hello;

import java.util.Random;
import java.util.Scanner;

public class mas {
    public static void main(String[] args) {
        int NZK = 1110;

        System.out.println("Nomer zalikovoi knizhki: " + NZK +
                "\n C_5: " + (NZK%5) + "    My operation:   C=a * B, a - const;" +
                "\n C_7: " + (NZK%7) + "    My type: Long; " +
                "\n C_11: " + (NZK%11) + "  Znayty seredne znachennia elementiv matryci." );


        Scanner sc_num1 = new Scanner(System.in);
        System.out.print("Enter n :  ");
        int n = sc_num1.nextInt();
        System.out.println("Your n :  " + n);

        Scanner sc_num2 = new Scanner(System.in);
        System.out.print("Enter m :  ");
        int m = sc_num2.nextInt();
        System.out.println("Your m :  " + m);

        Scanner sc_num3 = new Scanner(System.in);
        System.out.print("Enter constanta :  ");
        int con_a = sc_num3.nextInt();
        System.out.println("Your constanta :  " + con_a + "\n");

        long[][] arr = new long[n][m];
        float suma = 0;
        Random rnd = new Random();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                arr[i][j] = rnd.nextLong(1000);



        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                suma += arr[i][j];
                System.out.print(arr[i][j] + " | ");}
                System.out.println();

        }
        System.out.println("2) Seredne znachennya:  " + (suma /(n * m)) + "\n\n\n Matrytsya pomnojena na constantu" + "\n");

        for(int i = 0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print((con_a*arr[i][j]) + " | ");
            }
            System.out.println();
        }
    }
}
