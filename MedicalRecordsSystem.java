package com.medicalrecords;

import com.medicalrecords.model.MedicalRecord;
import com.medicalrecords.model.Patient;

import java.time.LocalDate;

public class MedicalRecordsSystem {
    public static void main(String[] args) {
        Patient patient = new Patient("John Doe", 35);

        // Adding medical records
        patient.addMedicalRecord(new MedicalRecord(LocalDate.of(2022, 3, 15), "Fever", "Prescribed antibiotics"));
        patient.addMedicalRecord(new MedicalRecord(LocalDate.of(2023, 6, 20), "Fractured arm", "Applied cast"));

        // Displaying medical records for the patient
        System.out.println("Medical Records for Patient: " + patient.getName());
        for (MedicalRecord record : patient.getMedicalRecords()) {
            System.out.println("Date: " + record.getDate());
            System.out.println("Diagnosis: " + record.getDiagnosis());
            System.out.println("Treatment: " + record.getTreatment());
            System.out.println();
        }
    }
}
