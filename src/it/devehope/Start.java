package it.devehope;

import it.devehope.Person;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        Person person = new Person();
        Scanner input = new Scanner(System.in);

        System.out.println("Name: ");
        person.setName(input.nextLine());

        System.out.println("Surname: ");
        person.setSurname(input.nextLine());

        System.out.println("Height: ");
        person.setHeight(input.nextDouble());

        System.out.println("Age: " );
        person.setAge(input.nextInt());

    }
}
