package com.teachmeskills.additional_tasks.task_1.model.register;

import com.teachmeskills.additional_tasks.task_1.model.interfaces.Registrable;

import java.util.ArrayList;
import java.util.List;

public class Register {
    List<Registrable> savedDocs = new ArrayList<>();

    public void save(Registrable document) {
        savedDocs.add(document);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int counter = 1;
        for (Registrable document : savedDocs) {
            builder.append(counter++);
            builder.append(". ");
            builder.append(document.toString());
            builder.append("\n");
        }
        return builder.toString();
    }
}