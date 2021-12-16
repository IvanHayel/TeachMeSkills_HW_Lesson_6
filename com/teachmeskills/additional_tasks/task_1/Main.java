package com.teachmeskills.additional_tasks.task_1;

import com.teachmeskills.additional_tasks.task_1.model.document.EmployeeContract;
import com.teachmeskills.additional_tasks.task_1.model.document.FinancialInvoice;
import com.teachmeskills.additional_tasks.task_1.model.document.SupplyContract;
import com.teachmeskills.additional_tasks.task_1.model.interfaces.Registrable;
import com.teachmeskills.additional_tasks.task_1.model.register.Register;

import java.time.LocalDate;

/**
 * Create a system for accounting documents.
 * Create class Register, which will have methods:
 * - saving the document in the register
 * - providing information about the document
 * <p>
 * The system can work with three types of documents:
 * 1. Contract for the supply of goods
 * Contains fields:
 * - Document Number
 * - Type of goods
 * - Number of goods
 * - Document date
 * <p>
 * 2. Contract with an employee
 * Contains fields:
 * - Document Number
 * - Document date
 * - Document date
 * - Contract expiration date
 * - Employee name
 * <p>
 * 3. Financial invoice
 * Contains fields:
 * - The total amount for the month
 * - Document date
 * - Document Number
 * - Department code
 * <p>
 * - The register class must contain an array inside itself, and when adding a document to the register, this added document must be added to the array;
 * - The array for the register class must be of size 10;
 * - For "Document Date" fields, the Date data type should be used;
 * - In the method of providing information about the document, it should display information about the document passed by the input parameter
 * (for this, the toString () method should be overridden in the class describing the document);
 * - Each class for describing documents must contain a constructor with and without parameters;
 * - To simulate the operation of the system, create a class Main, which will contain only one method public static void main
 * In this method, write the code to create each of the document types, add them to the register, and display information about the document;
 * - Place all classes in packages
 * - When performing the task, use the concepts of interfaces and abstract classes.
 */

public class Main {
    public static void main(String[] args) {
        Registrable supplyContract = new SupplyContract();
        Registrable employeeContract =
                new EmployeeContract(LocalDate.now().minusDays(150), LocalDate.now().plusYears(5), "Jack Sparrow");
        Registrable financialInvoice = new FinancialInvoice(5000, LocalDate.now(), "IT_PROG");

        Register register = new Register();
        register.save(supplyContract);
        register.save(employeeContract);
        register.save(financialInvoice);

        System.out.println("Saved documents.");
        System.out.println(register);
    }
}