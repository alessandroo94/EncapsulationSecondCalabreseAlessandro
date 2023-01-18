package it.devehope;

import it.devehope.Person;

public class Start {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Alessandro");
        person.setSurname("Calabrese");
        person.setHeight(72.0);
        person.setAge(29);

        System.out.println("Name: " + person.getName() + " - Surname: " + person.getSurname() +  " - Height: " + person.getHeight() + "kg - Age: " + person.getAge());
    }
}
