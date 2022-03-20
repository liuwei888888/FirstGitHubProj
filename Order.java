
import java.util.Scanner;

public class Order {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//用户数据存储
		String[] names = new String[6];                 //用户姓名
		String[] dishMegs = new String[6];				//订单菜品及份数
		int[] times = new int[6];						//送餐时间
		String[] addresses = new String[6];			    //送餐地址		
		int[] states = new int[6];						//订单状态
		double[] sumPrices = new double[6];				//保存订单总金额
		
		//初始化一组用户数据作为检查
		names[0] = "张三";
		dishMegs[0] = "红烧带鱼  2份";
		times[0] = 12;
		addresses[0] = "天成路102号";
		sumPrices[0] = 76.0;
		states[0] = 1;
		
		//系统内数据存储
		String[] dishName = new String[] {"红烧带鱼","鱼香肉丝","时令蔬菜"};
		double[] dishPrice = new double[] {38.0,20.0,10.0};
		int[] count = new int[] {0,1,0};
		
		boolean flag = true;                            //系统状态
		int selectNum = 0;								//用户选择
		int userFlag = -1;
		
		
		System.out.println("欢迎使用“吃货联盟订餐系统”");
		//do-while框架
		do {
			System.out.println("************************");
			System.out.println("1、我要订餐");
			System.out.println("2、查看餐袋");
			System.out.println("3、签收订单");
			System.out.println("4、删除订单");
			System.out.println("5、我要点赞");
			System.out.println("6、退出系统");
			System.out.println("************************");
			
			System.out.print("请进行选择：(1-6):");
			selectNum = input.nextInt();
			while(selectNum < 1 || selectNum > 6){
				System.out.println("您的输入有误，请重新输入！");
				System.out.print("请进行选择：(1-6):");
				selectNum = input.nextInt();
			}
			
			switch(selectNum) {
				//订餐模块
				case 1:
					System.out.println("************************");
					System.out.println("***我要订餐***");
					int isFlag = -1;                                //标记订单是否创建
					for(int i = 0; i < names.length;i++) {
						if(names[i] == null) {
							System.out.print("请输入点餐人姓名：");
							names[i] = input.next();
							
							//遍历输出系统菜单
							System.out.println("序号" + "\t" + "菜名" + "\t  " + "单价" + "\t  " + "点赞数");
							for(int j = 0;j < dishName.length;j++) {
								System.out.println((j+1) + "\t" + dishName[j] + "\t  " + dishPrice[j] + "\t   " + count[j]);
							}
							
							//用户创建订单信息
							System.out.print("请选择您要点的菜品序列号：");
							int num1 = input.nextInt();
							System.out.print("请选择你需要的份数：");
							int num2 = input.nextInt();
							while(true) {
								System.out.print("请输入送餐时间（送餐时间是10点至20点之间的整点送餐）：");
								times[i] = input.nextInt();
								if(times[i] >= 10 && times[i] <= 20) {
									break;
								}else {
									System.out.println("您选择的时间不在送餐时间范围，请重新选择！");
								}
							}
							System.out.print("请输入送餐地址：");
							addresses[i] = input.next();
							System.out.println("订餐成功！");
							
							//存储用户信息并输出
							dishMegs[i] = dishName[num1 - 1] + "  " + num2 + "份";
							if(dishPrice[num1 - 1] * num2 >= 50) {
								sumPrices[i] = dishPrice[num1 - 1] * num2;
								System.out.println("餐费：" + dishPrice[num1 - 1] * num2 + "元，送餐费：0.0元" + "，总计：" + sumPrices[i] + "元");
							}else {
								sumPrices[i] = dishPrice[num1 - 1] * num2 + 5.0;
								System.out.println("餐费：" + dishPrice[num1 - 1] * num2 + "元，送餐费：5.0元" + "，总计：" + sumPrices[i] + "元");
							}
							System.out.println("您订的是：" + dishMegs[i]);
							System.out.println("送餐时间是:" + times[i] + "点");
							isFlag = 0;
							break;
						}
						if(isFlag == -1) {
							System.out.println("订单已满，请稍后再订餐！");
						}
						
					}	
					break;
					
				//查看餐袋模块	
				case 2:
					System.out.println("***查看餐袋***");
					for(int i = 0;i < names.length;i++) {
						if(names[i] != null) {
							System.out.println("序号" + "\t" + "订餐人" + "\t" + "餐品信息" + "\t\t" + "送餐时间" + "\t" + "送餐地址" + "\t\t" + "总金额" + "\t" + "订单状态");
							System.out.println((i+1) + "\t" + names[i] + "\t" + dishMegs[i] + "\t" + times[i] + "点" + "\t" + addresses[i] + "\t" + sumPrices[i] + "元" + "\t" + states[i]);
						}
					}
					break;
					
				//签收订单模块	
				case 3:
					System.out.println("***签收订单***");
					System.out.print("请选择要签收的订单：");
					int num = input.nextInt();
					if(names[num - 1] != null && states[num -1] == 0) {
						states[num - 1] = 1;
						System.out.println("订单签收成功！");
					}else if(names[num - 1] != null && states[num -1] == 1){
						System.out.println("您的订单已被签收,不能再次签收！");
					}else {
						System.out.println("您的订单不存在！");
					}
					
					break;
					
				//删除订单模块	
				case 4:
					System.out.println("***删除订单***");
					System.out.print("请选择要删除的订单的序号：");
					int num1 = input.nextInt();
					if(states[num1 -1] == 1 && names[num1 - 1] != null) {
						 for(int i = num1 -1;i < names.length - 1;i++) {
							 names[i] = names[i+1];
							 dishMegs[i] = dishMegs[i+1];
							 times[i] = times[i+1];
							 addresses[i] = addresses[i+1];
							 sumPrices[i] = sumPrices[i+1];
							 states[i] = states[i+1];
						 }
						 
						 names[names.length - 1] = null;
						 System.out.println("订单已成功删除！");
					}else if(states[num1 - 1] == 0 && names[num1 - 1] != null) {
						System.out.println("订单尚未签收，暂无法删除！");
					}else {
						System.out.println("您的订单不存在，无法删除！");
					}
					break;
					
				//点赞模块	
				case 5:
					System.out.println("***我要点赞***");
					System.out.println("序号" + "\t" + "菜名" + "\t  " + "单价");
					for(int j = 0;j < dishName.length;j++) {
						String a = count[j]>0?count[j] + "赞":"";
						System.out.println((j+1) + "\t" + dishName[j] + "\t  " + dishPrice[j] + "  " + a);
					}
					System.out.print("请选择您要点赞的菜品序号：");
					int num3 = input.nextInt();
					count[num3 - 1]++;
					System.out.println("点赞成功！");
					break;
					
					
				//退出系统模块	
				case 6:
					System.out.println("***退出系统***");
					System.out.println("感谢使用，再见！");
					flag = false;
					break;
					
			}
			
			//模块控制
			if(flag) {
				while(true) {
					System.out.println("输入0返回：");
					userFlag = input.nextInt();
					if(userFlag != 0) {
						System.out.println("输入有误！");
					}else {
						break;
					}
				}
			}else {
				break;
			}	
			
		}while(userFlag == 0);
		
		
	}

}
