package myhomework3;

public class Option2 {
    public static void main(String[] args) {
        //        Вывести кого больше четных или нечетных:
        int quantityOddNumber = 0;
        int quantityEvenNumber = 0;
        int[] nums = {1,4,6,4,5};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                quantityEvenNumber++;
            } else if (nums[i] % 2 == 1) {
                quantityOddNumber++;
            }
        }
        if(quantityEvenNumber++>quantityOddNumber++){
            System.out.println("Четных чисел больше");
        }else if(quantityOddNumber++>quantityEvenNumber++){
            System.out.println("Нечетных чисел больше");
        }

    }
}
