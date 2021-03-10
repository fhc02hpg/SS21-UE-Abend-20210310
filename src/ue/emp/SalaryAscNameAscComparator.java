package ue.emp;

import java.util.Comparator;

public class SalaryAscNameAscComparator implements Comparator<Employee> {

  @Override
  public int compare(Employee o1, Employee o2) {
    //check first sort criteria
    int cmpSalary = Double.compare(o1.getSalary(),o2.getSalary());
    // check if salary same value ?
    if(cmpSalary == 0) {
      //check second sort criteria
      return o1.getName().compareTo(o2.getName());
    }
    return cmpSalary;
  }

}
