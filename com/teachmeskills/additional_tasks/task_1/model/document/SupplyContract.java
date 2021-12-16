package com.teachmeskills.additional_tasks.task_1.model.document;

import com.teachmeskills.additional_tasks.task_1.model.interfaces.Registrable;

import java.time.LocalDate;

public class SupplyContract extends Document implements Registrable {
    private String goodsType;
    private int goodsCount;

    public SupplyContract(String goodsType, int goodsCount, LocalDate documentDate) {
        this.goodsType = goodsType;
        this.goodsCount = goodsCount;
        this.documentDate = documentDate;
        documentNumber = nextDocumentNumber++;
    }

    public SupplyContract() {
        this("NO GOODS", 0, LocalDate.now());
    }

    @Override
    public String toString() {
        return "Supply contract : " +
                "documentNumber = " + documentNumber +
                ", goods type = '" + goodsType + '\'' +
                ", goods count = " + goodsCount +
                ", document date = " + documentDate;
    }
}