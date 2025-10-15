package com.napier.sem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MySQL_Test_Integration_Test {
    MySQL_Test mytest;

    @BeforeEach
    void setUp() {
        mytest = new MySQL_Test();
        mytest.connect("localhost:33060", 10000);
    }

    @Test
    void testGetEmployee() {
        Employee emp = mytest.getEmployee(255530);
        assertEquals(255530, emp.emp_no);
        assertEquals("Ronghao", emp.first_name);
        assertEquals("Garigliano", emp.last_name);
    }

    @Test
    void testAddEmployee() {
        Employee emp = new Employee();
        emp.emp_no = 500000;
        emp.first_name = "Thinzar Phyo";
        emp.last_name = "Wai";
        mytest.addEmployee(emp);
        emp = mytest.getEmployee(500000);
        assertEquals(emp.emp_no, 500000);
        assertEquals(emp.first_name, "Thinzar Phyo");
        assertEquals(emp.last_name, "Wai");
    }
}
