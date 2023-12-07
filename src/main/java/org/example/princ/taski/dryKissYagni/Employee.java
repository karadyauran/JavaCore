package org.example.princ.taski.dryKissYagni;


public class Employee {
    private String firstName;
    private String lastName;
    private String email;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@company.com";
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    public String getInitials() {
        return firstName.charAt(0) + "." + lastName.charAt(0) + ".";
    }

    public String getEmail() {
        return email;
    }
}