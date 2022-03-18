package basic;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayDefine {
    public static void main(String[] args){
        /*double scores[] = new double[]{1.1,2.2,3.3,4.4,5.5,6.6};
        for(double i:scores){//变量i与数组内的数据类型同类型，因为i此时是用来存储遍历数组中的元素；
            System.out.println(i);
        }*/
        /*Scanner input = new Scanner(System.in);
        int scores[] = new int[5];
        float totalScore = 0;
        float averageScore = 0;
        int maxScore = 0;
        int minScore = 0;
        System.out.println("请输入5个学生的笔试成绩：");
        scores[0] = input.nextInt();
        maxScore = scores[0];
        minScore = scores[0];
        totalScore += scores[0];
        for(int i = 1;i < 5;i++){
            scores[i] = input.nextInt();
            if(maxScore < scores[i]){
                maxScore = scores[i];
            }
            if(minScore > scores[i]){
                minScore = scores[i];
            }
            totalScore += scores[i];
        }
        System.out.printf("总成绩：%.1f \n",totalScore);
        averageScore = totalScore/scores.length;
        System.out.println("最高分：" + maxScore);
        System.out.println("最低分：" + minScore);
        System.out.printf("平均分：%.1f \n",averageScore);*/

        /*int a[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(a));

        int c[][] = new int[][]{{1,2,3},{1,2,3},{1,2,3}};

        System.out.println(Arrays.toString(c[1]));*/

        Scanner input = new Scanner(System.in);
        String fiveWords[] = new String[5];
        System.out.println("输入5句话：");
        for(int i = 0;i < fiveWords.length;i++){
            System.out.print("第" + (i+1) + "句话：");
            fiveWords[i] = input.next();
        }
        System.out.println("逆序输出5句话：");
        for(int j = fiveWords.length-1;j >= 0;j--){
            System.out.print("第" + (5-j) + "句话：" + fiveWords[j] + "\n");  //4+1=5;3+2=5;下标总数是固定的。
        }

    }
}
