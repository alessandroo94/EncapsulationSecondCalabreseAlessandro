package it.devehope;

import it.devehope.Person;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        Person person = new Person();
        Scanner input = new Scanner(System.in);

        String enterName = input.nextLine();
        String enterSurname = input.nextLine();
        double enterHeight = input.nextDouble();
        int enterAge = input.nextInt();

        System.out.println("Name: " + enterName);
        System.out.println("Surname: " + enterSurname);
        System.out.println("Height: " + enterHeight);
        System.out.println("Age: " + enterAge);
    }
}
