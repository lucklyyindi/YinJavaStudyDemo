import java.io.*;

public class Person {
    public String name;
    private double salary;
    private  int age ;
    public Person (String empName){
        name = empName;
    }
    public void setSalary(double empSal){
        salary = empSal;
    }
    public void setAge (int empAge){
        age = empAge;
    }

    public void printEmp(){
        System.out.println("名字 : " + name );
        System.out.println("薪水 : " + salary);
        System.out.println("年龄:" + age);
    }

    public static void main(String[] args){
        Person empOne = new Person("RUNOOB");
        empOne.setSalary(1000.0);
        empOne.printEmp();
        empOne.setAge(32);
    }
}

