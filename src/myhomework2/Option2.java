package myhomework2;

public class Option2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 20; i <= 40; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
