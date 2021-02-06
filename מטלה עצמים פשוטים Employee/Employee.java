package com.company;
import java.util.ArrayList;

public class Employee {

    String name;
    int salary;
    int seniority;

    public Employee(String name, int salary, int seniority) {
        this.name = name;
        this.salary = salary;
        this.seniority = seniority;


    }

    public Float efficency(){
        return (float)(salary/seniority);
    }

    public ArrayList<Employee> filter(ArrayList<Employee> allEmployees){

        ArrayList<Employee> res = new ArrayList<Employee>();
        for(Employee e : allEmployees){
            if(e.salary<15000 && e.seniority>10) res.add(e);
        }
        return res;
    }
}

