import java.util.Random;

public class numArray {
    public static void main(String[] args){
        Random ra = new Random();
        double add = 0.0;
        int count = 0;
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int rand100 = ra.nextInt(101);
            arr[i] = rand100;
            add +=arr[i];
            System.out.println(arr[i]);
        }
        System.out.println("总和为：" + add);
        System.out.println("平均数为" + (add / arr.length));
        for (int j : arr) {
            if (j > (add / arr.length)) {
                count++;
            }
        }
        System.out.println("比平均数大的数有：" + count);
    }
}