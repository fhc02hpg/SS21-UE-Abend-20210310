package ue.emp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortEmployees {

    public static void main(String[] args) {

        Employee[] employees = {
            new Employee(123,"Emma",6_700.00,"Research"),
            new Employee(901,"John",5_500.00,"Sales"),
            new Employee(768, "Bruce",3_500.00,"Office"),
            new Employee(888,"Jane",4_900.00,"Sales"),
            new Employee(555, "Bob",3_500.00,"Administration"),
        };

        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees);

        System.out.println("default sort: "+Arrays.toString(employees));

        Arrays.sort(employees,new NameAscComparator() );

        System.out.println("name asc sort: "+Arrays.toString(employees));

        Arrays.sort(employees,new SalaryDescComparator() );

        System.out.println("salary desc sort: "+Arrays.toString(employees));

        Arrays.sort(employees, new DepartmentAscNameDescComparator() );

        System.out.println("department asc name desc sort: "+Arrays.toString(employees));

        Arrays.sort(employees, new SalaryAscNameAscComparator() );

        System.out.println("salary asc name asc sort: "+Arrays.toString(employees));
    }

}
