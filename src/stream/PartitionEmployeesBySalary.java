package stream;/*
package stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEmployeesBySalary {
    class Employee{
        int salary;
        static public List<Employee> getEmployees(){
            return null;
        }

        public int salary() {
        }
    }
    public static void main(String[] args) {
        //Partition Employees by Salary (>30k and <=30k)
        Map<Boolean, List<Employee>> partition = Employee.getEmployees()
            .stream()
            .collect(Collectors.partitioningBy(e -> e.salary() > 30000));

        System.out.println("Employees with salary > 50k:");
        partition.get(true).forEach(System.out::println);
    }
}
*/
