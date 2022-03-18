package basic;

import java.util.Scanner;

public class StatisticNumber {
    public static void main(String[] args){
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int countIllegal = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入10个数字：");
        int array[] = new int[10];
        for(int i=0;i < array.length;i++){
            array[i] = input.nextInt();
        }
        System.out.print("输入的10个数字为：");

        for(int i = 0;i < array.length;i++ ){
            System.out.print(array[i] + "\t");
        }
        System.out.print("\n");
        for(int i:array){
            if(i == 1){
                count1++;
            }else if(i == 2){
                count2++;
            }else if(i == 3){
                count3++;
            }else{
                countIllegal++;
            }
        }
        System.out.println("数字1的个数：" + count1);
        System.out.println("数字2的个数：" + count2);
        System.out.println("数字3的个数：" + count3);
        System.out.println("非法数字的个数：" + countIllegal);
    }
}
