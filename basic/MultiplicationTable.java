package basic;

public class MultiplicationTable {
    public static void main(String[] args){
        //打印九九乘法表
        for(int i = 1;i <= 9;i++){
            for(int j = 1;j <= i;j++){
                System.out.printf("%d * %d = %d",i,j,i*j);
                System.out.print("\t");
            }
            //换行
            //System.out.print("\n");
            System.out.println();
        }

        //打印正方形
        /*for(int i = 1;i <= 5;i++){
            for(int j = 1;j <= 5;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }*/

        //打印菱形
        /*for(int i = 1;i <= 5;i++){
            for(int j = 1;j <= 5-i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k <= 2*i-1;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i = 4;i >= 1;i--){
            for(int j = 1;j <= 5-i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k <= 2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //打印平行四边形
        for(int i = 1;i <= 5;i++){
            for(int j = 1;j <= 5-i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k <= 4;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
