package myhomework3;

public class Option1 {
    public static void main(String[] args) {
        //        1) Вывести на консоль сумму четных чисел этого массива:
        int sumEvenNums = 0;
        int[] nums = {1, 4, 6, 4, 5};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                sumEvenNums = sumEvenNums + nums[i];
            }
        }
        System.out.println("Сумма четных чисел массива:" + sumEvenNums);
    }
}
