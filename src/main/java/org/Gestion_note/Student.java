package org.Gestion_note;

import java.time.LocalDate;

public class Student extends Person {
    private String group;
    private Tutor tutor;

    public Student(int id, String name, String firstName, LocalDate birthday, String email, String phoneNumber, String group, Tutor tutor) {
        super(id, name, firstName, birthday, email, phoneNumber);
        this.group = group;
        this.tutor = tutor;
    }
}
