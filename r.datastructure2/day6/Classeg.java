package day6;

import java.util.ArrayList;

class Employee{
    int empid;
    String name;
    double salary;

    static int count; // belongs to class
    static int getcount(){
        return count;
    }



    Employee(){      // empty constructor
        empid = 0;
        name = "";
        salary = 0.0;
        count++;
    }


    Employee(int i, String n, double d){    // parameterized constructor
        empid = i; name = n; salary = d;
        count++;
    }


    void setData(int i, String n, double s){
        empid = i;
        name = n;
        salary = s;
    }
    void putdata(){
        System.out.println(empid);
        System.out.println(name);
        System.out.println(salary);
        }
        void incrementSalary(double inc){
            salary = salary+inc;
        }
    }
public class Classeg {
    public static void main(String[] args) {

        // Employee obj = new Employee();
        // obj.salary = 10;
        // obj.name = "name";
        // obj.empid = 1;
        // System.out.println(obj.salary);
        // System.out.println(obj.name);
        // System.out.println(obj.empid);

        // Employee obj2 = new Employee();    // empty constructor
        // obj2.setData(10, "Rajaganesh", 70000);
        // obj2.putdata();
        

        // Employee obj3 = new Employee(1, "Raja", 80000);  // parameterized constructor
        // obj3.putdata();


        // int ecount = Employee.getcount();
        // System.out.println("Total Employee :"+ecount);







        // obj.putdata();
        // obj.setData(1, "raja", 7000);
        // obj.putdata();
        // obj.incrementSalary(5000);
        // obj.putdata();

        ArrayList<Employee> emplist = new ArrayList<>();
        Employee obj1 = new Employee(1,"Raja", 70000);
        Employee obj2 = new Employee(2,"ganesh", 80000);
        emplist.add(obj1);
        emplist.add(obj2);
        for(Employee employee : emplist){  // for each method
            employee.putdata();
        }   
        for (int i = 0; i < emplist.size(); i++) {      // for i method
            Employee emp = emplist.get(i);
            emp.putdata();
        }











    }
}


 