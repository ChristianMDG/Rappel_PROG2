package org.Gestion_note;

import java.time.Instant;
import java.util.List;

public class ManageGrade {
    private List<Grade> grades;

    public ManageGrade(List<Grade> grades) {
        this.grades = grades;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public double getExamGrade(Exam exam, Student student, Instant t) {
        for (Grade grade : grades){
            if (grade.getStudent().equals(student) && grade.getExam().equals(exam)){
                return grade.getValeurA(t);
            }
        }
        return  0.0;
    }

    public double getCourseGrade(Course course, Student student, Instant t) {
        double gradeSum = 0.0;
        int coeffecientSum = 0;

        for (Grade grade : grades){
            if (grade.getStudent().equals(student) && grade.getExam().getCourse().equals(course)){
                double examGrade = grade.getValeurA(t);
                int coefficient = grade.getExam().getCoefficient();

                gradeSum += examGrade*coefficient;
                coeffecientSum += coefficient;
            }
        }
        if (coeffecientSum == 0){
            return 0.0;
        }
        return  gradeSum/coeffecientSum;
    }
}
