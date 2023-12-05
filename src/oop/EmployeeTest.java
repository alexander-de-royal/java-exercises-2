package src.oop;

//Ex: A class is a collection of data members and methods
class Employee{
    int empNum;
    String empName;
    double empSalary;

    void setEmpDetails(int empNum, String empName, double empSalary){
        this.empNum = empNum;
        this.empName = empName; //hard coded data
        this.empSalary = empSalary;
    }
    void disEmpDetails(){
        System.out.println("Emp num = " + empNum);
        System.out.println("Emp name = " + empName);
        System.out.println("Emp salary = " + empSalary);
    }
}
public class EmployeeTest {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setEmpDetails(111, "Raj", 8000.0);
        e1.disEmpDetails();

        Employee e2 = new Employee();
        e2.setEmpDetails(222, "Ramu", 6000.0);
        e2.disEmpDetails();
    }
}
