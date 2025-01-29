package com.assignment1;

import java.util.Objects;

/**
 * A Dog class having a name and age.
 */
public class Dog {
    private String name;
    private Integer age;

    /**
     * Creating a Dog with name and age.
     */
    public Dog(String name, Integer age) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Dog name cannot be empty.");
        }
        if (age == null || age < 0) {
            throw new IllegalArgumentException("Dog age cannot be negative.");
        }
        this.name = name;
        this.age = age;
    }

    /**
     * Getting the dog's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Setting a new name for the dog.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getting the dog's age.
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Setting a new age for the dog.
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Checking if two Dog objects have the same name and age.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dog dog = (Dog) obj;
        return Objects.equals(name, dog.name) && Objects.equals(age, dog.age);
    }

    /**
     * Generating a hash code based on name and age.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    /**
     * Returning a string with dog's details.
     */
    @Override
    public String toString() {
        return "Dog{name='" + name + "', age=" + age + "}";
    }
}
