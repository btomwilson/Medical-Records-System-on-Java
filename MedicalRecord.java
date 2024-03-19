package com.medicalrecords.model;

import java.time.LocalDate;

public class MedicalRecord {
    private LocalDate date;
    private String diagnosis;
    private String treatment;

    public MedicalRecord(LocalDate date, String diagnosis, String treatment) {
        this.date = date;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }
}
