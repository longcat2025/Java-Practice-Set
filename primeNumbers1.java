package 练习合集;

import java.util.Scanner;

public class primeNumbers1 {
    public static void main(String[] args) {
        System.out.println("welcome to 求质数程序，请输入相应正整数");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入起始数");
        int from = sc.nextInt();
        int count = 0;
        System.out.println("请输入终止数");
        int to = sc.nextInt();
        for (int i = from; i <= to; i++) {
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    count++;
                    break;
                }
            }
        }
        System.out.println(from + " ~ " + to + "的范围" + "质数个数为： " + (to - from + 1 - count));


    }
}
