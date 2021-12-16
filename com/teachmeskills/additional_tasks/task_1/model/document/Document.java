package com.teachmeskills.additional_tasks.task_1.model.document;

import java.time.LocalDate;

abstract public class Document {
    protected static int nextDocumentNumber = 1;

    protected int documentNumber;
    protected LocalDate documentDate;
}