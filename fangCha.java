import java.util.Scanner;

public class fangCha {
    public static void main(String[] args) {
        System.out.println("==========欢迎来到方差计算器2.0.01==========");
        System.out.print("请输入需要计算的数字（用空格分隔）:");
        Scanner sc = new Scanner(System.in);
        // 读取整行输入//
        String input = sc.nextLine();
        // 分割成数组//
        String[] numbers = input.split(" ");
        //定义输入原始计算数据数组(动态初始化)//
        double[] fangChaArr = new double[numbers.length];
        //这个for执行写入数据至数组//
        for (int i = 0; i < fangChaArr.length; i++) {
            fangChaArr[i] = Double.parseDouble(numbers[i]);
        }
        double add = 0; //定义原始数据和//
        double pingJun = 0; //定义原始数据平均数//
        double fangChaAdd = 0; //定义方差数组输入数据之和//
        double fangCha = 0; //定义方差结果//
        //这个for执行计算原始数据的和//
        for (int i = 0; i < fangChaArr.length; i++) {
            add += fangChaArr[i];
        }
        //计算原始数据平均数//
        pingJun = add / fangChaArr.length;
        //定义方差数组(动态初始化)
        double[] fangChaArrFang = new double[fangChaArr.length];
        //这个for写入输入数组中数与平均值差的平方，写入数组为方差数组//
        for (int i = 0; i < fangChaArrFang.length; i++) {
            fangChaArrFang[i] = (pingJun - fangChaArr[i]) * (pingJun - fangChaArr[i]);
        }
        //这个for执行方差数组中的数总和//
        for (int i = 0; i < fangChaArrFang.length; i++) {
            fangChaAdd += fangChaArrFang[i];
        }
        //这个语句执行方差数组中数的平均数，即方差//
        fangCha = fangChaAdd / fangChaArrFang.length;
        //打印结果//
        System.out.println("输入数的方差为" + fangCha);
        System.out.println("                                    power by longCat233");
    }
}
