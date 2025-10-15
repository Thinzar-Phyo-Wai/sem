package com.napier.sem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class MySQL_Test_Unit_Test {

    MySQL_Test mytest;

    @BeforeEach
    void setUp() {
        mytest = new MySQL_Test();
    }

    @Test
    void printSalariesTestNull() {
        mytest.printSalaries(null);
    }

    @Test
    void printSalariesTestEmpty() {
        ArrayList<Employee> employess = new ArrayList<Employee>();
        mytest.printSalaries(employess);
    }

    @Test
    void printSalariesTestContainsNull() {
        ArrayList<Employee> employess = new ArrayList<Employee>();
        employess.add(null);
        mytest.printSalaries(employess);
    }

    @Test
    void printSalaries() {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Employee emp = new Employee();
        emp.emp_no = 1;
        emp.first_name = "Kevin";
        emp.last_name = "Chalmers";
        emp.title = "Engineer";
        emp.salary = 55000;
        employees.add(emp);
        mytest.printSalaries(employees);
    }
}