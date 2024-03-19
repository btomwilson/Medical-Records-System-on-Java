package com.medicalrecords.model;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String name;
    private int age;
    private List<MedicalRecord> medicalRecords;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.medicalRecords = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<MedicalRecord> getMedicalRecords() {
        return medicalRecords;
    }

    public void addMedicalRecord(MedicalRecord medicalRecord) {
        medicalRecords.add(medicalRecord);
    }
}
