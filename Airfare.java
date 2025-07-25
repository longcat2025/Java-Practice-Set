
package 练习合集;

import java.util.Scanner;
public class Airfare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //数据获取区
        System.out.println("请输入原价");
        double yuanJia = sc.nextDouble();
        System.out.println("请输入月份");
        int yueFen = sc.nextInt();

        System.out.println("请输入舱类，1为头等舱/2为经济舱");
        int cangWei = sc.nextInt();
        double result = 0;
        //逻辑运算区
        if (yuanJia > 0){
            if(yueFen >= 5 && yueFen <= 10){
                result = getResult(cangWei, result, yuanJia, 0.9, 0.85);
            } else if ((yueFen >= 11 && yueFen <= 12) || (yueFen <= 4 && yueFen >= 0)) {
                result = getResult(cangWei, result, yuanJia, 0.7, 0.65);
            }else {
                System.out.println("月份存在问题");
            }
        } else System.out.println("原价存在问题，不可能小于0");
        if (result != 0){
        System.out.println("最终价格为" + result);
        }

    }

    public static double getResult(int cangWei, double result, double yuanJia, double x, double x1) {
        if (cangWei == 1) {
            result = yuanJia * x;
        } else if (cangWei == 2) {
            result = yuanJia * x1;
        } else {
            System.out.println("输入舱类错误");
        }
        return result;
    }
}