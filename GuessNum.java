import java.util.Scanner;
import java.util.Random;
public class GuessNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        int number = ra.nextInt(100) + 1;
//1 - 100
        System.out.println("猜数字game");
        System.out.println("请输入1 ~ 100的整数");
        int A = 1;
            while(true) {
                System.out.println("请输入第" + A + "个数字");
                int input = sc.nextInt();
                if(input <= 100 && input >= 1){
                    if(input == number){
                        System.out.println("恭喜你,你对了");

                        break;
                    } else if (input > number) {

                        System.out.println("大了");

                    }else {
                        A++;
                        System.out.println("小了");

                    }
                }else {
                    System.out.println("noFound");
                    break;
                }
            }

        }

}
        

    
