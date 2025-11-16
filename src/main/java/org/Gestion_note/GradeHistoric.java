package org.Gestion_note;

import java.time.Instant;

public class GradeHistoric {
    private double oldValue;
    private double newValue;
    private Instant changeDate;
    private String motif;

    public GradeHistoric(double oldValue, double newValue, Instant changeDate, String motif) {
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.changeDate = changeDate;
        this.motif = motif;
    }

    public double getOldValue() {
        return oldValue;
    }

    public double getNewValue() {
        return newValue;
    }

    public Instant getChangeDate() {
        return changeDate;
    }

    public String getMotif() {
        return motif;
    }
}
