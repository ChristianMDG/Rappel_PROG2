package org.Gestion_note;

public class Course {
    private int id;
    private String label;
    private int credit;
    private Teacher teacher;

    public Course(int id, String label, int credit, Teacher teacher) {
        this.id = id;
        this.label = label;
        this.credit = credit;
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public int getCredit() {
        return credit;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
