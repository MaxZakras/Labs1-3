package com.hello;


public class student {
    public static void main(String[] args) {

        int NZK = 1110;

        System.out.println("Nomer zalikovoi knizhki: " + NZK +
                "\n C_11: " + (NZK%11) + "  Vuznachitu class studentiv yakui skladaetsya minimum z 5 poliv ." );

        Students John = new Students();
        John.Set_All(John.Surname, John.age, John.Facult, John.Group, John.Grad);
        John.print_All();

        System.out.println("\n\nNew Student: MARK   \n\n");

        Students Mark = new Students();
        Mark.Set_All2("Blaster", (short) 22, "Facult of economy", "IV-22", false);
        Mark.print_All2();




    }
}
