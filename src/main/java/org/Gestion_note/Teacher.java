package org.Gestion_note;

import java.time.LocalDate;

public class Teacher extends Person{
    private String speciality;

    public Teacher(int id, String name, String firstName, LocalDate birthday, String email, String phoneNumber, String speciality) {
        super(id, name, firstName, birthday, email, phoneNumber);
        this.speciality = speciality;
    }
}
