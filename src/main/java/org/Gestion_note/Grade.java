package org.Gestion_note;

import java.time.Instant;
import java.util.List;

public class Grade {
    private Exam exam;
    private Student student;
    private double initialValue;
    private List<GradeHistoric> gradeHistoric;

    public Grade(Exam exam, Student student, double initialValue, List<GradeHistoric> gradeHistoric) {
        this.exam = exam;
        this.student = student;
        this.initialValue = initialValue;
        this.gradeHistoric = gradeHistoric;
    }

    public void addGradeChange(double new){

    }
}
