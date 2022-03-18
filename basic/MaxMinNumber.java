package basic;

import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int max = 0;
        int min = 0;
        System.out.println("请输入一个整数（输入0结束）：");
        int num = input.nextInt();
        if(num == 0){
            return;
        }
        max = num;
        min = num;
        while(true){
            System.out.print("请输入一个整数（输入0结束）：");
            num = input.nextInt();
            if(num == 0) {
                break;
            }
            if(max < num){
                max = num;
            }
            if(min > num){
                min = num;
            }
        }
        System.out.println("最大值是：" + max + " " + "最小值是：" + min);

    }
}
