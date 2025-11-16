package org.Gestion_note;

import java.time.LocalDate;

public class Tutor extends Person{
    private String label;

    public Tutor(int id, String name, String firstName, LocalDate birthday, String email, String phoneNumber, String label) {
        super(id, name, firstName, birthday, email, phoneNumber);
        this.label = label;
    }
}
