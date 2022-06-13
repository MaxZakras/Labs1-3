package com.hello;

import java.util.*;


class RyadokS {
    ArrayList<String> words = new ArrayList<String>();

    public String word_1;
    public String word_2;
    public String word_3;
    public String word_4;
    public String word_5;

    void ent_key() {

        Scanner sc_num1 = new Scanner(System.in);
        System.out.print("Enter word1 :  ");
        String w1 = sc_num1.nextLine();
        System.out.println("word1 :  " + w1);
        System.out.print("Enter word2 :  ");
        String w2 = sc_num1.nextLine();
        System.out.println("Word2 :  " + w2);
        System.out.print("Enter Word3 :  ");
        String w3 = sc_num1.nextLine();
        System.out.println("Word3 :  " + w3);
        System.out.print("Enter Word4 :  ");
        String w4 = sc_num1.nextLine();
        System.out.println("Word4 :  " + w4);
        System.out.print("Enter Word5 :  ");
        String w5 = sc_num1.nextLine();
        System.out.println("Word5 :  " + w5);

            this.word_1 = w1;
            this.word_2 = w2;
            this.word_3 = w3;
            this.word_4 = w4;
            this.word_5 = w5;


            words.add(w1);
            words.add(w2);
            words.add(w3);
            words.add(w4);
            words.add(w5);
    }

    public void print_All(List<String> line) {
            StringBuilder str_bi = new StringBuilder(" ");
            for (String word : line) {
                str_bi.append(word + " ");}
            str_bi.append(System.lineSeparator());
            System.out.println(str_bi.toString());
        }
    public void print() {
       print_All(words);

            System.out.println("\nSorted from min to max \n");
            words.sort(String.CASE_INSENSITIVE_ORDER);
            print_All(words);

        }
}



public class Ryadok {

    public static final ArrayList<Ryadok> words = new ArrayList<>();
    public static void main(String[] args) {

                                                    int NZK = 1110;


                                                         System.out.println("Nomer zalikovoi knizhki: " + NZK +
                                                        "\n C_3: " + (NZK % 3) + "  Type: StringBuilder" +
                                                         "\n C_17: " + (NZK % 17) + " Nadrykyvatu slova bez povtoren zadanogo texty v" +
                                                          " alfavitnomy poryadky za pershoyu literoy.\n");


        RyadokS RYAD1 = new RyadokS();
        RYAD1.ent_key();
        RYAD1.print();
    }
}

