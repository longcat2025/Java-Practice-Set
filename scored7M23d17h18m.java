package 练习合集;

import java.util.Random;

public class scored7M23d17h18m {
    public static void main(String[] args) {
        scored();
    }

    public static void scored() {
        Random ra = new Random();
        int[] scored1 = new int[6];

        for (int i = 0; i < scored1.length; i++) {
            int scored = ra.nextInt(101);
            scored1[i] = scored;
        }
        int max = scored1[0];
        int low = scored1[0];
        for (int i = 0; i < scored1.length; i++) {
            if (max < scored1[i]) {
                max = scored1[i];
            }
            if (low > scored1[i]) {
                low = scored1[i];
            }
        }
        int temp = 0;
        int singleScored = 0;
        for (int i = 0; i < scored1.length; i++) {
            singleScored = scored1[i];
            temp += singleScored;
        }
        int res = (temp - low - max);
        double result = (double) res / (scored1.length - 2);
        System.out.println(result);
    }

}

