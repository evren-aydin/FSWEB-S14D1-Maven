package com.workintech.developers;

public class JuniorDeveloper extends Employee{

    public JuniorDeveloper(long id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " Junior Developer starts to working");
        setSalary(getSalary());
    }
}
