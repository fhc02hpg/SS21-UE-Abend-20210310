package ue.emp;

import java.util.Comparator;

public class SalaryDescComparator implements Comparator<Employee> {

  @Override
  public int compare(Employee o1, Employee o2) {
    return Double.compare(o2.getSalary(),o1.getSalary());
  }

}
