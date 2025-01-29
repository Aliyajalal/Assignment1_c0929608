package com.assignment1;

import java.util.Optional;  // For handling an optional dog

// Represents a person with a name, age, and an optional dog
public class Person {
    private String name;  // Person's name
    private int age;      // Person's age
    private Optional<Dog> dog;  // Dog (if they have one)

    // Creates a person with a name, age, and no dog
    public Person(String name, int age) {
        this(name, age, null);
    }

    // Creates a person with a name, age, and possibly a dog
    public Person(String name, int age, Dog dog) {
        this.name = name;
        this.age = age;
        this.dog = Optional.ofNullable(dog);
    }

    // Gets the person's name
    public String getName() {
        return name;
    }

    // Updates the person's name
    public void setName(String name) {
        this.name = name;
    }

    // Gets the person's age
    public int getAge() {
        return age;
    }

    // Updates the person's age
    public void setAge(int age) {
        this.age = age;
    }

    // Gets the dog (if they have one)
    public Optional<Dog> getDog() {
        return dog;
    }

    // Updates the person's dog
    public void setDog(Dog dog) {
        this.dog = Optional.ofNullable(dog);
    }

    // Checks if the person has a dog that is 10 years or older
    public boolean hasOldDog() {
        return dog.filter(d -> d.getAge() >= 10).isPresent();
    }

    // Changes the dog's name if the person has one, otherwise throws an error
    public void changeDogsName(String newName) {
        dog.ifPresentOrElse(d -> d.setName(newName),
                            () -> { throw new RuntimeException(name + " does not own a dog!"); });
    }

    // Returns a string with the person's details
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", dog=" + dog.orElse(null) + "}";
    }
}
