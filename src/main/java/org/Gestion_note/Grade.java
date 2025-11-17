package org.Gestion_note;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Grade {
    private Exam exam;
    private Student student;
    private double initialValue;
    private List<GradeHistoric> historic;

    public Grade(Exam exam, Student student, double value) {
        this.exam = exam;
        this.student = student;
        this.initialValue = value;
        this.historic = new ArrayList<>();
        this.historic.add(new GradeHistoric(value,value,Instant.now(),"first note"));
    }

    public Exam getExam() {
        return exam;
    }

    public Student getStudent() {
        return student;
    }

    public double getInitialValue() {
        return initialValue;
    }

    public List<GradeHistoric> getHistoric() {
        return historic;
    }

    public void addGradeChange(double newValue , String motif){
        double oldValue = this.initialValue;
        this.initialValue = newValue;
        this.historic.add(new GradeHistoric(oldValue,newValue,Instant.now(),motif));
    }
}
