package basic;

public class ExchangCard {
    public static void main(String[] args){
        int lefthandCard = 10;
        int righthandCard = 8;
        System.out.println("输出互换前手中的纸牌：");
        System.out.println("左手中的纸牌：" + lefthandCard);
        System.out.println("右手中的纸牌：" + righthandCard);
        //交换左手和右手中的纸牌。
        int temp = 0;
        temp = lefthandCard;
        lefthandCard = righthandCard;
        righthandCard = temp;
        System.out.println("输出互换后手中的纸牌：");
        System.out.println("左手中的纸牌：" + lefthandCard);
        System.out.println("右手中的纸牌：" + righthandCard);
    }
}
