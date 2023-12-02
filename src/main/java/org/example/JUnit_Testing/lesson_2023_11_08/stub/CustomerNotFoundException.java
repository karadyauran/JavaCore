package org.example.JUnit_Testing.lesson_2023_11_08.stub;

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException() {
        super("No such customer found!");
    }
}