package com.hello;

import java.util.Scanner;

public class Students {

    public String Surname;
    public short age;
    public String Facult;
    public String Group;
    public boolean Grad;

    void Set_All(String Surname,short age,String Facult,String Group,boolean Grad) {

        Scanner sc_num1 = new Scanner(System.in);
        System.out.print("Enter Surname :  ");
        String Sur = sc_num1.nextLine();
        System.out.println("John Surname :  " + Sur);

        Scanner sc_num2 = new Scanner(System.in);
        System.out.print("Enter age :  ");
        short ag = sc_num2.nextShort();
        System.out.println("Your age :  " + ag);

        Scanner sc_num3 = new Scanner(System.in);
        System.out.print("Enter Faculty :  ");
        String Fac = sc_num3.nextLine();
        System.out.println("John Faculty :  " + Fac);

        Scanner sc_num4 = new Scanner(System.in);
        System.out.print("Enter group :  ");
        String Gt = sc_num4.nextLine();
        System.out.println("John group :  " + Gt);

        Scanner sc_num5 = new Scanner(System.in);
        System.out.print("Enter good(true) or bed(false) student :  ");
        boolean poin = sc_num5.nextBoolean();
        System.out.println("John student have good point :  " + poin);


        this.Surname = Sur;
        this.age = ag;
        this.Facult = Fac;
        this.Group = Gt;
        this.Grad = poin;

    }

    void print_All(){
        System.out.println("\nJohn Surname: " + this.Surname + "\n John Age: "
                + this.age + "\nJohn Facult " + this.Facult + "\nJohn Group " + this.Group
                + " \n Does John has good mark? " + this.Grad);
    }

    private String Surname2;
    private short age2;
    private String Facult2;
    private String Group2;
    private boolean Grad2;

    void Set_All2(String Surname2,short age2,String Facult2,String Group2,boolean Grad2) {
        this.Surname2 = Surname2;
        this.age2 = age2;
        this.Facult2 = Facult2;
        this.Group2 = Group2;
        this.Grad2 = Grad2;
    }
    void print_All2(){
        System.out.println("\nMark Surname: " + this.Surname2 + "\n Mark Age: "
                + this.age2 + "\nMark Facult " + this.Facult2 + "\nMark Group " + this.Group2
                + " \n Does Mark has good point? " + this.Grad2);
    }

}
