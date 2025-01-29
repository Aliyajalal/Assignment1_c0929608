package com.assignment1;

public class MainApplication {
    public static void main(String[] args) {
        // Creating a person without a dog
        Person person = new Person("John", 30);

        try {
            // Trying to change the dog's name (should throw an exception)
            person.changeDogsName("Buddy");
        } catch (RuntimeException e) {
            // Catching and showing the error message
            System.out.println("Unable to change dog's name: " + e.getMessage());
        }
    }
}
