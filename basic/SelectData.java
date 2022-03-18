package basic;

import java.util.Scanner;

public class SelectData {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //int num = input.nextInt();
        while(true){
            System.out.print("请输入数字0-7(输入0结束)：");
            //prinln  让下一行语句在屏幕上另起一行开始。对它上一行的语句不影响。
            //System.out.println("请输入数字0-7(输入0结束)：");
            int num = input.nextInt();
            switch(num){
                case 1:
                    System.out.println("MON");
                    break;
                case 2:
                    System.out.println("TUE");
                    break;
                case 3:
                    System.out.println("WED");
                    break;
                case 4:
                    System.out.println("THU");
                    break;
                case 5:
                    System.out.println("FRI");
                    break;
                case 6:
                    System.out.println("SAT");
                    break;
                case 7:
                    System.out.println("SUN");
                    break;
                case 0:
                    //System.out.println("SUN");
                    System.out.println("程序结束！");
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入！");
                    continue;
            }
            if(num == 0){
                break;
            }
        }
    }
}
