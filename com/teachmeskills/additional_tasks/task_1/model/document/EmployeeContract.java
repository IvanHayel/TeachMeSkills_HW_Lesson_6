package com.teachmeskills.additional_tasks.task_1.model.document;

import com.teachmeskills.additional_tasks.task_1.model.interfaces.Registrable;

import java.time.LocalDate;

public class EmployeeContract extends Document implements Registrable {
    private LocalDate expirationDate;
    private String employeeName;

    public EmployeeContract(LocalDate documentDate, LocalDate expirationDate, String employeeName) {
        this.documentDate = documentDate;
        this.expirationDate = expirationDate;
        this.employeeName = employeeName;
        documentNumber = nextDocumentNumber++;
    }

    public EmployeeContract() {
        this(LocalDate.now(), LocalDate.now().plusYears(1), "John Doe");
    }

    @Override
    public String toString() {
        return "Employee contract: " +
                "document number = " + documentNumber +
                ", document date = " + documentDate +
                ", expiration date = " + expirationDate +
                ", employee name = '" + employeeName + '\'';
    }
}