package com.jia.demo7;

import java.util.Objects;

public class Hum {
    private int id;
    private String name;
    private int arg;
    private Double salary;

    public Hum() {
    }

    public Hum(int id, String name, int arg, Double salary) {
        this.id = id;
        this.name = name;
        this.arg = arg;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hum hum = (Hum) o;
        return arg == hum.arg && Objects.equals(id, hum.id) && Objects.equals(name, hum.name) && Objects.equals(salary, hum.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, arg, salary);
    }

    @Override
    public String toString() {
        return "Hum{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", arg=" + arg +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArg() {
        return arg;
    }

    public void setArg(int arg) {
        this.arg = arg;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
