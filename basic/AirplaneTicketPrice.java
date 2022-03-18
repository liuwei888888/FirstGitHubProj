package basic;

import java.util.Scanner;

public class AirplaneTicketPrice {
    public static void main(String[] args){
        double touristPrice = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您出行的月份：1~12：");
        int month = input.nextInt();
        if(month > 4 && month <10 ){
            System.out.println("请问您选择头等舱还是经济舱？头等舱输入1，经济舱输入2");
            int select = input.nextInt();
            switch (select){
                case 1:
                    touristPrice = 5000 * 0.9;
                    System.out.println("您的机票价格为：" + touristPrice);
                    break;
                case 2:
                    touristPrice = 5000 * 0.6;
                    System.out.println("您的机票价格为：" + touristPrice);
                    break;
            }
        }else{
            System.out.println("请问您选择头等舱还是经济舱？头等舱输入1，经济舱输入2");
            int select = input.nextInt();
            switch (select){
                case 1:
                    touristPrice = 5000 * 0.5;
                    System.out.println("您的机票价格为：" + touristPrice);
                    break;
                case 2:
                    touristPrice = 5000 * 0.4;
                    System.out.println("您的机票价格为：" + touristPrice);
                    break;
            }
        }
    }
}
