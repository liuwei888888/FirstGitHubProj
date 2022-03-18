package basic;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入基本工资：");
        double primeSalary = input.nextDouble();
        System.out.println("该员工的工资细目为：");
        double thingsPrice = primeSalary*0.4;
        double rentWage = primeSalary*0.25;
        double sum = primeSalary + thingsPrice + rentWage;
        System.out.println("基本工资为：  " + primeSalary);
        System.out.println("物价津贴为：  " + thingsPrice);
        System.out.println("房租津贴为：  " + rentWage);
        System.out.println("员工薪水是：  " + sum);

    }
}
