package collection;

import java.util.ArrayList;
import java.util.HashMap;

public class Employee {
    Integer id;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    Employee(int id, String name){
        this.id=id;
        this.name=name;

    }
//    @Override
//    public String toString() {
//        return "Employee [id=" + id + ", name=" + name + "]";
//    }
    public static void main(String[] args) {
        ArrayList<Integer> iz = new ArrayList<>();
        iz.add(new Integer(10));
        System.out.println(iz);

        ArrayList<String> str = new ArrayList<>();
        str.add(new String("Joshua"));
        System.out.println(str);

        // Employee e1 = new Employee(2, "Swaroop");
        //  emp.add(e1);
        ArrayList<Employee> al= new ArrayList<>();
        al.add(new Employee(1,"joshua"));
        al.add(new Employee(3, "john"));
        al.add(new Employee(4, "Michel"));
        al.add(new Employee(5, "kane"));


       System.out.println(al);

        for (Employee employee:al) {
            System.out.print(employee.getId());
            System.out.print("  ");
            System.out.print(employee.getName());
            System.out.println();
        }

        HashMap<Integer, String> mp = new HashMap<>();
        for (Employee e: al) {
            mp.put(e.id, e.name);
        }

         System.out.println(mp);
    }

}