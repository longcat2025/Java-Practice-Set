package 练习合集;

import java.util.Random;
import java.util.Scanner;

public class CAPTCHA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = password();
        System.out.println("当前验证码为" + result);
        System.out.println("请输入相同验证码");
        String input = sc.next();
        if(result.equals(input)){
            System.out.println("pass");
        }else {
            System.out.println("noPass");
        }
    }
    public static String password(){
        String result = "";
        Random ra = new Random();
        char[] chars = new char[52];
        //
        for (int i = 0; i < chars.length; i++) {
            if(i <= 25){
                chars[i] = (char) (97 + i);
            }else {
                chars[i] = (char) (65 + i - 26);
            }
        }
        //
        for (int i = 0; i < 4; i++) {
            int randChar = ra.nextInt(chars.length);
            result = result + chars[randChar];
        }

        int num = ra.nextInt(10);
        result = result + num;
        return result;
    }
}
