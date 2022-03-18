package basic;

import java.util.Scanner;

public class BookFoodSystem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //定义数组对象保存订单信息
        String[] names = new String[4];
        String[] dishMegs = new String[4];
        int[] times = new int[4];
        String[] addresses = new String[4];
        int[] states = new int[4];
        double[] sumPrices = new double[4];
        int[] count = new int[]{0,0,0};
        String[] menu = new String[]{"红烧带鱼","鱼香肉丝","时令蔬菜"};
        double[] price = new double[]{38.0,20.0,10.0};

        //初始化两组数据便于检测系统运行情况
        names[0] = "张三";
        dishMegs[0] = "红烧鱼 2份";
        times[0] = 12;
        addresses[0] = "天津路10号";
        sumPrices[0] = 78.0;
        states[0] = 1;

        names[1] = "张三";
        dishMegs[1] = "小炒肉 2份";
        times[1] = 18;
        addresses[1] = "天成路207号";
        sumPrices[1] = 45.0;
        states[1] = 0;

        do{
            System.out.println("欢迎使用“吃货联盟订餐系统” ");
            System.out.println("****************************");
            System.out.println("1、我要订餐\n2、查看餐袋\n3、签收订单\n4、删除订单\n5、我要点赞\n6、退出系统");
            System.out.println("****************************");
            System.out.print("请选择：");
            int selectNum = input.nextInt();
//            break;

            switch(selectNum){
                case 1:
                    System.out.println("***我要订餐***");
                    double pay = 0.0;
                    double postPay = 5.0;
                    boolean flag = false;

                    for(int i =0; i<names.length;i++){
                        if(names[i] == null){
                            flag = true;
                            states[i] = 0;
                            System.out.print("请输入订餐人姓名：");
                            String name = input.next();
                            names[i] = name;
                            System.out.println("序号\t菜名\t\t单价\t点赞数\t");
                            for(int j = 0;j < menu.length;j++){
                                if(menu != null){
                                    System.out.println(j+1 + "\t" +"\t"+ menu[j] +"\t"+"\t"+price[j]+"元"+"\t"+count[j]);
                                }
                            }
                            System.out.print("请输入您要点的菜品编号：");
                            int a = input.nextInt();
                            System.out.print("请选择您需要的份数：");
                            int b = input.nextInt();
                            while(true) {
                                System.out.print("请输入送餐时间（送餐时间是10点至20点间整点送餐）：");
                                times[i] = input.nextInt();
                                if (times[i] <= 20 && times[i] >= 10) {
                                    break;
                                }else{
                                    System.out.println("请输入正确的送餐时间！");
                                }
                            }
                            System.out.print("请输入送餐地址：");
                            addresses[i] = input.next();
                            pay = price[a-1] * b;
                            if(pay >= 50){
                                postPay = 0.0;
                            }
                            sumPrices[i] = pay+postPay;
                            //java数组之间直接读入
                            dishMegs[i] = menu[a-1]+" "+b+"份";
                            System.out.println("订餐成功！");
                            System.out.println("您定的是："+menu[a-1]+" "+b+"份");
                            System.out.println("送餐时间："+times[i]+"点");
                            System.out.println("餐费："+pay+"元"+"，"+"送餐费"+postPay+"元"+"，"+"总计："+sumPrices[i]+"元");

                            System.out.print("输入0返回：");
                            while (true) {
                                selectNum = input.nextInt();
                                if (selectNum == 0) {
                                    break;
                                } else {
                                    System.out.println("非法操作，请正确输入！");
                                    System.out.print("输入0返回：");
                                }
                            }
                            break;
                        }
                    }
                    if(flag == false){
                        System.out.println("您的餐袋已满！");
                    }

                    break;
                case 2:
                    System.out.println("***查看餐袋***");

                     System.out.println("序号\t订餐人\t餐品信息\t\t送餐时间\t\t送餐地址\t\t总金额\t订单状态");
                     for (int i = 0; i < names.length; i++) {
                         String statesName = null;
                         if (states[i] == 1) {
                             statesName = "已完成";
                         } else {
                             statesName = "未完成";
                         }
                         if (names[i] != null) {
                             System.out.println(i + 1 + "\t" + "\t" + names[i] + "\t" + dishMegs[i] + "\t" + times[i] + "点" + "\t" + "\t" + addresses[i] + "\t" + sumPrices[i] + "元" + "\t" + statesName);
                         } else {
                             break;
                         }
                     }

                    System.out.print("输入0返回：");
                    while (true) {
                        selectNum = input.nextInt();
                        if (selectNum == 0) {
                            break;
                        } else {
                            System.out.println("非法操作，请正确输入！");
                            System.out.print("输入0返回：");
                        }
                    }

                    break;
                case 3:
                    System.out.println("***签收订单***");
                    System.out.println("请输入要签收的订单：");
                    int isSignFind = input.nextInt();
                    for(int i = 0;i<names.length;i++){
                        if(names[i] != null && isSignFind == i + 1 && states[i] == 0){
                            states[i] = 1;
                            System.out.println("您的订单已签收！");
                            break;
                        }else{
                            System.out.println("请检查您的订单序号！");
                        }
                    }

                    System.out.print("输入0返回：");
                    while (true) {
                        selectNum = input.nextInt();
                        if (selectNum == 0) {
                            break;
                        } else {
                            System.out.println("非法操作，请正确输入！");
                            System.out.print("输入0返回：");
                        }
                    }

                    break;
                case 4:
                    System.out.println("***删除订单***");
                    System.out.println("请输入要删除的订单号：");
                    int isNumDelete = input.nextInt();
                    boolean deletePoint = false;

                    for(int i = 0;i < names.length;i++){
                        if(names[i] != null && isNumDelete == i+1){
                            System.out.println("已找到要删除的订单号：" + (1+i) + "号");
                            deletePoint = true;
                            for(int j = i;j < names.length-1;j++){
                                names[j] = names[j+1];
                                dishMegs[j] = dishMegs[j+1];
                                times[j] = times[j+1];
                                addresses[j] = addresses[j+1];
                                sumPrices[j] = sumPrices[j+1];
                                states[j] = states[j+1];
                            }
                            names[names.length-1] = null;
                            break;
                        }
                    }
                    if(deletePoint == false){
                        System.out.println("未找到您输入的订单号！");
                    }

                    System.out.print("输入0返回：");
                    while (true) {
                        selectNum = input.nextInt();
                        if (selectNum == 0) {
                            break;
                        } else {
                            System.out.println("非法操作，请正确输入！");
                            System.out.print("输入0返回：");
                        }
                    }

                    break;
                case 5:
                    System.out.println("***我要点赞***");
                    System.out.println("序号\t菜名\t\t单价\t点赞数\t");
                    for(int j = 0;j < menu.length;j++){
                        if(menu != null){
                            System.out.println(j+1 + "\t" +"\t"+ menu[j] +"\t"+"\t"+price[j]+"元"+"\t"+count[j]);
                        }
                    }
                    System.out.print("请您输入要点赞的菜品序号：");
                    int isCount = input.nextInt();
                    if(isCount <= menu.length){
                        count[isCount-1]++;
                        System.out.println("您给" + isCount +"号菜品点赞成功！");
                    }else{
                        System.out.println("您输入的菜品编号有误！");
                    }

                    System.out.print("输入0返回：");
                    while (true) {
                        selectNum = input.nextInt();
                        if (selectNum == 0) {
                            break;
                        } else {
                            System.out.println("非法操作，请正确输入！");
                            System.out.print("输入0返回：");
                        }
                    }

                    break;
            }

            //do-while循环控制
            if(selectNum == 0){
                continue;
            }else{
                System.out.println("谢谢使用，欢迎下次光临！");
                break;
            }

        }while(true);


    }
}
