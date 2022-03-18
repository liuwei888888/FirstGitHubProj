package basic;

import java.util.Scanner;
import java.lang.Math;

public class Bank {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入本金：");
        double cash = input.nextDouble();
        System.out.printf("本金为：%.0f \n",cash);
        double first = 0.0225;
        double second = 0.027;
        double third = 0.0324;
        double fifth = 0.036;
        double finalCash ;

        //非复利计算，而是单利计算，即上一年的利息不计入下一年的本金中。

        finalCash = Deposit(cash,1,first);
        System.out.printf("存取一年后的本息是：%.1f \n",finalCash);
        finalCash = Deposit(cash,2,second);
        //finalCash = cash * (1+second*2) ;
        System.out.printf("存取两年后的本息是：%.1f \n",finalCash);
        finalCash = Deposit(cash,3,third);
        System.out.printf("存取三年后的本息是：%.1f \n",finalCash);
        finalCash = Deposit(cash,5,fifth);
        System.out.printf("存取五年后的本息是：%.1f \n",finalCash);
    }

    //main方法只能调用静态方法不能直接调用非静态方法。
    static double Deposit(double num,int n,double interestRate){
        double deposit = num*(1 + interestRate * n);
        return deposit;
    }
}
