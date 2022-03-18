package basic;

import java.util.Arrays;

public class CreatNewArray {
    public static void main(String[] args){
        /*int[] array = new int[]{1,3,-1,5,-2};
        int[] newArray = Arrays.copyOf(array,5);
        Arrays.sort(newArray);    //Arrays类中的sort方法，自动对传入的数组作升序排序；
        System.out.println("原数组：");
        System.out.println(Arrays.toString(array));
        System.out.println("排序后的数组");
        System.out.print(Arrays.toString(newArray));*/
        int[] a = {1,2,3};
        int[] b = java.util.Arrays.copyOf(a, 10);//copyOf 方法允许拷贝出比原数组长度还长的新数组，超出长度的内容用0、null等填充这要看原数组的数据类型
        for(int s : a){
            System.out.println("原数组元素："+s);
        }
        for(int s : b){
            System.out.println("新数组元素："+s);
        }


    }
}
