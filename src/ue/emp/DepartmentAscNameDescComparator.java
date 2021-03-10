package ue.emp;

import java.util.Comparator;

public class DepartmentAscNameDescComparator implements Comparator<Employee> {

  @Override
  public int compare(Employee o1, Employee o2) {
    //check first sort criteria
    int cmpDept = o1.getDepartment().compareTo(o2.getDepartment());
    // check if dept same value ?
    if(cmpDept == 0) {
      //check second sort criteria
      return o2.getName().compareTo(o1.getName());
    }
    return cmpDept;
  }

}
