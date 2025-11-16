package org.Gestion_note;

import java.time.LocalDate;

public class Person {
    protected int id;
    protected String name;
    protected String firstName;
    protected LocalDate birthday;
    protected String email;
    protected String phoneNumber;

    public Person(int id, String name, String firstName, LocalDate birthday, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.birthday = birthday;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
