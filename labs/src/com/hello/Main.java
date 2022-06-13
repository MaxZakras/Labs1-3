package com.hello;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int NZK = 1110;

        System.out.println("Nomer zalikovoi knizhki: " + NZK +
                "\n C_2: " + (NZK%2) + "   O1 +" +
                "\n C_3: " + (NZK%3) +
                "\n C_5: " + (NZK%5) + "   O2 *" +
                "\n C_7: " + (NZK%7) + "   use type CHAR");

        Scanner sc_num1 = new Scanner(System.in);
        System.out.print("Enter symbal:");
        char ent1 = (char)sc_num1.nextInt();
        System.out.println("Your symbal is :  " + (int)ent1);


        Scanner sc_num2 = new Scanner(System.in);
        System.out.print("Enter symbal 2 :  ");
        char ent2 = (char)sc_num2.nextInt();
        System.out.println("Your symbal is :  " + (int) ent2);

        Scanner sc_num3 = new Scanner(System.in);
        System.out.print("Enter n :  ");
        int n = sc_num3.nextInt();
        System.out.println("Your n :  " + n);

        Scanner sc_num4 = new Scanner(System.in);
        System.out.print("Enter m :  ");
        int m = sc_num4.nextInt();
        System.out.println("Your m :  " + m);


        int S = 0;
        int C = 0;



        if (ent1 != 0 ){
            for (char i = ent1; i < n; i++) {
                for (char j = ent2; j < m; j++) {
                    S += (i * j) / (i + C);

                }
            }
            System.out.println("SUMA:= " + S);
        }else{
            System.out.println("!!!Dilulu na 0 ne dosvoleno!!!");
        }

    }
}
