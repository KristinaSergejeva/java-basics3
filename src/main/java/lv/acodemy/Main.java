package lv.acodemy;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {

        // One-line comment

        /*
        Multi-line comment
       !
         */

        // double floating numbers
        double pi = 3.14;
        System.out.println(pi);

        // float - floating numbers
        float weight = 70.34f;
        System.out.println(weight);

        // int (integer) - celie chisla
        int populationOfLatvia = 1700000;
        System.out.println(populationOfLatvia);

        // char
        char myFirstNameChar = 'N';
        System.out.println(myFirstNameChar);

        // byte
        byte age = 28;
        System.out.println(age);

        // boolean is , has
        boolean isSummer = true;
        System.out.println(isSummer);
        boolean isWinter = false;
        System.out.println(isWinter);

        // String - hronit v sebe stroku, hranit raznij tekst
        String name = "Kristina";
        String surname = "Sergejeva";
        System.out.println(name + surname);
        System.out.println(name + " " + surname);
        System.out.printf("%s %s\n", name, surname);
        System.out.printf("%s %s\n", name, surname);
        System.out.println("My name is: " + name + ". " + "My surname is: " + surname);

        // Operator
        int a = 10;
        int b = 5;
        int c = a + b;
        System.out.println(c);



    }


    //
}