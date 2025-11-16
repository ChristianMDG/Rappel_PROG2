package org.Gestion_note;

import java.time.LocalDateTime;

public class Exam {
    private int id;
    private String title;
    private Course course;;
    private LocalDateTime examDate;
    private int coefficient;

    public Exam(int id, String title, Course course, LocalDateTime examDate, int coefficient) {
        this.id = id;
        this.title = title;
        this.course = course;
        this.examDate = examDate;
        this.coefficient = coefficient;
    }
}
