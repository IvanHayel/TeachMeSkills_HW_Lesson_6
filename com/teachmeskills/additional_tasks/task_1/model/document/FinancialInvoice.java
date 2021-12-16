package com.teachmeskills.additional_tasks.task_1.model.document;

import com.teachmeskills.additional_tasks.task_1.model.interfaces.Registrable;

import java.time.LocalDate;

public class FinancialInvoice extends Document implements Registrable {
    private double totalAmount;
    private LocalDate documentDate;
    private String departmentID;

    public FinancialInvoice(double totalAmount, LocalDate documentDate, String departmentID) {
        this.totalAmount = totalAmount;
        this.documentDate = documentDate;
        this.departmentID = departmentID;
        documentNumber = nextDocumentNumber++;
    }

    public FinancialInvoice() {
        this(0, LocalDate.now(), "NO_DEP");
    }

    @Override
    public String toString() {
        return "Financial invoice: " +
                "total amount = " + totalAmount +
                ", document date = " + documentDate +
                ", document number = " + documentNumber +
                ", department id = '" + departmentID + '\'';
    }
}